package extend.imp;

public class ChildClass extends SuperParent {
	//extends : ��� ����� ���(private����)+Ŭ������ ���
	
//	int superField=10;
//	
//	void superMethod() {
//		System.out.println("Supper");
//	}
	
	public static void main(String[] args) {
		ChildClass cc=new ChildClass();
		System.out.println(cc.superField);
		cc.childMethod();
		cc.testMethod();
		cc.testMethod2();
		
		//cc.interField=10;
		System.out.println(cc.interField);
		
	}
	
	public void childMethod() {
		System.out.println(superField);
		superMethod();
	}
	
}
