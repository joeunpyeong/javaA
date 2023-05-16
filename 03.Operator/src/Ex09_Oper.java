import java.util.Scanner;

public class Ex09_Oper {
	public static void main(String[] args) {
		//변수타입 변수명 = 값 비교식 ? "반환값1" : "반환값2"
		//int result = num < 10 ? 1: 식2 ? 식3...: 모든 식이 참이 아닐때
		Scanner sc = new Scanner(System.in);
		int score = Integer.parseInt(sc.nextLine());
		System.out.println("점수 :"+ score);
		String grade = score > 90 ?"A" : score > 80 ?"B" : score > 70 ?"C" : "D";
		System.out.println(grade);
	}
}
