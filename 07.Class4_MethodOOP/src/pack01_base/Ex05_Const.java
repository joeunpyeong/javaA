package pack01_base;

public class Ex05_Const {
	int id;
	String pw;
	//�޼ҵ� ����:�޼ҵ� �̸�(){}
	//�����ڸ޼ҵ�:Ŭ���� ���ο� ������ Ŭ������ �̸��� ����.
	//Ex05_Const��� Ŭ������ �ݵ�� int�� ������ 1���� String�� ������ 1���� �ԷµǾ�� ��������
	//������ �޼ҵ� �����ε� : ���� �̸��� �޼ҵ带 �Ķ������ ������ Ÿ���� �޸��Ͽ� �ߺ����� �����ϴ� ��
	
	
	public Ex05_Const(int id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public Ex05_Const(int id) {
		super();
		this.id = id;
	}
	//� �޼ҵ尡 ȣ��Ǿ����� ��ȣ�� ������� ��ǻ�ʹ� ������� �ν��Ѵ�.(true or false)
	//public Ex05_Const(int id, String pw){
	//	this id=id;
	//}
	
}
