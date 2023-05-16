import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¼ıÀÚ¸¦ ÀÔ·Â : ");
		
		String sData = sc.nextLine();
		int data = Integer.parseInt(sData) % 2;
		System.out.println(data == 0 ? "Â¦¼ö" : "È¦¼ö");
		//String result = Integer.parseInt(sc.nextLine())%2 == 1 ? "È¦¼ö" : "Â¦¼ö"
		//¿ä¾à
		
		
		System.out.print("num1ÀÇ °ªÀ» ÀÔ·Â : ");
		String sData1 = sc.nextLine();
		int num1 = Integer.parseInt(sData1);
		//int num1 = Integer.parseInt(sc.nextLine());
		//¿ä¾à
		
		System.out.print("num2ÀÇ °ªÀ» ÀÔ·Â : ");
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
