package pack02_static;

public class Ex01_Static {
	//static�� ���ο� ���� ����� �����Ѵ�.
	//static�� ���ο� ���� �޸𸮿� �ö󰡴� ������ �ٸ���.
	//��� : Ŭ������ ��� => Ŭ������ �߰�ȣ ���̿� �ִ� ��� �͵�
	
	static void sMethod() {
		System.out.println("����ƽ����Դϴ�.");
//		Ex01_Static es= new Ex01_Static();
//		iMethod(); //���ٺҰ�
	}
	//�ν��Ͻ� ���(�޼ҵ�)
	void iMethod2() {
		iMethod();//�ν��Ͻ� (���ٰ���)
		sMethod();//����ƽ (���ٰ���)
	}
	
	
	//�ν��Ͻ�(instance) ���
	void iMethod() {
		System.out.println("�ν��Ͻ� ����Դϴ�.");
	}
	//static : ���α׷� �������� ���� �޸𸮿� �Ҵ�, ���α׷� ���� �� �Ҹ�
	//instance : �ν��Ͻ�ȭ �����Ŀ� �޸𸮿� �Ҵ�, ���α׷� ���� �� �Ҹ�
	
	//static���
	public static void main(String[] args) {
		//����޼ҵ忡�� iMethod ȣ���غ���
		//Ex01_Static es = new Ex01_Static();
		//es.iMethod();
		Ex01_Static.sMethod();
		if(true) {
			Ex01_Static es= new Ex01_Static();
			es.iMethod();
		}
	}
}
