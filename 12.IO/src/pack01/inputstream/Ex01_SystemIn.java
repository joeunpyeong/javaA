package pack01.inputstream;

import java.io.IOException;
import java.io.InputStream;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex01_SystemIn {
	public static void main(String[] args) {//main�޼ҵ�==����Tread(�޸𸮸� �Ҵ�޾� ���α׷��� ���۵�)
		//Scanner �̿�� System.in?
		try {
			int data =System.in.read();//�ַܼκ��� �Է¹��� �����͸� byteŸ������ �ް� ��
			System.out.println(data);
			InputStream is = System.in;//��� ��Ʈ��:������� ����Ǵ� ��Ʈ��(static)
		} catch (IOException e) {//Input,Output:�����Ͱ� �����ų� ������ �߰��� ������ ����� �ݵ�� ����ó���� �������
			e.printStackTrace();
		}
	}
}
