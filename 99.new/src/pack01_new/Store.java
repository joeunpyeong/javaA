package pack01_new;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
	Scanner sc = new Scanner(System.in);
	int random,selectNum;
	List<Item> menu = new ArrayList<>();
	Item[] sellMenu=new Item[8];
	Item[] inven= new Item[6];
	
	// 1.
	public Store() {
//		Item item = new Item("������", 1000, 10,  new Status(), "Info");
//		menu = new Item[5];//�̸�, ����,����, (��, ��ø, ����, ȭ��, �ܸ�, ü��, ��), ����
		menu.add(new Item("������",   1000, 10, new Status(),"�ݵ��� ���� ������"));
		menu.add(new Item("����Ÿ",   2000,  5, new Status(),"�ݵ��� ���� ����Ÿ"));
		menu.add(new Item("�޷γ�",    800, 20, new Status(),"�ݵ��� ���� �޷γ�"));
		menu.add(new Item("������",    100,  2, new Status(),"�ݵ��� ���� ������"));
		menu.add(new Item("�Һ���",   1000,  5, new Status(),"�ݵ��� ���� �Һ���"));
		menu.add(new Item("ǲ���",   1500, 10, new Status(),"�ݵ��� ���� ǲ���"));
		menu.add(new Item("�ٳ���",   1500, 10, new Status(),"�ݵ��� ���� �ٳ���"));
		menu.add(new Item("��¡��",    800,  5, new Status(),"�ݵ��� ���� ��¡��"));
		menu.add(new Item("���̽�",    50,  50, new Status(),"�ݵ��� ���� ���̽�"));
		menu.add(new Item("�����",   1000, 10, new Status(),"�ݵ��� ���� �����"));
	}
	
