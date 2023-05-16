package pack01.thread;

import java.awt.Toolkit;

public class Ex03_BeepThread {
	public static void main(String[] args) {
		//�������� Runnable�� ��ӹ���  BeepTask��� Class�� ����� �ش��ϴ� Class�� �̿��ؼ�
		//Thread�� �����Ͽ� �������
		//�̹����� interfaceŸ���� �Ķ���ͷ� �Ѱܼ� ����ϴ� ����� ����غ���
		
		Runnable run = new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0;i<5; i++) {
					toolkit.beep();//���� �ܿ��� ���� x, �̹� �� å������ �ֱ� ������ �����
					System.out.println("��η�");
					//���ξ����尡 ����ؼ� �۾��� �ϴ°� �ƴ϶�, �� �� ������ �����ð�(����)�� ������
					//�����ϰ� ó��.
					try {
						Thread.sleep(1*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				//Runnable�� interface�ε� interface���ο� �ִ� �޼ҵ�� ��ü�� ������ �� �ݵ��
				//������ �Ǿ���Ѵ�. ���� �޼ҵ尡 �־�� �� �͸��� ������ ����� run �޼ҵ尡 
				//�ݵ�� ������ ���·� ��ü������ �ȴ�.
			}
		};
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0;i<5; i++) {
					toolkit.beep();//���� �ܿ��� ���� x, �̹� �� å������ �ֱ� ������ �����
					System.out.println("��η�");
					//���ξ����尡 ����ؼ� �۾��� �ϴ°� �ƴ϶�, �� �� ������ �����ð�(����)�� ������
					//�����ϰ� ó��.
					try {
						Thread.sleep(1*1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		});
		
	}
}
