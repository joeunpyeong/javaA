package pack01.thread;

//extends:Ŭ����Ÿ���� ���(�Ѱ��� ��밡��):Ŭ������ ��� ���(private����)�� ��ӹ����� ���
//implements: �������̽��� ���(������ ����): �����(�޼ҵ带 ��ӹޱ����� �ַ� ���)

public class Ex04_BeepThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("������ ���");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
