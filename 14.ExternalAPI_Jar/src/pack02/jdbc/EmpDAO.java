package pack02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class EmpDAO { // ���� �����ͺ��̽��� �����Ͽ� �䱸���� ó�� �� ���� 
	private Connection conn; // ���ᰴü
	private PreparedStatement ps;// ���� ���� ��ü 
	private ResultSet rs ; //��� ��ü
	
	//'�����ͺ��̽� ������'�ϳ��� ������� ����� ��Ȱ�� ( �����ϸ� �״���=>ps�� ����Ѵ�. )
	public Connection getConn() {
		//���ӽ��ʿ��Ѱ� : ���� �ּ�(url) , ����(user) , ��ȣ(password)
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "hr";
		String password = "0000";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url , user , password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public void testDb() {
		conn=getConn();//���ᰴü �ʱ�ȭ
		String sql = "select 1 test from dual";
		
		try {
			ps= conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("���� ��� : "+rs.getInt("test"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<EmpDTO> selectEmp() {
		conn = getConn(); 
		String sql = " select EMPLOYEE_ID, FIRST_NAME|| ' '||LAST_NAME name, EMAIL FROM employees ";
		ArrayList<EmpDTO> list = new ArrayList<>();
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				EmpDTO dto = new EmpDTO(rs.getInt("EMPLOYEE_ID"),rs.getString("name"), rs.getString("email"));
				list.add(dto);
				System.out.println(rs.getInt("EMPLOYEE_ID")+" "+rs.getString("name"));
			}
			System.out.println(list.size());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
}
