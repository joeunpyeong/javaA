package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBC {
	
	public Connection conn;
	public PreparedStatement ps;
	public ResultSet rs;
	
	public void dbClose() {
		try {
			if(rs!=null) {rs.close();}
			if(ps!=null) {ps.close();}
			if(conn!=null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void DBConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hanul", "0000");
			if(!conn.isClosed()) {
				System.out.println("������ ���ӵ�"+conn.getMetaData().getDatabaseProductVersion());
			}
		} catch (ClassNotFoundException e) {
			System.out.println(" ����Ŭ ����̹��� �غ� �ȵǾ ����� �Ұ����� PC�Դϴ�.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(" �˼����� �����߻�! �����ڿ��� �����ϼ��� ");
		}
	}
}

