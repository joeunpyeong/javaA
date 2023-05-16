package pack01.nasted;

public class A {
	
	int aField = 10; // ����߿� ����ϱ�? : Main���� aField�� ����غ���.
	//�ν��Ͻ�ȭ �������� ���Ǵ� ������ �޼ҵ�� ������ �������������� A(){ }�� �����ǰ��ִ�(JVM ����)
	public A() {
		
	}
	
	//�س��� �˰��ִ� ���͵��� �ʵ�(���)�� �ɼ��ִ�.��
	// B�� �������ִ� ���� bField��  , methodB�� Main.java(main �޼ҵ�)���� ����غ���.
	public class B{ //
		 B() { System.out.println("B��ü ������");		}
		int bField = 10;
		
		void methodB() {
			System.out.println("�޼ҵ�");
		}
	}
	
	
	static class C{
		static int fieldCs = 10 ;
		 
		C() { System.out.println("C��ü�� ������");		}
		 int fieldC;
		 void methodC() {
			 System.out.println("C�޼ҵ�");
		 }
	}
	
	//A�� ��� 
	// � ����̵� ������� D�� ������� ����ϰ� ����غ���
	public void methodD() {
		// A�� ����ϱ�? �ƴұ�?
		class D{
			D() { System.out.println("D�� ������"); }
			int fieldD ;
			void methodD() { 
				System.out.println("�޼ҵ� D");
			}
		}
		D d = new D();
		System.out.println(d.fieldD);
		d.methodD();
	}
	
	//��? // �������� , ���ú���
	// �޼ҵ� �������� ����̰�����.
	int methodA() {
		int data = 10 ;
		return data;
	}
	
	// static : �޸𸮿� ���� �ö����� <- �ش�Ÿ��(A)�� .������ ���� �� ��밡��
	// instance : �޸𸮿� new�Ҷ� �ö� <- �ν��Ͻ�ȭ �� ��ü�� .������ ���� �� ��밡��
	
	public static class AA{
		public static class AAB{
			void moethdAAB() { System.out.println("AAB!");}
		}
		public class BB{
			void moethdAAB() { System.out.println("BB!");}
			public class CC{
				void moethdAAB() { System.out.println("CC!");}
				public class DD{
					int a = 10;
				}
			}
		}
	}
	
	
	
}
