
public class Member {
	//��ŷ : ������ ���۰� ��, ���ο� ����ִ� ��� �͵��� ���
	//static ����.
	
	int field=1;			//�ν��Ͻ� ���
	static int sField=2;	//����ƽ ���
	
	//�ν��Ͻ�ȭ : Ŭ������ ������ �ִ� ����߿� �ν��Ͻ� ������� �ĸ𸮿� �÷��� ��� �����ϰ� �ϴ� ����
	//				(�ν��Ͻ�ȭ ������ ���������� ��ü ����� ��� ������, �ܺο���  private)
	//������(Constuctor)�޼ҵ� : Ŭ�������޸𸮿� �ö󰥶� ����� ������ ==Ŭ������ �̸��� ��ҹ��ڰ� ��Ȯ�� ����
	
	public static void main(String[] args) {
		Member mm = new Member();//�ν��Ͻ�ȭ ����: new'Member();'������ �޼ҵ�
		System.out.println(sField);
		System.out.println();
	}


}
