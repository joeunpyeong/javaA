import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է� : ");
		
		String sData = sc.nextLine();
		int data = Integer.parseInt(sData) % 2;
		System.out.println(data == 0 ? "¦��" : "Ȧ��");
		//String result = Integer.parseInt(sc.nextLine())%2 == 1 ? "Ȧ��" : "¦��"
		//���
		
		
		System.out.print("num1�� ���� �Է� : ");
		String sData1 = sc.nextLine();
		int num1 = Integer.parseInt(sData1);
		//int num1 = Integer.parseInt(sc.nextLine());
		//���
		
		System.out.print("num2�� ���� �Է� : ");
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
