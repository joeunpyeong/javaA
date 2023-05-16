package pack02_Ex;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	List<Item> menu = new ArrayList<>();
	public Menu() {
//		Item item = new Item("꼬깔코", 1000, 10,  new Status(), "Info");
//		menu = new Item[5];//이름, 가격,수량, 정보
		menu.add(new Item("제품명",   "가격", "수량","정보"));
		menu.add(new Item("꼬깔콘",   "1000", "10","반도의 흔한 꼬깔콘"));
		menu.add(new Item("맛스타",   "2000",  "5","반도의 흔한 맛스타"));
		menu.add(new Item("메로나",    "800", "20","반도의 흔한 메로나"));
		menu.add(new Item("얼음컵",    "100",  "2","반도의 흔한 얼음컵"));
		menu.add(new Item("소보루",   "1000",  "5","반도의 흔한 소보루"));
		menu.add(new Item("풋사과",   "1500", "10","반도의 흔한 풋사과"));
		menu.add(new Item("바나나",   "1500", "10","반도의 흔한 바나나"));
		menu.add(new Item("오징어",    "800",  "5","반도의 흔한 오징어"));
		menu.add(new Item("아이스",     "50",  "50","반도의 흔한 아이스"));
		menu.add(new Item("공깃밥",   "1000", "10","반도의 흔한 공깃밥"));
	}
}
