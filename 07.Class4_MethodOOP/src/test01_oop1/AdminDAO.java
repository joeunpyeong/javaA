package test01_oop1;

import java.util.Scanner;

public class AdminDAO {
	public boolean adminLogin() {
		//Ư�� Ƚ����ŭ ���̵�� ��й�ȣ�� �Է��ϰ� ������ �� ���� ����.
		int count=0;
		Scanner sc= new Scanner(System.in);
		while(true) {
			if(count==3) {
				System.out.println("�õ� Ƚ�� 3ȸ�� �ʰ��Ͽ� ���θ޴��� �̵��մϴ�.");
				return false;
			}
			count++;
			String id=sc.nextLine();
			String pw=sc.nextLine();
			if(id.equals("master")&&pw.equals("admin")) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				return true;
			}else {
				System.out.println("id pw�� Ȯ�����ּ���");
				return false;
			}
			
		}
	}
	
	//DTO�� �Ѱ� ������ DrinkDAO���� �����Ǵ� drinkArr�� �߰��ؾ���
	public void addMenu(DrinkDAO dao) {
		dao.display();//����� ������
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �̸� �Է� :");
		String name = sc.nextLine();
		System.out.println("���� ���� �Է� :");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.println("���� ���� �Է� :");
		int cnt = Integer.parseInt(sc.nextLine());
		DrinkDTO dto = new DrinkDTO(name,price,cnt);
		DrinkDTO[] tempArrs=new DrinkDTO[dao.drinkArr.length+1];
		for(int i=0; i<dao.drinkArr.length;i++) {
			tempArrs[i]=dao.drinkArr[i];
		}
		tempArrs[tempArrs.length-1]=dto;
		dao.drinkArr=tempArrs;
	}
	
	
}
