package pack01.thread;

import java.awt.Toolkit;

//Runnable�̶�� �۾� �������̽�:implements<==���ο� �ִ� ��带 �U�� �����ϰڴ�.
public class Ex02_BeepTask implements Runnable{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0;i<5; i++) {
			toolkit.beep();//���� �ܿ��� ���� x, �̹� �� å������ �ֱ� ������ �����
			System.out.println("��η�");
			//���ξ����尡 ����ؼ� �۾��� �ϴ°� �ƴ϶�, �� �� ������ �����ð�(����)�� ������
			//�����ϰ� ó��.
			try {
				Thread.sleep(1*2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}