package pack00_x;

public class New_Inventory {
	int power, agi, inte, nar, app, hp, money, fame, fullInven=6;
	int[] inven = new int[fullInven];
	
	public New_Inventory(int[] inven, int fullInven,int power, int agi, int inte, int nar, int app, int hp, int money, int fame) {
		this. fullInven =fullInven;
		this.inven = inven;
		this.power = power;
		this.agi = agi;
		this.inte = inte;
		this.nar = nar;
		this.app = app;
		this.hp = hp;
		this.money = money;
		this.fame = fame;
		System.out.println("---------");
		System.out.print("  �� : "+power);
		System.out.println("��ø : "+agi);
		System.out.print("���� : "+inte);
		System.out.println("ȭ�� : "+nar);
		System.out.print("�ܸ� : "+app);
		System.out.println("ü�� : "+hp);
		System.out.println("�� : "+fame);
		System.out.print("������ �ݾ� : "+money + "gold");
		System.out.println("---------");
		
		
	}
}
