package pack03.mysqlplus;

import java.sql.SQLException;
import java.util.Scanner;

public class SqlPlusMain {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		SqlDAO dao= new SqlDAO();
		System.out.println("JepSqlplus �Դϴ�.");
		
		System.out.print("����ڸ��� �Է� : ");
		String user=sc.nextLine();
		System.out.print("��й�ȣ�� �Է� : ");
		String password=sc.nextLine();
		
		if(dao.checkConnection(user, password)) {
			System.out.println("sql���� �Է� >");
			String sql = sc.nextLine();
			dao.sendSql(sql);
		}else{
			System.out.println("���ᰡ �Ǹ� �ȴ�.");
		}
		
		
		
	}
}
