package pack02_static;

public class Ex02_Calculator {
	//Ex02_CalculatorMain�� ����� Ex02_Calculator�� �ִ� �޼ҵ带 ���� ȣ���ϴ� ��
	//MainŬ���������� �ν��Ͻ�ȭ ������ �����ϴ�.
	
	//�޼ҵ� ����� ������ ����.
	//plus <-�� ���� �Է¹޾� ���� return�ϴ� static�޼ҵ�
	//minus(��)�� return�ϴ� static�޼ҵ�
	//mul(��)�� return�ϴ� static�޼ҵ�
	//div(��)�� return�ϴ� static�޼ҵ�
	
	static int plus(int num1, int num2) {
		System.out.print(num1+"+"+num2+" = ");
		return num1+num2;
	}
	static int minus(int num1, int num2) {
		System.out.print(num1+"-"+num2+" = ");
		return num1-num2;
	}
	static int mul(int num1, int num2) {
		System.out.print(num1+"*"+num2+" = ");
		return num1*num2;
	}
	static int div(int num1, int num2) {
		System.out.print(num1+"/"+num2+" = ");
		return num1/num2;
	}
}
