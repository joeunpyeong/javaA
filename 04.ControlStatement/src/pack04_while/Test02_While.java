package pack04_while;

import java.util.Scanner;

public class Test02_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ũ�� �Է� : ");
		int num = Integer.parseInt(sc.nextLine());
		int i=1, j=1;
		while(i<=num) {
			while(j<=i) {
				System.out.print("��");
				j++;
			}
			System.out.print("\n");
			j=1;
			i++;
		}
		i=2;
		j=2;
		
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(sc.nextLine());
		while(i<=num) {
			while(j<=9) {
				System.out.print(i+"*"+j+"="+(i*j)+"  ");
				j++;
			}
			System.out.print("\n");
			j=2;
			i++;
		}
		
	}
}
