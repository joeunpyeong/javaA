package pack03_for;

import java.util.Iterator;

public class Ex01_For {
	public static void main(String[] args) {
		//�ݺ��� : for��(loop��, looping, ��ȯ)
		//�������:���� ������� �ݺ����� �۾��� ����.(��Ȯ, ����)
		//for(�ݺ��� ����� �����ʱ�ȭ; ���ǽ� ; ������){
			//�ݺ�����
		//}
		//		  
		//for(��int i=0 ; ��i<10 ; ��i++){
			//i�� 0���� �����ؼ� 9���� �� 10�� �����ϴ� �ݺ���
		//}
		
		for (int i = 0; i<10 ;) {//���� ����: �߸��� �ݺ����� ����
			System.out.println("for�� ���� i�� �� : "+i);
			break;
		}
		
		int num = 0;
		for (int i=0 ; i<18951 ; i+=2) {
			System.out.println("for�� ���� i�� �� : "+i);
			num=i;
		}
		System.out.println("i�� �� = " + num);
	}
}
