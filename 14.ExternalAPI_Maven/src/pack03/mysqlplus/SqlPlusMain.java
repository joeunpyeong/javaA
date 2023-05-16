package pack03.mysqlplus;

import java.sql.SQLException;
import java.util.Scanner;

public class SqlPlusMain {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		SqlDAO dao= new SqlDAO();
		System.out.println("JepSqlplus 입니다.");
		
		System.out.print("사용자명을 입력 : ");
		String user=sc.nextLine();
		System.out.print("비밀번호를 입력 : ");
		String password=sc.nextLine();
		
		if(dao.checkConnection(user, password)) {
			System.out.println("sql문을 입력 >");
			String sql = sc.nextLine();
			dao.sendSql(sql);
		}else{
			System.out.println("종료가 되면 된다.");
		}
		
		
		
	}
}
