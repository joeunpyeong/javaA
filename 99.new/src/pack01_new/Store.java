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
//		Item item = new Item("꼬깔코", 1000, 10,  new Status(), "Info");
//		menu = new Item[5];//이름, 가격,수량, (힘, 민첩, 지능, 화법, 외모, 체력, 명성), 정보
		menu.add(new Item("꼬깔콘",   1000, 10, new Status(),"반도의 흔한 꼬깔콘"));
		menu.add(new Item("맛스타",   2000,  5, new Status(),"반도의 흔한 맛스타"));
		menu.add(new Item("메로나",    800, 20, new Status(),"반도의 흔한 메로나"));
		menu.add(new Item("얼음컵",    100,  2, new Status(),"반도의 흔한 얼음컵"));
		menu.add(new Item("소보루",   1000,  5, new Status(),"반도의 흔한 소보루"));
		menu.add(new Item("풋사과",   1500, 10, new Status(),"반도의 흔한 풋사과"));
		menu.add(new Item("바나나",   1500, 10, new Status(),"반도의 흔한 바나나"));
		menu.add(new Item("오징어",    800,  5, new Status(),"반도의 흔한 오징어"));
		menu.add(new Item("아이스",    50,  50, new Status(),"반도의 흔한 아이스"));
		menu.add(new Item("공깃밥",   1000, 10, new Status(),"반도의 흔한 공깃밥"));
	}
	
//	for(Item item : menu) {
//		if ("소보루".equals(item.name)){
//			System.out.println("소보루"+"는 상점에서 판매하는 물품입니다.");
//			break;
//	    }else
//			System.out.println("소보루"+"는 상점에서 판매하는 물품이 아닙니다.");
//	}
	
	//list.contains(?)
	//List안에 같은 값이 있으면  true를, 없으면 false를 리턴합니다.

	
	// 2.
	public void mixMenu() {
		for (int i = 0; i < sellMenu.length; i++) {
			int random=(int) (Math.random() * menu.size());
			sellMenu[i]=menu.get(random);
			
		}
	}
	
	public void showMenu() {
		System.out.println("-------------[상점]-------------");
		for (int i = 0; i < sellMenu.length; i++) {
			System.out.println((i+1) + ". " + sellMenu[i].name + " : " + sellMenu[i].price + " G,\t재고:"+sellMenu[i].stock+"개");
		}
		System.out.println("---------(소지 금액:"+UserStats.money+")--------");
	}
	
	//
	public String menuInfo() {
		System.out.print("\n정보를 보고 싶은 메뉴 번호를 입력해주세요.\n(-1 입력 시 정보 보기 종료)\n=>");
		try {
			selectNum = Integer.parseInt(sc.nextLine());
			if (selectNum == -1) {
				return "";
			} else if (selectNum >= 1 && selectNum <= sellMenu.length) {
				return "아이템: "+sellMenu[selectNum-1].name+"\n설명:"+sellMenu[selectNum-1].info+"\n";
			} else {
				System.out.println("메뉴 버튼의 숫자만 입력해주세요.");

			}
		} catch (Exception e) {
			System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
		}
		return "";
	}
	
	// 3.사고 싶은 메뉴를 선택하는 메소드.	
	public int buySelect() {
		while (true) {
			System.out.print("\n구매하고 싶은 메뉴 번호를 입력해주세요.(소지 금액:"+UserStats.money+")\n(-1종료)\n=>");
			try {
				selectNum = Integer.parseInt(sc.nextLine());
				if (selectNum == -1) {
					return -1;
				} else if (selectNum >= 1 && selectNum <= sellMenu.length) {
					return (selectNum - 1);
				} else {
					System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
			}
		}
	}
	
	
	public void buyItem(int selectNum) {
		if (menu.get(selectNum).stock < 1) {
			System.out.println("재고가 부족합니다.");
		}else if(inven[inven.length-1]!=null){
			System.out.println("인벤토리에 공간이 없습니다.");
		}else if((UserStats.money-sellMenu[selectNum].price)<0){
			System.out.println("물건을 구매할 돈이 없습니다.");
		}else {
			menu.get(selectNum).stock--;
			UserStats.money-=sellMenu[selectNum].price;
			
				for(int i=0;i<inven.length;i++) {
					if(inven[i]==null) {
						inven[i]=sellMenu[selectNum];
						inven[i].stock=1;//inven이랑 sellMenu의 stock이 같이 변함;;
						break;
					}else if(inven[i].name.equals(sellMenu[selectNum].name)) {
						inven[i].stock++;//inven이랑 sellMenu의 stock이 같이 올라감;;
	    				break;
	    				}
					}				
			
			System.out.println(sellMenu[selectNum].name + "을(를) 구매하셨습니다."
					+ "(소지 금액 : "+UserStats.money+")");
		}
	}


	//------------------------------------------------------------------------------------------------

	public void showInventory() {
		for (int i = 0; i < inven.length; i++) {
			try {
				if(inven[i].stock!=0)
					System.out.println((i+1) + ". " + inven[i].name + " : " + inven[i].price+"개수 : "+inven[i].stock);
			} catch (Exception e) {}
		}
	}
	
	// 3.팔고 싶은 메뉴를 선택하는 메소드.	
	
	public int sellSelect() {
		while (true) {
			showInventory();
			System.out.print("팔고 싶은 장비 번호를 입력해주세요.\n(-1 입력 시 종료)\n=>");
			try {
				selectNum = Integer.parseInt(sc.nextLine());
				if (selectNum == -1) {
					return -1;
				} else if (selectNum >= 1 && selectNum <=inven.length) {
					return (selectNum - 1);
				} else {
					System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
			}
		}
	}
	
	public int salesQuantity(int select) {//판매수량
		while (true) {
			showInventory();
			System.out.print("판매할 수량을 입력해주세요.\n(-1 입력 시 종료)\n=>");
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
					System.out.println("보유중인 수량 이내로 입력해주세요.");
					continue;
				}
			} catch (Exception e) {
				System.out.println("보유중인 수량 이내로 입력해주세요.");
			}
		}
	}

	
	public void sellItem(int select) {
		if (select>=inven.length||select<0){
			System.out.println("\n옳지 않은 선택지입니다.");
		}else if(inven[select]==null) {
			System.out.println("\n해당 공간에는 장비가 없습니다.");
		}else {
			int sqNum=salesQuantity(select);
			UserStats.money+=(inven[select].price*sqNum)/10;
			System.out.println(inven[select].name + "이(가) 판매되었습니다.\n판매 금액 : "+((inven[select].price*sqNum)/10)+"을 획득했습니다.\n");

		}
	}
	
	public void shop(){
		mixMenu();
		while(true) {
			try {
				showMenu();
				System.out.print("\n(1.구매 / 2.정보 / 3.판매 / 4.나가기)\n=>");
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
					System.out.println("상점을 떠납니다.");
					System.out.println("----------------------------------------");
					break;
				}else {
					System.out.println("메뉴 버튼의 숫자만 입력해주세요.");
				}
			} catch (Exception e) {
				System.out.println("메뉴 버튼의 숫자만 입력해주세요.");}	
		}
	}
}