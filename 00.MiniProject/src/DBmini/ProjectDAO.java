package DBmini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProjectDAO {
	
	Connection conn; //sqlplus에서 실제로 사용자명과 비밀번호를 입력받았을때 접속을 시도하는 연결체
	PreparedStatement ps;//쿼리를 전송하고 실행하는 객체
	ResultSet rs; //결과를 받아오기위한 객체
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
			System.out.println("다시 입력해주세요.");
			
		}
	}
	
	public Connection getConn() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hanul", "0000");
		} catch (Exception e) {
			System.out.println(" 알수없는 오류발생! 개발자에게 문의하세요 ");
		}
		return conn;
	}
	
	public boolean getConn(String id,String password) { //로그인
		//메인에서 입력한 사용자명과 비밀번호를 여기 메소드까지 가지고 와야함
		//SqlPlusMain에서 checkConnection메소드를 호출하는데 사용자명과 비밀번호가 출력될 수 있게 뜨기.
		

		System.out.println("check : "+id+ " "+ password);
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		//oracle.jdbc.driver.OracleDriver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,id,password);
			
			if(!conn.isClosed()) {
				System.out.println("다음에 접속됨\n"+conn.getMetaData().getDatabaseProductVersion());
				return true;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버가 준비가 되어있지 않습니다");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("아이디또는 비밀번호가 일치하지 않습니다");
		}
		return false;
		
	}

	public void viewList() {
		try {
			ps = conn.prepareStatement(" select * from store order by code");
			rs = ps.executeQuery();
			int num=1;

			System.out.println("번호\t이름\t\t가격\t수량");
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
		System.out.println("제품의 이름 : ");
		product=sc.nextLine();
		System.out.println("제품의 가격 : ");
		price = selectNum();
		System.out.println("제품의 수량 : ");
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
			System.out.println(product+" 품목 추가됨");
			
		} catch (SQLException e) {
			System.out.println("Sqlplus Exception : " + e.getMessage());
		}
	}
	
	
	
	
}
// conn , ps , rs 세가지 객체 전부 null로 비워줘야함.(DB Close)
// 나가기 dbClose();
