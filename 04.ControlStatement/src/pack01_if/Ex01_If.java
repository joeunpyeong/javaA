package pack01_if;

import java.util.Scanner;

public class Ex01_If {
	public static void main(String[] args) {  // { ���α׷��� ������
		//if��:��� �߿� ���ǹ��̴�.
		//� ������ �ְ� �ش� ������ TRUE�϶��� ����(��ŷ)�� ����� �� ������ �ڵ带 �����Ѵ�.
		//���׿����ںκ��� ���� ����� ��밡��=>if���� ������ �ڵ��� ����ν� ����� �����ϴ�.
		//if(���ǽ� ��TRUE�� FALSE�� ����� ���� �� �ִ� ��){
		//	���ǽ��� TRUE�� �� �����ϴ� �κ�	
		//}
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int score = Integer.parseInt(sc.nextLine());//������ �Է¹޾ƿ� ID�� PW�� ���� �� �����.
		if(score>=90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A����Դϴ�.");
		}
		System.out.println("������� �������?");
		
		if((score%2) == 1){
			System.out.println("Ȧ���Դϴ�.");
		}
		if((score%2) == 0){
			System.out.println("¦���Դϴ�.");
		}
	}// } ���α׷��� ����
}
