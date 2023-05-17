package DBmini;

import java.util.Scanner;


public class JDBCProject {
	
	public  void displayMenu() {
	}
	public static void main(String[] args) {
		ProjectDAO dao= new ProjectDAO();
		Scanner sc=new Scanner(System.in);
		int selectNum;
		System.out.println("재고관리 프로그램.");
		System.out.println("1.로그인");
		System.out.print("2.종  료\n=>");
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
							System.out.println("1.재고 리스트");
							System.out.println("2.재고 추가");
							System.out.println("3.재고 수정");
							System.out.println("4.재고 삭제");
							System.out.println("5.종료");
							System.out.println("==========");
							selectNum= dao.selectNum();
							if(selectNum==1) {
								dao.viewList();
							}else if(selectNum==2) {
								dao.addList();
							}else if(selectNum==3) {
								System.out.println("재고 수정 준비중");
							}else if(selectNum==4) {
								System.out.println("재고 삭제 준비중");
							}else if(selectNum==5) {
								break;
							}
						}
				}else{
					System.out.println("로그인이 실패하였습니다.\n다시 입력해주세요.");
					}
				
			}
		}else if(selectNum==2) {
			System.out.println("재고관리 프로그램을 종료합니다.");
		}
	}
}
