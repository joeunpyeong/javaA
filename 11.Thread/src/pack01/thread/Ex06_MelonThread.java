package pack01.thread;

public class Ex06_MelonThread extends Thread{
	public Ex06_MelonThread() {
		//Thread�� ��� �޼ҵ��߿� setName�̶�� setter�޼ҵ尡 ����.(�۾��� �̸��� �ִ� �޼ҵ�)
		setName("���");
	}
	
	
	@Override
	public void run() {
		for(;;) {
			System.out.println(getName() + ": 3�ʿ� �ѹ��� ������ ������Դϴ�.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
