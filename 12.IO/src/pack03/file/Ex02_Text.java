package pack03.file;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02_Text {
	public static void main(String[] args) {
		//�о����(�ؽ�Ʈ ������ �о����)
		try {
			//��Ŭ������ ���ϸ����� ���ؼ� ���Ͻ�����ο� �����Ҷ��� ������ ���� ������ ���� �ȵǴ� ��쵵 ����
			//�ش��ϴ� ����� ���ݸ� ����� �ϰ� ���߿��� File��ü�� ũ���� ���ؼ� �޾ƿü��� �ִ�.
			Reader reader = new FileReader("D:\\Study_java\\WorkSpace\\12_IO_FileTest\\Ex02_Text.txt");
			//�����ϱ�(��� �ܿ��x)->file��� Ȯ���ϴ� EX01���� ���ذ� �ʿ���
			String str="";
			char[] buffer=new char[5];
			int readCharNum=reader.read(buffer);//�� ���ڸ� ���������� (�� ����Ʈ�� �ִ���)
			System.out.println(readCharNum);
			for(int i=0;i<buffer.length;i++) {
				System.out.println(buffer[i]);
			}
			
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
