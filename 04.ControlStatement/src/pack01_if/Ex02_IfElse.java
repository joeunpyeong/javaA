package pack01_if;

import java.util.Scanner;

public class Ex02_IfElse {
	public static void main(String[] args) {
		//if�� : �ܼ� if(���ǽ��� �ְ� �ش��ϴ� ���ǽ��� true�� ����� ��ŷ(����{})�� ���� �ڵ����)
		//if-else��: �ܼ�if���� ���ǽ��� true�϶��� �����̵Ǵ� ���ŷο��� ����.
		//if�� ���ǽ��� true�� �ƴ� false��� else��� Ű���带 if�� �ڿ� �ٿ��� false����θ� ����� ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int score = Integer.parseInt(sc.nextLine());
		
		if((score%2)==0) {
			System.out.println("¦��"); //true�� �� ����
		}else{
			System.out.println("Ȧ��"); //false�� �� ����
		}
		
		System.out.print("num1�� �Է� :");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("num2�� �Է� :");
		int num2 = Integer.parseInt(sc.nextLine());
		if(num1<num2) {
			System.out.println(num1 +"<"+ num2);
		}else {
			System.out.println(num1 +">"+ num2);
		}
		
		
	}
}
