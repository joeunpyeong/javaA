package pack02.inter;

public class Audio implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio�� ������ �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ������ ���ϴ�.");
	}
	
	public void audio() {
		System.out.println("Audio���� ���� ���");
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
		System.out.println("���� Audio ����"+this.volume);
	}
	//�������̽��� ��ӹ޾� ������ Audio�� ��ü �޼ҵ带 RemoteMain���� ���� ȣ���غ���.

}
