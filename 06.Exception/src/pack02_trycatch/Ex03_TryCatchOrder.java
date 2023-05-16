package pack02_trycatch;

import java.util.Scanner;

public class Ex03_TryCatchOrder {
	public static void main(String[] args) {
		int data1=10;
		int data2=1;

		Scanner sc=new Scanner(System.in);//��ĳ�� < = ���� �ȳ��� �ٲٴ� �۾��� �ϱ�
		sc.nextLine();
		//catch���� ���� �˰��ִ� ���������� �ϳ��� �����ϰ� catch���� ����ǰ� �غ���

		try {
			int result = data1/data2;//ArithmeticException
			args[10]="1";
		} catch (ArithmeticException e) {//������� 0���� � �� ������ �ϸ� �߻�
			int data3=100;
			System.out.println("data2�� ����(��:"+data2+")������ ����"+e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException"+e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭����!!"+e.getMessage());
		}
	}
}
