package pack01_base;

public class Ex02_Calculator {
	//static Ű���尡 �ִ��� �������� �Ǵ�.(��� ������ �ſ� �߿���!)
	//�޼ҵ��� ����.
	//������ �޼ҵ�(Constructor) : ��ü�� ������ �� �ʿ��� �޼ҵ�
	
	//void �޼ҵ��̸�(�Ķ���ͺ�){
	//	�޼ҵ� ����(�ڵ�)
	//}
	//�Ķ���ͺ�:� ���̵� �޼ҵ尡 ����� �� �ʿ��� (����,Ŭ���� ��) ������ �ִٸ� �޾ƿ��Բ� ó���ϴ� �κ�
	
	
	void powerOn(int power) {
		if(power<1) {
			System.out.println("���͸� �������� ���� �Ұ�.");
			powerOff();
		}else {
			System.out.println("������ �մϴ�");
		}
		
	}
	//powerOff���� main�� ������ �Ǵ� ����:
	//static������� '�޸�'�� ���� �ֱ� ����
	//main���� powerOff�� ������ �ȵǴ� ����:
	//'�޸�'�� ���� ����.
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
		//main(null);
	}
	
	//void���� void�� �ƴ����� ���� ����Ÿ���� �����ȴ�.
	//���� �˰��ִ� ��� Ÿ��=.����Ÿ������ ����� ����
	//void:������ ����(�۾� �� ����� �ʿ䰡 ����)
	
	//returnŸ���� void�� �ƴϰ� �־����� �ش��ϴ� Ÿ���� ��ȯ�ϴ� returnŰ���尡 �ݵ�� �ʿ��ϴ�.
	int test() {
		
		return 0;
	}
	
	int plus(int num1,int num2) {
		return num1+num2;
	}
	
	int plus3(int num1,int num2,int num3) {
		
		return num1+num2+num3;
	}
	
	
	public static void main(String[] args) {
		//powerOff();
	}
	
}
