package pack02_field;

public class Ex01_CarMain {
	public static void main(String[] args) {
		int a;
		Ex01_Car myCar =new Ex01_Car();
		 //�ν��Ͻ�ȭ : ��ü(Ŭ����)�� �޸𸮿� �÷��� ����ϰ� ����� ��.
		//���ο� �ִ� ��� ����� �޸𸮿� �ö󰡴� ��.
		System.out.println("������:"+myCar.company);
		System.out.println("�𵨸�:"+myCar.model);
		System.out.println("�ְ�ӵ�:"+myCar.color);
		System.out.println("����ӵ�:"+myCar.speed);
		
		System.out.println("����ڰ� ȭ�鿡 ������ ���⸦ ������.");
		myCar.speed = 30;
		System.out.println(myCar.speed+"�� ������ �޸��� ����.");
		
	}
}
