package pack01_string;

public class Ex02_Null {
	public static void main(String[] args) {
		//�⺻�� ���� Ÿ��: int, double, float, long, char, boolean��.(���ÿ� �� ����)
		//������ ���� Ÿ�� : ���� x, �⺻�� ���� Ÿ���� �ƴ� ��� �͵�(��ü,Object,Class)
		//���� ������ ���� �������� �����ϰ� ���� ���� ���� ����.
		//null������ �������� ���� ���� (������ ���� ���� �߻���)
		
		String str1=null;
		String str2="A";
		//String str3;< = null�̶�� ���� ������ ���������� x
		//���ÿ� ������ �ö� ����. ���� � ���� �Ҵ����� �𸦶� null�� �ʱ�ȭ �� �� ����
//		System.out.println(str1.length());
//		System.out.println(str2.length());
		//�ظ�� ������ Ÿ���� null�� ���� ���� �� �ʱ�ȭ�� �����ϳ� ��� ����� ����� �Ұ����ϴ�.��
//		System.out.println(str3.length());
		if(str1== str2) {
			System.out.println("true");
		}else {
			System.out.println("false");	
		}
		
	}
}
