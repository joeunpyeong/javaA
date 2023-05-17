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
				System.out.println("다음에 접속됨"+conn.getMetaData().getDatabaseProductVersion());
			}
		} catch (ClassNotFoundException e) {
			System.out.println(" 오라클 드라이버가 준비가 안되어서 사용이 불가능한 PC입니다.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(" 알수없는 오류발생! 개발자에게 문의하세요 ");
		}
	}
}

