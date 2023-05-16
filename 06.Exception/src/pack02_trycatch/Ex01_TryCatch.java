package pack02_trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex01_TryCatch {
	//try{
		//����(����)�� �߻��� ���ɼ��� �ִ� �ڵ� (�ڵ� ��ü�� ����)
		//a< =x(�ڵ尡 ������)
		//Integer.parseInt(sc.nextLINE()); < =������� �Է��� ���ڷ� �ٲٴ±��.
		
	//}(exception e){
		//���ܰ� �߻��� �ÿ� ó���� �ڵ�(����ڵ�)
	//}���� finally{
	//������ �ѹ� ����Ǿ�� �ϴ� �ڵ尡 �ִٸ� �־���.
	//�����ͺ��̽��� ������ �����ϰų�, ������ ���´�.(ť��)
	//}
	
	//�����ڵ������� �������� �� ������ �߻��ϰ� �ڵ��غ���.
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch (Exception e) {
			System.out.println("������ �߻���");
		}
		System.out.println("������� �����̵ǳ���?");
		
		//[������ ����]
		//���ϵ�������� : ����
		//			�����α׷��� ������ �ȵ�(�׷���ī��,�޸� ����� ������)
		//�����Ʈ�������� ����: ������ ���� �� ���� (Exception)
		//			-Oracleȸ�翡���� ��� ���ܵ��� Ŭ�󽺷� ���� ������
		//			-ex) NullPointerException:null�� ���¿��� ��� ���(����x)
		
		//[������ ����]
		//���Ȯ�� ����(���� ����)
		//	-���α׷��� ���� �غ��߸� ���ܰ� �߻��ϴ��� �� �� �ִ�.
		//	-���α׷����� �Ǽ�, ���迡 ���ؼ� �߻� : �����(���� ����) �۾��� ����.(���� ���� ����)
		
		//��Ȯ�� ����(�Ϲ� ����)
		//	-���α׷� �ۼ��� (�ڵ�)�� �ݵ�� ����ó���� ����߸� ����� ������ �͵��� ����(����o)
		//	-try{}catch{}���ָ� �ذ� ��.
		
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
}
