package pack01_Variable;

public class Test01_Variable {
// int num1 , int num2
// ������ �������� ���� 1�� 2�� ���������
// ���� ���Ҵ� x , �ΰ��� ���ڸ� �ٲ㺸��
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int num0 = 0;
		
		num0 = num1;
		num1 = num2;
		num2 = num0;
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
