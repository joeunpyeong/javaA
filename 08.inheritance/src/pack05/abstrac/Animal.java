package pack05.abstrac;

//�߻� Ŭ������� ���� ��ü�� ������� ����ϴ°� �ƴϴ�.
//��ü�μ� ����°� �ƴ϶� �θ�ν� ��ӹ��� ��ü���� ����� �̸� �����س��� ��(����)
//�߻�:abstract?

public abstract class Animal {
	
	public String kind;//������ �ĺ��ϱ� ���� �ʵ�:���,�����,������
	public void breathe() {
		System.out.println("������ ���� ����");
	}
	public abstract void sound();//abstract�޼ҵ�� �޼ҵ��� ����Ÿ���̳� �޼ҵ��� �̸� �Ű���������
									//������ ����� ���� 
}
