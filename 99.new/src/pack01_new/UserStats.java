package pack01_new;

import java.util.Scanner;

public class UserStats {
	Scanner sc = new Scanner(System.in);
	Status stat= new Status();
	static int money;
	int st;

	void auto() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter�� ������ ������ �ɷ�ġ�� ��带 ȹ���մϴ�.");
		sc.nextLine();

		System.out.println("---------");
		System.out.print("  �� : ");
		stat.power = (int) (Math.random() * 10) + 1;
		System.out.println(stat.power);

		System.out.print("��ø : ");
		stat.agi = (int) (Math.random() * 10) + 1;
		System.out.println(stat.agi);

		System.out.print("���� : ");
		stat.inte = (int) (Math.random() * 10) + 1;
		System.out.println(stat.inte);

		System.out.print("ȭ�� : ");
		stat.nar = (int) (Math.random() * 10) + 1;
		System.out.println(stat.nar);

		System.out.print("�ܸ� : ");
		stat.app = (int) (Math.random() * 10) + 1;
		System.out.println(stat.app);

		System.out.print("ü�� : ");
		stat.hp = (int) (Math.random() * 10) + 1;
		System.out.println(stat.hp);

		System.out.print("�� : ");
		stat.fame = (int) (Math.random() * 10) + 1;
		System.out.println(stat.fame);

		System.out.print("������ �ݾ� : ");
		money = ((int) (Math.random() * 10) + 1) * 100000;
		System.out.println(money + "gold");
		System.out.println("---------");
		
	}
	
	void select() {
		int all=0;
		System.out.print("�ɷ�ġ�� ");
		while(true) {
			System.out.println("�������ּ���.(�ɷ�ġ�� �� ���� �ִ� 35)");
			
			System.out.println("---------");
			System.out.print("  �� : ");
			stat.power = input();
			all+=stat.power;

			System.out.print("��ø : ");
			stat.agi = input();
			all+=stat.agi;

			System.out.print("���� : ");
			stat.inte = input();
			all+=stat.inte;

			System.out.print("ȭ�� : ");
			stat.nar = input();
			all+=stat.nar;

			System.out.print("�ܸ� : ");
			stat.app = input();
			all+=stat.app;

			System.out.print("ü�� : ");
			stat.hp = input();
			all+=stat.hp;

			System.out.print("�� : ");
			stat.fame = input();
			all+=stat.fame;

			System.out.print("������ �ݾ� : ");
			money = ((int) (Math.random() * 10) + 1) * 100;
			System.out.println(money + "gold");
			System.out.println("---------");
			if(all>35) {
				System.out.println("�ٽ�");
			}else {
				break;
			}
		}
	}
		
	
	
	int input() {
		while(true) {
			try {
				st = Integer.parseInt(sc.nextLine());
				if(st<0) {
					System.out.print("���Է����ּ���.\n------------------------\n=>1");

				}else {
					break;
				}
			} catch (Exception e) {
				System.out.print("���Է����ּ���.\n------------------------\n=>2");
			}
		}
		return st;
	}
	
}
