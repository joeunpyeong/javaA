package DBmini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProjectDAO {
	
	Connection conn; //sqlplus���� ������ ����ڸ�� ��й�ȣ�� �Է¹޾����� ������ �õ��ϴ� ����ü
	PreparedStatement ps;//������ �����ϰ� �����ϴ� ��ü
	ResultSet rs; //����� �޾ƿ������� ��ü
	Scanner sc = new Scanner(System.in);
	int no=3;
	
	public void dbClose() {
		try {
			if(rs != null ) { rs.close() ; }
			if(ps != null ) {ps.close();}
			if(conn != null ) {conn.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
int selectNum() {
		int num=0;
		while(true) {
			try {
				while(true) {
					 num = Integer.parseInt(sc.nextLine());
					 if(num>=0) {
						 return num;
					 }
				}
				 
			} catch (Exception e) {
			}
			System.out.println("�ٽ� �Է����ּ���.");
			
		}
	}
	
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
	
	public boolean getConn(String id,String password) { //�α���
		//���ο��� �Է��� ����ڸ�� ��й�ȣ�� ���� �޼ҵ���� ������ �;���
		//SqlPlusMain���� checkConnection�޼ҵ带 ȣ���ϴµ� ����ڸ�� ��й�ȣ�� ��µ� �� �ְ� �߱�.
		

		System.out.println("check : "+id+ " "+ password);
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//oracle.jdbc.driver.OracleDriver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,id,password);
			
			if(!conn.isClosed()) {
				System.out.println("������ ���ӵ�\n"+conn.getMetaData().getDatabaseProductVersion());
				return true;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����Ŭ ����̹��� �غ� �Ǿ����� �ʽ��ϴ�");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("���̵�Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�");
		}
		return false;
		
	}

	public void viewList() {
		try {
			ps = conn.prepareStatement(" select * from store order by code");
			rs = ps.executeQuery();
			int num=1;

			System.out.println("��ȣ\t�̸�\t\t����\t����");
			while(rs.next()) {
				System.out.print(num+"\t");
				if(rs.getString("product").length()<=3) {
					System.out.print(rs.getString("product")+"\t\t");
				}else {
					System.out.print(rs.getString("product")+"\t");
				}
				System.out.print(rs.getInt("price")+"\t");
				System.out.println(rs.getInt("cnt")+"\t");
				num++;
			}
			
		} catch (SQLException e) {
			System.out.println("Sqlplus Exception : " + e.getMessage());
		}
	}
	
	
	
	
	
	public void addList() {
		String product="";
		int price=0,cnt=0;
		System.out.println("��ǰ�� �̸� : ");
		product=sc.nextLine();
		System.out.println("��ǰ�� ���� : ");
		price = selectNum();
		System.out.println("��ǰ�� ���� : ");
		cnt = selectNum();
		insertBoard(product,price,cnt);
	}
	
	public void insertBoard(String product,int price,int cnt) {
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hanul", "0000");
			ps=conn.prepareStatement("INSERT INTO STORE (CODE, PRODUCT, PRICE, CNT)"
					+ "VALUES (?,?,?)");
			
			ps.setString(1, product);
			ps.setInt(2, price);
			ps.setInt(3, cnt);
			//rs = ps.executeQuery();
			ps.executeUpdate();
			System.out.println(product+" ǰ�� �߰���");
			
		} catch (SQLException e) {
			System.out.println("Sqlplus Exception : " + e.getMessage());
		}
	}
	
	
	
	
}
// conn , ps , rs ������ ��ü ���� null�� ��������.(DB Close)
// ������ dbClose();
