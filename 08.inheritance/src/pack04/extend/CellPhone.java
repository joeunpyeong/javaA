package pack04.extend;

public class CellPhone {
	//1���� ��: ������ �Ѱ� ���� ��ɰ�, ��ȭ ����� �ִ� �޴���
	String model;
	String color;
	final String CHIP="";//final�̶�� ���� ó���� �� �Ҵ� ���Ŀ��� *���� ������ �Ұ���*�ϴ�.(final==����)
						//������ ǥ���ϴµ� ������ �̸��� �������� �ݵ�� ��ü �빮�ڷ� ���ش�.(�����ڳ��� �˾ƺ��� ����)
	
	//powerOn:syso�� ������ �մϴٰ� ����� �Ǵ� return�� ���� �޼ҵ�
	//powerOff:syso�� ������ ���ϴٰ� ����� �Ǵ� return�� ���� �޼ҵ�
	//bell:syso�� ���� �︳�ϴٰ� ���
	//sendVoice:String ���� �Է¹޾� ��:String���� syso�� ����ϴ� �޼ҵ� 
	//receiveVoice:����:String�� ���
	//hangUp:��ȭ�� �����ϴٰ� ���
	
	private void changeFolder() {
		System.out.println("1���� ���� �� Ư���� ȭ���� ���ư��� ����Դϴ�.");
	}
	
	
	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	public void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	public void sendVoice(String input) {
		System.out.println("  ��  :"+input);
	}
	public void receiveVoice(String input) {
		System.out.println("����:"+input);
	}
	public void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
	
}
