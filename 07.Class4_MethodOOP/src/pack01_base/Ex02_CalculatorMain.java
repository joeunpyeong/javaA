package pack01_base;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
		//��� : Ŭ������ �ν��Ͻ�ȭ �ϰ�   .<-������ ������ �͵�
		
		Ex02_Calculator ec=new Ex02_Calculator();
		ec.powerOn(10);
		ec.powerOff();
		
		int result = ec.test()+10;//intŸ���� ������ return��==>int�� ������ ���� ���
		System.out.println(result);
		//String inputData = sc.nextLine();//<=
		
		System.out.println(ec.plus(110, 1));
		int sum= ec.plus3(5, 4, 2);
		System.out.println("�� :"+sum);
		System.out.println("��� :"+sum/3);;
	}
}
