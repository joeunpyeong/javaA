package pack01_base;

public class Ex07_OverLoading {
	//�޼ҵ� �����ε�: ���� �̸��� �޼ҵ带 �Ķ������ ������ Ÿ���� �޸��Ͽ� �ߺ����� �����ϴ� ��
	void method() {
		
	}
	void method(int param1) {
		
	}
	void method(int param1,int param2) {
		
	}
	
	public static void main(String[] args) {
		Ex07_OverLoading eo = new Ex07_OverLoading();
		//��ǥ������ �޼ҵ� �����ε��� �Ǿ��ִ� ���� println��
		//� Ÿ���� �־ �ϴ� ����� �ǰԲ� ��������.
		System.out.println("");
		eo.method(0, 0);
	}
}
