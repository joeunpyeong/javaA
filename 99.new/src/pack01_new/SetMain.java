package pack01_new;

public class SetMain {
	public static void Setmain(String[] args) {
		Store store = new Store();
		UserStats uStats= new UserStats();
		
		uStats.auto();//status auto만듬(스테이터스 자동 배분)
		//uStats.select();//status select만듬(스테이터스 수동 배분)
		store.shop();//상점 만듬

		
	}
}