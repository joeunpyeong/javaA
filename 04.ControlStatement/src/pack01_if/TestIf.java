package pack01_if;

import java.util.Scanner;

public class TestIf {
	public static void main(String[] args) {
		//����--------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���ڸ� : ");
		int code = Integer.parseInt(sc.nextLine());
		
		System.out.print("������ ������� ������ ");
		if(code==1 || code==3) {
			System.out.println("�����Դϴ�");
		}else if(code==2 || code==4) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�� �� �����ϴ�.");
		}
		//-�ֻ��� ��-----------------------------------------
		int random = (int)(Math.random()*6)+1;
		System.out.print("������ = ");
		if(random==1) {
			System.out.println("1");
		}else if(random==2) {
			System.out.println("2");
		}else if(random==3) {
			System.out.println("3");
		}else if(random==4) {
			System.out.println("4");
		}else if(random==5) {
			System.out.println("5");
		}else if(random==6) {
			System.out.println("6");
		}
		//-�ֻ��� ���----------------------------------------
		System.out.println("�ֻ��� ������ �����մϴ�.");
		System.out.println("-1�� �Է��ϸ� �����մϴ�. �� �ܿ��� ����");
		int dice1 = Integer.parseInt(sc.nextLine());
		
		if(dice1 == -1) {
			System.out.println("\n������ ����˴ϴ�.");
		}else {
			System.out.println("���� ����!");
			System.out.println("����ڰ� �ֻ����� ���� �����Դϴ�(������ ENTER)");
			sc.nextLine();
			int dice0 = (int)(Math.random()*6)+1;
			System.out.println("������� �ֻ��� : " + dice0);
			System.out.print("��ǻ���� �ֻ��� : ");
			int dice2 = (int)(Math.random()*6)+1;
			System.out.println(dice2);
		
			if(dice1 > dice2 ) {
				System.out.println("��� : ����ڰ� �̰���ϴ�.");
			}else if(dice1 < dice2) {
				System.out.println("��� : ��ǻ�Ͱ� �̰���ϴ�.");
			}else {
				System.out.println("��� : ���º��Դϴ�.");
			}
		
		}
	}
}
