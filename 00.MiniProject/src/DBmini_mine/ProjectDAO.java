package DBmini_mine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProjectDAO { 
	Scanner sc = new Scanner(System.in);
	
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	
	
	public int selectNum() {
		while(true) {
			try {
				int selectNum=Integer.parseInt(sc.nextLine());
				if(selectNum<0) {
					System.out.println("�ٽ��Է����ּ���");
					continue;
				}
				return selectNum;
			}catch (Exception e) {
				System.out.println("���ڸ� �Է����ּ���");
			}
		}
	}
	
	public void dbClose() {
		try {
			if(rs!=null) {rs.close();}
			if(ps!=null) {ps.close();}
			if(conn!=null) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Boolean getConn() {
		
		System.out.print("���̵� :");
		String id=sc.nextLine();
		System.out.print("��й�ȣ :");
		String pw=sc.nextLine();
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			if(!conn.isClosed()) {
				System.out.println("������ ���ӵ�"+conn.getMetaData().getDatabaseProductVersion());
				return true;
			}
		} catch (ClassNotFoundException e) {
			System.out.println(" ����Ŭ ����̹��� �غ� �ȵǾ ����� �Ұ����� PC�Դϴ�.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(" �˼����� �����߻�! �����ڿ��� �����ϼ��� ");
		}
		return false;
}
	
	
	public void displayList() {
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hanul", "0000");
			ps=conn.prepareStatement("select * from STORE ORDER BY code");
			rs=ps.executeQuery();
			System.out.println("�ڵ�\t��ǰ��\t\t����\t����");
			while(rs.next()) {
				System.out.print(" "+rs.getInt("code")+"\t");
				if(rs.getString("product").length()<=3)
					System.out.print(rs.getString("product")+"\t\t");
				else
					System.out.print(rs.getString("product")+"\t");
				System.out.println(rs.getInt("price")+"\t"+rs.getInt("cnt"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();	
		}	
	}
	
	
	public void addList() {
		try {
			displayList();
			System.out.println("��ǰ�� �̸��� �Է����ּ���");
			String product = sc.nextLine();
			System.out.println("��ǰ�� ������ �Է����ּ���");
			int price = Integer.parseInt(sc.nextLine());
			System.out.println("��ǰ�� ������ �Է����ּ���");
			int cnt = Integer.parseInt(sc.nextLine());
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hanul", "0000");
			ps=conn.prepareStatement("INSERT INTO STORE (CODE, PRODUCT, PRICE, CNT)VALUES ((SELECT NVL(MAX(code), 0) + 1 FROM HANUL),?,?,?)");
			ps.setString(1, product);
			ps.setInt(2, price);
			ps.setInt(3, cnt);
			ps.executeUpdate();
			System.out.println(product+" ǰ�� �߰���");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	
	
	public void updateList() {
		
		try {
			displayList();
			System.out.println("��ǰ�� �ڵ��ȣ�� �Է����ּ���");
			int code = selectNum();
			System.out.println("��ǰ�� ������ �Է����ּ���");
			int price = selectNum();
			System.out.println("��ǰ�� ������ �Է����ּ���");
			int cnt = selectNum();
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hanul", "0000");
			ps=conn.prepareStatement("UPDATE STORE SET price=?,cnt=? where code=?" );
			ps.setInt(1, price);
			ps.setInt(2, cnt);
			ps.setInt(3, code);
			ps.executeUpdate();
			System.out.println("������");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			dbClose();
		}
	}
	
	
	
	public void delete() {
		
		displayList();
		System.out.println("������ ��ǰ�� �ڵ��ȣ�� �Է����ּ���");
		int code = selectNum();
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hanul", "0000");
			ps=conn.prepareStatement("delete FROM STORE where code=?" );
			ps.setInt(1, code);
			ps.executeUpdate();
			System.out.println("������");
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
} 