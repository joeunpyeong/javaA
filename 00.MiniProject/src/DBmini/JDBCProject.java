package DBmini;

import java.util.Scanner;


public class JDBCProject {
	
	public  void displayMenu() {
	}
	public static void main(String[] args) {
		ProjectDAO dao= new ProjectDAO();
		Scanner sc=new Scanner(System.in);
		int selectNum;
		System.out.println("������ ���α׷�.");
		System.out.println("1.�α���");
		System.out.print("2.��  ��\n=>");
		selectNum=dao.selectNum();
		
		if(selectNum==1) {
			while(true) {
				System.out.print("ID : ");//insert => CREATE
				String id=sc.nextLine();
				
				System.out.print("PW : ");
				String password=sc.nextLine();
				
				System.out.println("==========");
					if(dao.getConn(id, password)) {
						while(true) {
							System.out.println("==========");
							System.out.println("1.��� ����Ʈ");
							System.out.println("2.��� �߰�");
							System.out.println("3.��� ����");
							System.out.println("4.��� ����");
							System.out.println("5.����");
							System.out.println("==========");
							selectNum= dao.selectNum();
							if(selectNum==1) {
								dao.viewList();
							}else if(selectNum==2) {
								dao.addList();
							}else if(selectNum==3) {
								System.out.println("��� ���� �غ���");
							}else if(selectNum==4) {
								System.out.println("��� ���� �غ���");
							}else if(selectNum==5) {
								break;
							}
						}
				}else{
					System.out.println("�α����� �����Ͽ����ϴ�.\n�ٽ� �Է����ּ���.");
					}
				
			}
		}else if(selectNum==2) {
			System.out.println("������ ���α׷��� �����մϴ�.");
		}
	}
}
