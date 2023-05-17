package Project;

import java.sql.SQLException;

public class ProjectDAO {
	
	public boolean loginDAO(String id, String pw) {
		DBC dbc = new DBC();
		try {
			dbc.DBConnect();
			dbc.ps=dbc.conn.prepareStatement("SELECT USER_ID,USER_PW from USERLIST where USER_ID=? and USER_PW=?" );
			dbc.ps.setString(1, id);
			dbc.ps.setString(2, pw);
			dbc.rs=dbc.ps.executeQuery();
			if(dbc.rs.next()) {
				if(id.equals(dbc.rs.getString("USER_ID"))&&pw.equals(dbc.rs.getString("USER_PW"))) {
					return true;
				}	
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbc.dbClose();
		}
		return false;
	}
}
