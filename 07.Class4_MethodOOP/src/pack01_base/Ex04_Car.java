package pack01_base;

public class Ex04_Car {
	//�ش��ϴ� CarŬ������ �Ӽ� gas�� ������.
	//gas�� �������·μӼ��� ������ �ȴ�.(1. Ex04_Car�� gas�� ������ �Է¹޾ƾ����� ������ ������ Ŭ�����̴�.)
	
	//isLeftGas��� �޼ҵ带 �����ϱ�
	//�ش��ϴ¸޼ҵ�� true�Ǵ� false�� ����� �����ϴ� �޼ҵ�
	//true,false�� �Ǵ��� gas�� 0�� ��� false�� gas�� �����ϴ� ��� �޼����� ���
	//�װ� �ƴ϶�� true�� gas�� �ֽ��ϴ� ��� �޼��� ���
	
	//Ex04_CarMain�� ����� ��� ����� �����ؼ� ȣ�� �� ����غ���
	int gas;

	
	public Ex04_Car(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("������ �����ϴ�.");

			return false;
		}else {
			System.out.println("������ �ֽ��ϴ�.");

			return true;
		}
	}
	
}
