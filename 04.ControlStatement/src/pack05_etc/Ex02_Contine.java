package pack05_etc;

public class Ex02_Contine {
	public static void main(String[] args) {
		//continue: < = > break;
		//break : ����� ��������
		//continue : �ݺ������� continue�� ������ �ؿ� �ڵ带 ����x ,�ݺ��� (���ǽ�)�κ����� �̵�
		//�ݺ���
		//continue ���󵵰� ���� ������ ����. ������ �˰�������ȴ�.
		for(int i = 1 ; i<=10 ; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}