package pack01.inter;

//extends <-Ŭ������ ��� : ���ο� �ִ� ��� ����� �����޾� ��� �����ϰ� �Ѵ�.(���� ���)
//implements <-�������̤��� ���:�������̽� ���ο� �ִ� ��� �޼ҵ���� �������ؼ� ������ �� �ְ� ����
//�������̽�:� ��� (�޼ҵ�)�� ���� �� ���� �����Ѵ�.(abstract)
public class TestMain implements TestInterface{
	@Override
	public void test1() {
		
	}

	@Override
	public boolean join(String id, String pw) {
		//������(��� ������ ������)
		return false;
	}

	@Override
	public void test2() {
		//�޼ҵ� ���� ��ü�� ���� ���� ����
		
	}
}
