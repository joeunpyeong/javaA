package pack02_trycatch;

public class Ex02_TryCatchFinally {
	public static void main(String[] args) {
		// �丮 : ������ ON , �丮 ���� , �丮 �� , ������ OFF , �Ա�(����)
		try {
			System.out.println("������ ON");
			System.out.println("�丮 ����");
			int errorInt = 10 / 0 ;//�丮�ϴٰ� ���ڱ� �������� ����.(����)
			//System.out.println("�丮��");
			//System.out.println("������ OFF");
			//System.out.println("����");
		}catch (Exception e) {
			System.out.println("���� �߻�");
		}finally {
			//�ݵ�� ����Ǿ���ϴ� ����(�ڵ�)�� �ִٸ� �־��ִ� �κ�
			System.out.println("�丮��");
			System.out.println("������ OFF");
			System.out.println("����");
		}
	}
}
