package pack01_new;

public class SetMain {
	public static void Setmain(String[] args) {
		Store store = new Store();
		UserStats uStats= new UserStats();
		
		uStats.auto();//status auto����(�������ͽ� �ڵ� ���)
		//uStats.select();//status select����(�������ͽ� ���� ���)
		store.shop();//���� ����

		
	}
}