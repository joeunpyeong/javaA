package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01_List {
	public static void main(String[] args) {
//		Collection Framework
//		Collection: �ڷḦ �����ؼ� ������ ���� �� �ִ� ����� ���� �ڷᱸ��(Ŭ����,�迭)
//		FrameWork:� �����̳� ����� �̸� ���� ����ϰ� ����������(����)ex)������vs�޹�
//		List<Extends Object> list= new ...<>();
//		List�� Object�� ��ӹ��� ��üŸ�Ը� �����͸� �����ϰ� �س���.(Ŭ����)
//		List<���� ������ Ÿ��(DTO)>list=new  �ڷᱸ��Ÿ��(...);
//		List<E>���� E�� ��� (Element):� ������ ���ο� ������ �������
		List<String> list = new ArrayList<String>();//ArrayList�� Ex03~04��뿹��
		list.add("java1");
		list.add("java2");
		list.add("java3");
		list.add("java4");
		list.add("java5");
		list.add(3,"�����ֱ�");//�� ��� ����(DB���� �����ؿ� ������ ���ռ��� ������ �ֱ� ������)
		System.out.println(list.size());//�迭�� arr.length��� ������ ũ�⸦ �޾ƿ� �� ����
		System.out.println(list.get(0));//list�� �迭�� ���������� 0���� �����ؼ� ũ�� -1������ index�� ����
		System.out.println(list.get(1));//list�� �迭�� ���������� 0���� �����ؼ� ũ�� -1������ index�� ����
	
		for(int i=0 ; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//list�� ������ for���� �̿��ؼ� ���� �����غ��� (ex 1���� �迭 ���� ���:?)
	}
}
