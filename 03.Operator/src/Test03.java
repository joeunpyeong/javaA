import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 : ");
		
		String sData = sc.nextLine();
		int data = Integer.parseInt(sData) % 2;
		System.out.println(data == 0 ? "짝수" : "홀수");
		//String result = Integer.parseInt(sc.nextLine())%2 == 1 ? "홀수" : "짝수"
		//요약
		
		
		System.out.print("num1의 값을 입력 : ");
		String sData1 = sc.nextLine();
		int num1 = Integer.parseInt(sData1);
		//int num1 = Integer.parseInt(sc.nextLine());
		//요약
		
		System.out.print("num2의 값을 입력 : ");
		String sData2 = sc.nextLine();
		int num2 = Integer.parseInt(sData2);
		System.out.println("\nnum1 + num2 =" + (num1+num2));
		System.out.println("num1 - num2 =" + (num1-num2));
		System.out.println("num1 * num2 =" + (num1*num2));
		System.out.println("num1 / num2 =" + (num1/num2)+"\n");

		String a = num1 > num2 ?">" : num1 < num2 ?"<" : "==";
		
		System.out.print(num1 + a + num2);

		
	}
}
