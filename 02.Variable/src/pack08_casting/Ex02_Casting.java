package pack08_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		//���ڿ� = "12" + 34= 1234
		//String + int = �� DataType String
		//Why? ���ڿ� + ��� = ���ڿ� ��Ģ
		//���ڿ� ������ ��Ģ��
		//"1"(String) �ٸ��� 1(����)
		String sum = "12" + 34;
		//� ���� String���� �ٲٴ� ���� ��û �����ϴ�.
		String sum2 = ""+1234;
		System.out.println(sum);
		System.out.println(sum2);
		
		//String sum, sum2 ������ ���ڿ��� ���ڸ� �����ص�.
		//�ΰ��� ���� �˰�ʹ�."1234"+"1234" = ?
		//sum + sum2 =12341234
		//���� 1234 +1234 = 2468
		//String => int ?
		//int, double ���� �������� �۾� �ٲ�� ��=>�⺻Ÿ��
		//�빮�ڷ� �����ϴ� �͵��� ��κ� ClassŸ��
		//�⺻ ������ Ÿ���� Wrapper class��� ���� ������ �ִ�.
		//int => Integer , double Double
		//String�� �ش��ϴ� Ÿ������ �ٲ��ִ� ������ �ϴ� ��
		//String�� �ִ� " <= �� �����Ѵ�
		int num= Integer.parseInt(sum);
		//num2�� sum2�� ���ڷ� �ٲ㼭 �־��.
		int num2= Integer.parseInt(sum2);
		System.out.println(num+num2);
		String sAvg = "88.6";
		//�� +10�� �� ����� ��� ����.
		double dAvg = Double.parseDouble(sAvg)+10;
		System.out.println(dAvg);
		//WapperClass.parseDataType(String); =>DataType
		String str="������";
		//���ش� �����͸� ���ڷ� �ٲ� �� ������? wrapperClass�̿�
		
		int a = Integer.parseInt(str);
		System.out.println(a);
		
		
		//Float.parseFloat(sAvg)
		//Long.parseLong(sAvg)
		//Byte.parseByte(sAvg)
		
		
		
	}
}
