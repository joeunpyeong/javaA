import java.util.Scanner;

public class Amug {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //����� �ȳ��� �����ص� ��  , ¿�� ����
		System.out.println("num ���� �Է�");
		String num = sc.nextLine();
		System.out.println("num �Է� �� :"+num);
		
		System.out.print("num + 10 =");
		double num1 = Double.parseDouble(num);
		System.out.println(num1+10);
		
		System.out.print("num ������ :");
		int num2 = (int)num1;
		System.out.println(num2);
		
		
	}
}

/*1.JavaProject�� �� �������?
	-����� �� é�͸� �����Ͽ� ���� ���ؼ�
	-���Ŀ��� �ٸ� ������ ����
	���� ������Ʈ�� �����ؼ� �ϳ��� ��ǰ�� ����� ���� ���ҿ뵵(?)
2.java���� ����� ����?
	-java���� �����Ϸ���
3.���� Ÿ�԰� ������ ��ü���� ����?
	-int, long (����)/ float, double(�Ǽ�)/char(���ڿ�) ���� ����
	-������ �� Ÿ���� ��������? �����ϱ� ���� ȿ��?
	-Ÿ�� ����
	-����  :������ �ѹ��� �����ϱ� ����
	-����  :���� ���� ������ ����� ��
	-�Ҵ�  :������ ���� �ִ� ��
	-�ʱ�ȭ :���� ����� �Ҵ��� ���ÿ� �ϴ� ��
4.���� Ÿ�� ����(����ȯ,ĳ����)�� ����?
	-���� �������� ū ������ �Ҵ��� ���� �ڵ�����ȯ
	 ū �������� ���� ������ �Ҵ��� ���� ��������ȯ
	 
5.Scanner�� �Է� ���� ������ Ÿ�� ������ ����? 

		1.��ĳ�ʷ� �Ҽ����� �ִ� ���� �Է¹޾� +10�غ���
		2.��ĳ�ʷ� �Ҽ����� �ִ� ���ڸ� �Է¹޾� ������ ������ Ÿ������ ĳ�����غ��� */