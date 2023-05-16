package pack07.last.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs; 
	
	//����Ĵݱ�ó���� �� ����
	public Connection getConn() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hanul", "0000");
		} catch (Exception e) {
			System.out.println(" �˼����� �����߻�! �����ڿ��� �����ϼ��� ");
		}
		return conn;
	}

	public void dbClose() {
		try {
			if(rs != null ) { rs.close() ; }
			if(ps != null ) {ps.close();}
			if(conn != null ) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	
	public void selectList() {
		try {
			conn = getConn();//DB ���ᰴü �ʱ�ȭ ��Ű��
			ps = conn.prepareStatement(" select * from board ");
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("BOARD_NO"));
			}
			
		} catch (SQLException e) {
			System.out.println("kymSqlplus Exception : " + e.getMessage());
		} finally {
			// conn , ps , rs ������ ��ü ���� null�� ��������.(DB Close)
			dbClose();
		}
	}
	
	public void selectList(String keyword) {
		try {
			conn = getConn();//DB ���ᰴü �ʱ�ȭ ��Ű��
//			ps = conn.prepareStatement(" SELECT * FROM BOARD WHERE BOARD_TITLE = '"+ keyword +"'" + 
//			"AND " +  keyword ); // <= �Ķ���͸� String���¿� ������Ѽ� ����Ϸ��� �������� ������.
			ps = conn.prepareStatement(" SELECT * FROM BOARD WHERE BOARD_TITLE = ? " );
			ps.setString(1, keyword);//?�� �Ǿ��ִ� �Ķ���ͺο� �����͸� �ִ°� . ( ���ʱ������� �ߺ��鼭 ?�� ������ ����ȴ�)
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("BOARD_NO"));
			}
			
		} catch (SQLException e) {
			System.out.println("kymSqlplus Exception : " + e.getMessage());
		} finally {
			// conn , ps , rs ������ ��ü ���� null�� ��������.(DB Close)
			dbClose();
		}
	}
	
	public void insertBoard() {
		try {
			conn = getConn();//DB ���ᰴü �ʱ�ȭ ��Ű��
			ps = conn.prepareStatement(" INSERT INTO BOARD (BOARD_NO, BOARD_TITLE, BOARD_CONTENT) "
					+ "VALUES (10, ?, ? )");//����ڰ� ���� �ĺ��ڰ� �Ǵ� �� ��ȣ�� ���� �Է��� �ұ�?
											//�Ѵ� vs ���Ѵ� ���?
			ps.setString(1, "java?title");
			ps.setString(2, "java?content");
			//rs = ps.executeQuery();
			int result = ps.executeUpdate();
			System.out.println(result);
			
		} catch (SQLException e) {
			System.out.println("kymSqlplus Exception : " + e.getMessage());
		} finally {
			// conn , ps , rs ������ ��ü ���� null�� ��������.(DB Close)
			dbClose();
		}
	}
	

}
