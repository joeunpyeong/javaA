package pack03_for;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++ ) {
			for(int j=1 ; j<=i ; j++ ) {
				System.out.print("��");	
			}
			System.out.println("");
		}

	
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ ����ұ��? ");
		int num=Integer.parseInt(sc.nextLine());
		if(num>1) {
			for(int i=2 ; i<=num ; i++) {
				System.out.println(i+"��");
				for(int j=1 ; j<=9 ; j++) {
				System.out.println(i + "*" + j + "= "+(i*j));
				}
			}
		}else {
			System.out.println("�߸��� ����");
		}
	
	}
}
