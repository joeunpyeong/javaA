import java.util.Scanner;

public class Mbti {
	public static void main(String[] args) {
		// I 내향적 , E 외향적
		// S 현실적 , N 상상적?
		// F 감성 (공감 ) , T 이성(공감x)
		// P 무계획 , J계획

				

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
				System.out.println("잘못된 선택지입니다.");
			}
		}
		while(true) {
			a=1;
			System.out.println("다른 사람의 말에 반박부터 한다. 1.o , 2.x");
			if(Integer.parseInt(sc.nextLine())==1){
				mbtiResult[a][2] =1;
				break;
			}else if(Integer.parseInt(sc.nextLine())==2){
				mbtiResult[a][1] =1;
				break;
			}else {
				System.out.println("잘못된 선택지입니다.");
			}
		}
		while(true) {
			a=1;
			System.out.println("다른 사람의 말에 반박부터 한다. 1.o , 2.x");
			if(Integer.parseInt(sc.nextLine())==1){
				mbtiResult[a][2] =1;
				break;
			}else if(Integer.parseInt(sc.nextLine())==2){
				mbtiResult[a][1] =1;
				break;
			}else {
				System.out.println("잘못된 선택지입니다.");
			}
		}
		
				
	}
}
