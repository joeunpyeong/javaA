package pack02.inter;

public class Television implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV�� ������ �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ������ ���ϴ�.");
	}
	
	public void audio() {
		System.out.println("TV���� ���� ���");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
			this.volume=MAX_VOLUME;
		}else if(volume<MIN_VOLUME) {
			this.volume=MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("���� TV ����"+this.volume);
	}
	//�������̽��� ��ӹ޾� ������ Audio�� ��ü �޼ҵ带 RemoteMain���� ���� ȣ���غ���.
	
}
