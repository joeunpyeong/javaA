package pack09_scanner;

import java.util.Scanner;

public class Ex02_Scannner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //����� �ȳ��� �����ص� ��  , ¿�� ����
		System.out.println("���ڸ� �Է�");
		String data1 = sc.nextLine(); //���� ����Ű ġ���������� ���ڿ��� ������
		//���ڸ� �ΰ� �޾ƿͼ� �� ���� ���� ���ϱ�
		//---�߿� x, �����ϱ����ؼ� ��¿ �� ���� �ܿ��� ��������---//3
		System.out.println("num1 �Է� �� :"+data1);
		String data2 = sc.nextLine();
		
		System.out.println("num2 �Է� �� :"+data2);
		//int num1 = Integer.parseInt(data1);
		//int num2 = Integer.parseInt(data2);
		System.out.print("num1 + num2 =");
		//System.out.println(num1+num2);
		int num = (Integer.parseInt(data1)) + (Integer.parseInt(data2));
		System.out.println(num);
		
		
	}
}
