package pack05_etc;
import java.util.Scanner;

public class Ex_Break {
	public static void main(String[] args) {
		//break���� ����� �����ϰ� ���������� ���
		//���ѷ����ϴ� �ݺ��� �ؿ� �ڵ尡 ������ ����.(������ ���� x �ڵ�)
//		
//		while(true) {
//			while(true) {
//				break; //�ϳ��� ����� �ش���.
//			}
//			break;
//		}
		//���ѷ����� ����� ���� ���Ḧ���Ҷ��� ����ǰ� �����.
		//��ĳ�ʷ� -1�� �Է��ϸ� ���ѷ����� ����ǰ� ������.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int userNum = Integer.parseInt(sc.nextLine());
			if(userNum==-1) {
				break;
			}else if(userNum == 1) {
				System.out.println("1�� �޴��� ���� �ڵ�");
			}else {
				System.out.println("�߸��� �Է�");
			}
		}
		System.out.println("���");
		
		
	}
}
