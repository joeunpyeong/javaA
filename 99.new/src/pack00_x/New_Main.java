package pack00_x;
import java.util.Scanner;

public class New_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int power = 0, agi=0, inte=0, nar=0, app=0, hp = 1, money=0, fame = 0; //�ɷ�ġ
			String userName;//���� �̸�
			int st=0;//���� ����
			int fullInven=6;
			int[] inventory = new int[(fullInven)]; // 0~5 ,�� 6���� �κ��丮
			int[] shopInv = new int [8]; //������ 8���� ���� ��ǰ
			int a=0;//�κ��丮 ���� ����, 6���ִ�
			New_Status Status = new New_Status();
			New_Shop shop = new New_Shop();
			
			System.out.println("���� �̸� \n�г����� �Է����ּ���");
			System.out.print("������� �г��� : ");
			userName = sc.nextLine(); // String userName ���� �̸�
			System.out.println("");
			//------------------------------------------
			while (true) {//status ����
				try {
					System.out.println("���ϴ� �ɷ�ġ ��� ����� �������ּ���\n1.���� �ɷ�ġ�� ȹ���մϴ�.\n2.�ɷ�ġ�� �����մϴ�.");
					System.out.print("=>");
					st = Integer.parseInt(sc.nextLine());
					
					if(st==1) {//�����ɷ�ġ
						Status.auto();
						power=Status.power;
						agi=Status.agi;
						inte=Status.inte;
						nar=Status.nar;
						app=Status.app;
						hp=Status.hp;
						money=Status.money;
						fame=Status.fame;
						break;
					}else if(st==2){//���ôɷ�ġ
						Status.select();
						power=Status.power;
						agi=Status.agi;
						inte=Status.inte;
						nar=Status.nar;
						app=Status.app;
						hp=Status.hp;
						money=Status.money;
						fame=Status.fame;
						break;
					}else {
						System.out.println("�������� ���Է����ּ���.\\n------------------------");
					}
					
				} catch (Exception e) {
					System.out.println("�������� ���Է����ּ���.\n------------------------");
				}
			}//status �����Ϸ�
		//------------------------------------------
			sc.nextLine();
			shop.Shop(money, shopInv, inventory, fullInven, a);
			
			
			
		}
	}
}
