package pack00_x;

public class New_Battle {
	int hp;
	
	boolean battle() {
		if(hp<=0) {
			System.out.println("ü���� �����ϴ�.");

			return false;
		}else {
			System.out.println("ü���� �ֽ��ϴ�.");

			return true;
		}
	}
}
