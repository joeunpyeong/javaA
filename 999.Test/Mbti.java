import java.util.Scanner;

public class Mbti {
	public static void main(String[] args) {
		// I ������ , E ������
		// S ������ , N �����?
		// F ���� (���� ) , T �̼�(����x)
		// P ����ȹ , J��ȹ

				

		Scanner sc = new Scanner(System.in);
		int[][] mbtiResult = new int[4][4];
		String[][] mbtiWord = {
		{"I" , "E"},{"N" , "S"} , {"F", "T"} , {"J", "P"}
		};
		int a;
		while(true) {
			a=1;
			System.out.println(". 1.o , 2.x");
			if(Integer.parseInt(sc.nextLine())==1){
				mbtiResult[a][2] =1;
				break;
			}else if(Integer.parseInt(sc.nextLine())==2){
				mbtiResult[a][1] =1;
				break;
			}else {
				System.out.println("�߸��� �������Դϴ�.");
			}
		}
		while(true) {
			a=1;
			System.out.println("�ٸ� ����� ���� �ݹں��� �Ѵ�. 1.o , 2.x");
			if(Integer.parseInt(sc.nextLine())==1){
				mbtiResult[a][2] =1;
				break;
			}else if(Integer.parseInt(sc.nextLine())==2){
				mbtiResult[a][1] =1;
				break;
			}else {
				System.out.println("�߸��� �������Դϴ�.");
			}
		}
		while(true) {
			a=1;
			System.out.println("�ٸ� ����� ���� �ݹں��� �Ѵ�. 1.o , 2.x");
			if(Integer.parseInt(sc.nextLine())==1){
				mbtiResult[a][2] =1;
				break;
			}else if(Integer.parseInt(sc.nextLine())==2){
				mbtiResult[a][1] =1;
				break;
			}else {
				System.out.println("�߸��� �������Դϴ�.");
			}
		}
		
				
	}
}
