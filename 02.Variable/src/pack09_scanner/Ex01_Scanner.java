package pack09_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		//Scanner(�Է�) => �ڹ� (���)=> �ܼ�â
		Scanner sc = new Scanner(System.in); // Ŭ������ �ʱ�ȭ��
		//�ܺο��� ������ �����͸� ����غ������ؼ� �ܿ��� ��� o
		System.out.println("����ҰŴ�?");
		String inputData = sc.nextLine();
		System.out.println("������� �Դ�?");
		System.out.println(inputData);
		//�ܺο��� �Է��� ���ڴ� String���·� inputDATA��� ������ ���´�.��
		//�����Ϳ� +10�� �� ����� ����غ�����.
		int a = Integer.parseInt(inputData);
		System.out.println(a+10);
	}
}
