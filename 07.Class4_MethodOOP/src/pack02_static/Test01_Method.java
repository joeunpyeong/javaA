package pack02_static;

public class Test01_Method {
	//1.����ڷκ��� �ܼ�â�� ���� id�� pw�� �Է¹޴´�.
	//2.id�� pw�� Test01_Method�� login�̶�� �޼ҵ忡 �����Ͽ�
	//id�� master ,pw�� master1234�̸� true, �� �ܿ��� false�� �����ϰ� �����.
	//3.�ش� ����� ���� �α��εǾ����ϴ�. �α��� ���а� �ܼ�â�� ������ �����
	
	//4.Scanner��ü�� Test01_Method���ο� �޼ҵ� ������ ���ؼ� �����޾� ����ϰԲ� ó��
	
	
	boolean login(String id, String pw) {
		
		if(id.equals("master")&&pw.equals("master1234")) {
			System.out.println("�α��εǾ����ϴ�.");
		
			return true;
		}else {
			System.out.println("�α��� ����\n");
			return false;
		}
		
	}
	
	
}
