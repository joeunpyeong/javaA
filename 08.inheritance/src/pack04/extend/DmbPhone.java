package pack04.extend;

public class DmbPhone extends CellPhone{
	//1������ ����� ���� ��� �����ϸ� +�� Dmb����� �߰��� �ֽ���
	int channel;//Dmb��� ��� �� ä���� �ǹ��ϴ� ����
	//������ �޼ҵ带 ����µ� ���� ��,ü���� �ԷµǾ������ ������ �����ϰ� �غ���

	public DmbPhone(int channel, String color, String model) {
		this.channel = channel;
		this.color = color;
		this.model = model;
	}
	
	void turnOnDmb() {
		System.out.println("ä��"+channel+"�� DMB��� ���� ����");
	}
	//changeChannel�̶�� �޼ҵ带 ����µ�, ����ڰ� �Ķ���ͷ� �Ѱ��� ü�η� ���� ��
	//DMB��� ���� ������ �Ƿ��� ��� �����ϸ� ������?
	void changeChannel(int channel) {
		this.channel=channel;
		turnOnDmb();
	}
	
	void turnOffDmb() {
		System.out.println("��� ���� ����");
	}
	



}