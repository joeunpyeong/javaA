package pack01.inputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05_Buffer {
	public static void main(String[] args) throws IOException {
		//Ű���忡�� ���� ���ڸ� �Է¹޾Ƽ� �� ������ �۾�:Scanner���� ���� ���ؿ��� ����Ǯ�� Buffer����� ������
		//InputStream =>InputStreamReader =>BufferedReader 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String inputData = br.readLine();
		System.out.println("�Է��Ͻ� ���ڴ�"+inputData+"�Դϴ�.");
		br.close();//����� �ݾ��ش�(������ ����.)
		
	}
}
