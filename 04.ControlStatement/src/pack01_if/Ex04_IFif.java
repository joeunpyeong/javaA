package pack01_if;

import java.util.Scanner;

public class Ex04_IFif {
	public static void main(String[] args) {
		//��ŷ�� �⺻���� :{< =�޸𸮿� �ø�} < = �޸𸮿��� ����
		//�ڹ����α׷��� �޸𸮸� ȿ�������� ���� ���ؼ� �޸𸮿� �ø��� ������ ������ ������
		//��ŷ(����)�� ����ؼ� ��ø�� �����ϴ�.
		//����� 3�� �̻� ��ø�� �Ǵ� ��쿡�� ���� �ڵ带 �°� ¥���� �ǽ��غ� �ʿ䰡 ����
		//���İ�Ƽ �ڵ� : �ڵ带 �̻��ϰ� ���Ƽ� ¥����. (���߽� ���� ȥ�� ���ɼ� ����)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		int score = Integer.parseInt(sc.nextLine());
		
		if(score%2==0) {
			System.out.println("¦��");
			if(score==10) {
				System.out.println("10");

				if(score<11) {
					System.out.println("11���� ����");
				}else {
					System.out.println("11���� ŭ");
				}
			}else {
				System.out.println("10�� �ƴ�");

				if(score<11) {
					System.out.println("11���� ����");
				}else {
					System.out.println("11���� ŭ");
				}
			}
			
		}else {
			System.out.println("Ȧ��");
			if(score==10) {
				System.out.println("10");

				if(score<11) {
					System.out.println("11���� ����");
				}else {
					System.out.println("11���� ŭ");
				}
			}else {
				System.out.println("10�� �ƴ�");

				if(score<11) {
					System.out.println("11���� ����");
				}else {
					System.out.println("11���� ŭ");
				}
			}
		}
		
		
	}
}

