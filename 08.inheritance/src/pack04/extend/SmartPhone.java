package pack04.extend;

public class SmartPhone extends DmbPhone{
int internet;//< =SmartPhone ���� �� �Է¹޾� �����ϰ� ������ �޼ҵ带 ����� ����.
//DmbPhone dmb=new DmbPhone(param..)

	//Override : ������: �θ�Ŭ������ ����� �״�� �ΰ� ����� ���� �߰��ϴ� ���
	@Override
	public void powerOn() {
		System.out.println("�Ｚ�� �ΰ� 3D�� �����̸鼭 �ε�ȭ���� ����");
		super.powerOn();
	}
//	@Override
//	public void sendVoice() {
//		System.out.println("�Ｚ�� �ΰ� 3D�� �����̸鼭 �ε�ȭ���� ����");
//		super.sendVoice();
//	}
	


	public SmartPhone(int channel, String color, String model, int internet) {
		super(channel, color, model);//�θ�Ŭ������ ������ �����ڸ޼ҵ带 ������ �ִٸ�
						//�ش��ϴ� �θ�Ŭ������ �ν��Ͻ�ȭ�Ǿ������, �ڽ� ��ü�� ������ �����ϴ�.
		this.internet=internet;
	}
	void internetOn() {
		System.out.println("���ͳ��� �մϴ�");
	}
	void internetOff() {
		System.out.println("���ͳ��� ���ϴ�");
	}

}
