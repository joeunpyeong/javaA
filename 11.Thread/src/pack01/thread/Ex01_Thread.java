package pack01.thread;

import java.awt.Toolkit;

public class Ex01_Thread {
	//main <==�ڹ��� �������� ������ ���� �������̱� ������1���� �۾�)
	public static void main(String[] args) {
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
}