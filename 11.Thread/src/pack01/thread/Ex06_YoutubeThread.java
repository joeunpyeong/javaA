package pack01.thread;

public class Ex06_YoutubeThread extends Thread{
	public Ex06_YoutubeThread() {
		//Thread�� ��� �޼ҵ��߿� setName�̶�� setter�޼ҵ尡 ����.(�۾��� �̸��� �ִ� �޼ҵ�)
		setName("��Ʃ��");
	}
	
	@Override
	public void run() {
		for(;;) {
			System.out.println(getName() + ": 1�ʿ� �ѹ��� �������� ������Դϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
