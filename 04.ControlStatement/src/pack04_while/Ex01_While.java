package pack04_while;

public class Ex01_While {
	//for( �ݺ��� ����� ���� �ʱ�ȭ ��; ���ǽ�;������) {
	//	���� �ݺ��� �ڵ� (����)
	//}
	
	//���� �ʱ�ȭ ��
	//while(���ǽ�){
	//		�ݺ��ϴ� ����
	//		������ or break�� �̿��� �ݺ��� ����
	//}
	//for�� : �ݺ�Ƚ���� ��Ȯ�ϰ� �� �� ���� ���ؼ� �ݺ���Ű�� ���
	//while�� : �ݺ� Ƚ���� ��Ȯ�ϰ� �� �� ���ǿ� ���ؼ� �ݺ���Ű�� ���
	public static void main(String[] args) {
		int i=0;
		while(i<10) {
			System.out.println("i");
		}
	
		int j=1;
		while(j<=50) {
			System.out.println(i);
			i+=2;
		}
	}
}
