
public class GetterSetter {
	private int age ; // GetterSetterMain�̶�� Ŭ������ ���θ޼ҵ带 �����, �ش� Ŭ�������� , -���� 0�� �Է¾ȵǰ� 
							// ó���غ���.
							// Scanner sc = new Scanner(System.in);
							// 

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 1) {
			System.out.println(" �߸���");
		}else {
			this.age = age;			
		}
	}
	
	
	
	//1.�����ڳ��� ������ ��Ȯ�� �޼ҵ��� ����� �Ǵ��ϱ�
	//�����(���� �Ǵ� �Ұ�)
	//==> getter & setter��� �޼ҵ� �̸���Ģ������.
	//getMethod : �ʵ��� ���� �޾ƿö���
	//setMethod : �ʵ��� ���� ��������
	
	//2. �ٸ������ڴ� �޼ҵ��� ���翩�θ� �𸣰�
	//������ �ٷ������ؼ� -���� ������������.
	//==> private
	
//	public void method(int num) {
//		if(num < 1) {
//			System.out.println("�߸����Է�");
//		}else {
//			System.out.println("�ߵ��Է�");
//			age = num;
//			System.out.println(age + " gs.age�� ��");
//		}
//	}
}