//	for(Item item : menu) {
//		if ("�Һ���".equals(item.name)){
//			System.out.println("�Һ���"+"�� �������� �Ǹ��ϴ� ��ǰ�Դϴ�.");
//			break;
//	    }else
//			System.out.println("�Һ���"+"�� �������� �Ǹ��ϴ� ��ǰ�� �ƴմϴ�.");
//	}
	
	//list.contains(?)
	//List�ȿ� ���� ���� ������  true��, ������ false�� �����մϴ�.

	
	// 2.
	public void mixMenu() {
		for (int i = 0; i < sellMenu.length; i++) {
			int random=(int) (Math.random() * menu.size());
			sellMenu[i]=menu.get(random);
			
		}
	}
	
	public void showMenu() {
		System.out.println("-------------[����]-------------");
		for (int i = 0; i < sellMenu.length; i++) {
			System.out.println((i+1) + ". " + sellMenu[i].name + " : " + sellMenu[i].price + " G,\t���:"+sellMenu[i].stock+"��");
		}
		System.out.println("---------(���� �ݾ�:"+UserStats.money+")--------");
	}
	
	//
	public String menuInfo() {
		System.out.print("\n������ ���� ���� �޴� ��ȣ�� �Է����ּ���.\n(-1 �Է� �� ���� ���� ����)\n=>");
		try {
			selectNum = Integer.parseInt(sc.nextLine());
			if (selectNum == -1) {
				return "";
			} else if (selectNum >= 1 && selectNum <= sellMenu.length) {
				return "������: "+sellMenu[selectNum-1].name+"\n����:"+sellMenu[selectNum-1].info+"\n";
			} else {
				System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");

			}
		} catch (Exception e) {
			System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");
		}
		return "";
	}
	
	// 3.��� ���� �޴��� �����ϴ� �޼ҵ�.	
	public int buySelect() {
		while (true) {
			System.out.print("\n�����ϰ� ���� �޴� ��ȣ�� �Է����ּ���.(���� �ݾ�:"+UserStats.money+")\n(-1����)\n=>");
			try {
				selectNum = Integer.parseInt(sc.nextLine());
				if (selectNum == -1) {
					return -1;
				} else if (selectNum >= 1 && selectNum <= sellMenu.length) {
					return (selectNum - 1);
				} else {
					System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	
	public void buyItem(int selectNum) {
		if (menu.get(selectNum).stock < 1) {
			System.out.println("��� �����մϴ�.");
		}else if(inven[inven.length-1]!=null){
			System.out.println("�κ��丮�� ������ �����ϴ�.");
		}else if((UserStats.money-sellMenu[selectNum].price)<0){
			System.out.println("������ ������ ���� �����ϴ�.");
		}else {
			menu.get(selectNum).stock--;
			UserStats.money-=sellMenu[selectNum].price;
			
				for(int i=0;i<inven.length;i++) {
					if(inven[i]==null) {
						inven[i]=sellMenu[selectNum];
						inven[i].stock=1;//inven�̶� sellMenu�� stock�� ���� ����;;
						break;
					}else if(inven[i].name.equals(sellMenu[selectNum].name)) {
						inven[i].stock++;//inven�̶� sellMenu�� stock�� ���� �ö�;;
	    				break;
	    				}
					}				
			
			System.out.println(sellMenu[selectNum].name + "��(��) �����ϼ̽��ϴ�."
					+ "(���� �ݾ� : "+UserStats.money+")");
		}
	}


	//------------------------------------------------------------------------------------------------

	public void showInventory() {
		for (int i = 0; i < inven.length; i++) {
			try {
				if(inven[i].stock!=0)
					System.out.println((i+1) + ". " + inven[i].name + " : " + inven[i].price+"���� : "+inven[i].stock);
			} catch (Exception e) {}
		}
	}
	
	// 3.�Ȱ� ���� �޴��� �����ϴ� �޼ҵ�.	
	
	public int sellSelect() {
		while (true) {
			showInventory();
			System.out.print("�Ȱ� ���� ��� ��ȣ�� �Է����ּ���.\n(-1 �Է� �� ����)\n=>");
			try {
				selectNum = Integer.parseInt(sc.nextLine());
				if (selectNum == -1) {
					return -1;
				} else if (selectNum >= 1 && selectNum <=inven.length) {
					return (selectNum - 1);
				} else {
					System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public int salesQuantity(int select) {//�Ǹż���
		while (true) {
			showInventory();
			System.out.print("�Ǹ��� ������ �Է����ּ���.\n(-1 �Է� �� ����)\n=>");
			try {
				selectNum = Integer.parseInt(sc.nextLine());
				if (selectNum == -1) {
					return -1;
				} else if (0<=selectNum && selectNum<=inven[select].stock) {
					inven[select].stock-=selectNum;
					if(inven[select].stock==0) {
						inven[select]= null;
						for(int i=select ; i<inven.length-1;i++) {
							inven[i]=inven[i+1];
							if(i==inven.length-2) {
								inven[i+1]=null;
							}
						}
					}
					return selectNum;
				} else {
					System.out.println("�������� ���� �̳��� �Է����ּ���.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("�������� ���� �̳��� �Է����ּ���.");
			}
		}
	}

	
	public void sellItem(int select) {
		if (select>=inven.length||select<0){
			System.out.println("\n���� ���� �������Դϴ�.");
		}else if(inven[select]==null) {
			System.out.println("\n�ش� �������� ��� �����ϴ�.");
		}else {
			int sqNum=salesQuantity(select);
			UserStats.money+=(inven[select].price*sqNum)/10;
			System.out.println(inven[select].name + "��(��) �ǸŵǾ����ϴ�.\n�Ǹ� �ݾ� : "+((inven[select].price*sqNum)/10)+"�� ȹ���߽��ϴ�.\n");

		}
	}
	
	public void shop(){
		mixMenu();
		while(true) {
			try {
				showMenu();
				System.out.print("\n(1.���� / 2.���� / 3.�Ǹ� / 4.������)\n=>");
				int select = Integer.parseInt(sc.nextLine());
				if(select==1) {
					while(true) {
						select = buySelect();
						if (select == -1) {	
							break;
						} else {	
							buyItem(select);
						}
					}
				}else if(select==2) {
					System.out.println(menuInfo());
				}else if(select==3) {
					while(true) {
						select = sellSelect();
						if (select == -1) {	
							break;
						} else {
							sellItem(select);
						}
					}
				}else if(select==4) {
					System.out.println("������ �����ϴ�.");
					System.out.println("----------------------------------------");
					break;
				}else {
					System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");
				}
			} catch (Exception e) {
				System.out.println("�޴� ��ư�� ���ڸ� �Է����ּ���.");}	
		}
	}
}