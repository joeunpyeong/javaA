package pack00_x;
import java.util.Scanner;

public class New_Shop {
	int money, fullInven=6,fullShop=6;
	int shopInv[]=new int[fullShop-1];
	int[] inventory = new int[(fullInven)];
	int a=0;//�κ��丮 ���� ����, 6���ִ�
	
	void Shop(int money, int[] shopInv, int[]inventory,int fullInven,int a) {
		Scanner sc = new Scanner(System.in);
		
		this.inventory=inventory;
		this.money = money;
		this.shopInv = shopInv;
		this.fullInven =fullInven;
		this.a=a;
		
		int stock=6; //��� ���� �ö󰥶����� stock����
		int st=0;//��������
		
		for(int i=0; i<fullShop;i++) {//0~8���� ������ ������ ��ȣ����.
			shopInv[i]=(int) (Math.random() * stock)+1;
		}
		
		for(int i=0;i<6;i++) {//������ ��ȣ�� �°� ������ ��� ����
			System.out.print((i+1)+"�� â��:");
			switch (shopInv[i]) {
			case 1:
				System.out.println("���1");
				System.out.println("��� ����="+10+"gold");
				money-=10;
				break;
			case 2:
				System.out.println("���2");
				System.out.println("��� ����="+10+"gold");
				money-=10;
				break;
			case 3:
				System.out.println("���3");
				System.out.println("��� ����="+10+"gold");
				money-=10;
				break;
			case 4:
				System.out.println("���4");
				System.out.println("��� ����="+10+"gold");
				money-=10;
				break;
			case 5:
				System.out.println("���5");
				System.out.println("��� ����="+10+"gold");
				money-=10;
				break;
			case 6:
				System.out.println("���6");
				System.out.println("��� ����="+10+"gold");
				money-=10;
				break;
			default:
				break;
			}
			System.out.println("");

		}
		
		for(int i=0;i<(fullInven-1);i++) {
			if(inventory[i]!=0) {
				a++;
			}
		}
		if(a>fullInven) {
			System.out.println("�κ��丮�� ���� ���ֽ��ϴ�.");
		}else {
			System.out.println("�κ��丮("+a+"/"+fullInven+")");
			while(a<6) {//�Ӹ������� ���� ������
				try {
					System.out.print("������ ��ǰ�� ������ �ּ���.(0�� �Է½� ���� ����)\n=>");
					st = Integer.parseInt(sc.nextLine());
					if(st==0) {
						System.out.println("���Ÿ� �����մϴ�.");
						System.out.println("�κ��丮("+a+"/"+fullInven+")");
						break;
					}else if(st<0||st>stock) {
						System.out.print("�������� ���Է����ּ���.\n------------------------\n1");
					}else if(shopInv[(st-1)]==0) {
						System.out.println(st+"�� â�� ��ǰ�� �����ϴ�.");
					}else if(st<=fullShop){
						inventory[a]=shopInv[(st-1)];
						a++;
						shopInv[(st-1)]=0;
						System.out.println(st+"�� ��ǰ�� �����߽��ϴ�.");
						System.out.println("�κ��丮("+a+"/"+fullInven+")");
					}
				} catch (Exception e) {
					System.out.print("�������� ���Է����ּ���.\n------------------------\n=>2");
				}
				System.out.println("");
			}
		}
		
	}
}






