package pack01_Variable;
//ctrl + shift + f == ������
//ctrl + / == ������ �࿡ ���ؼ� ��� �ּ� ó��.

public class Ex03_Variable {
	public static void main(String[] args) {
		int value = 0;
		int result = value + 10;

//		int value = 10;
//		int result = value + 10;
		System.out.println(result);
		
		//������ �������� ��Ģ������ �����ϴ�.
		//���Ҵ�. (������ ��� ����°� �ƴ϶� ���� �ٽ� �༭ �ٲ�)
		result = 1+1+10;
		System.out.println(result);
		System.out.println(result-2);
		System.out.println(result/3);
		System.out.println(result *2);
		result =11*3;
		System.out.println(result);
		
		result = value; //���� Ÿ���� ������ ���� ���� �� �ִ�.
		System.out.println(result);
	}
}
