package pack01_base;

import java.util.Scanner;

public class Ex06_Method {
	//return�� ���� �޼ҵ� 2�� (�Ķ���� ����,����)
	//return�� �ִ� �޼ҵ� 2�� (�Ķ���� ����,����)

	//�̸� Ÿ�� ���� ���� ����
	//����Ÿ�� �޼ҵ��(�Ķ���ͺ�){
	
	//}
	void method1() {
		System.out.println("method1");
	}
	void method2(String data) {
		System.out.println("method2"+data);
	}
	boolean isMethod3() {
		//boolean temp=true;
		System.out.println("method3");
		return true;
	}
	boolean isMethod4(int data) {
		System.out.println("method4"+data);
		return false;
	}

	String sMethod() {
		
		return "";
	}
	double dMethod() {
		return 2.2;
	}
	int[] aMethod() {
		return new int[1];
	}
	Scanner scanMethod() {
		return new Scanner(System.in);
	}
}

