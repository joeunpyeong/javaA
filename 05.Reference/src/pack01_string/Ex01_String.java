package pack01_string;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		//String : �⺻�� ����x, ������ ����
		//������ ������ �����̶�� �޸� ������ �� ������ �ּҸ� �����ϰ� ���� ����
		//�� ������ �ִ� ����.(�⺻�� ������ �� ���� ���x)
		String strVar1="JEP";
		String strVar2="JEP";
		//�ΰ��� ������ �� ����� true false ?
		//true
		if(strVar1==strVar2) {
			System.out.println("strVar1 ���� strVar2");
		}else {
			System.out.println("strVar1 �ٸ� strVar2");
		}
		
		//new < = �� ������ ������ �����. (�ν��Ͻ� ����)
		String strVar3 = new String("JEP");
		String strVar4 = new String("JEP");
		
		Scanner sc= new Scanner(System.in);
		String strVar5 = sc.nextLine();
		if(strVar1 == strVar5) {
			System.out.println("strVar1 == strVar5");
		}else if(strVar3==strVar5){
			System.out.println("strVar3 == strVar5");
		}else {
			System.out.println("strVar1, strVar3, strVar5");
			
		}
		
		if(strVar3==strVar4) {
			System.out.println("strVar3 ���� strVar4");
		}else {
			System.out.println("strVar3 �ٸ� strVar4");
		}
		
		
		//
		
	}
}
