package pack01_if;

import java.util.Scanner;

public class Ex05_IfElseIf {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		int score = Integer.parseInt(sc.nextLine());
		
//		if(score >=90) {
//			System.out.println("A���");
//		}
//		if(score >=80 && score <90) {
//			System.out.println("B���");
//		}
//		if(score >=70 && score <80) {
//			System.out.println("C���");
//		}
//		if(score <70) {
//			System.out.println("D���");
//		}
		
		if(score>=90) {
			System.out.println("A���");
		}else if(score>=80) {
			System.out.println("B���");
		}else if(score>=70) {
			System.out.println("C���");
		}else {
			System.out.println("D���");
		}
		
	}
}
