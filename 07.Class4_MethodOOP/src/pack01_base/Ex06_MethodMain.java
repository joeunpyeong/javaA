package pack01_base;

public class Ex06_MethodMain {
	public static void main(String[] args) {
		Ex06_Method em = new Ex06_Method();
		em.method1();
		em.method2("22");
		em.isMethod3();
		em.isMethod4(10);
		System.out.println();
		
		//�޼ҵ忡 ����Ÿ���� �־����� �ش��ϴ� Ÿ���� ������� ���� ��
		//�޼ҵ忡 ����Ÿ���� ������ �ƹ�Ÿ�Ե� �ƴ�. (������ �������� �ڵ��)
		boolean isMethod=em.isMethod3();
		System.out.println(isMethod);
		System.out.println(em.isMethod3());
		
		//���ǽ� �ٽ�: true of false �ϰ�
		boolean isBoolean=1<2;
		if(em.isMethod3()) {
			
		}else {
			
		}
		System.out.println(em.aMethod()[0]);
		System.out.println(em.dMethod());
		System.out.println(em.sMethod());
		
		em.method2("");
	}
}
