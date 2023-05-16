package pack01.list;

import java.util.ArrayList;

public class Ex04_ArrayList {
	public static void main(String[] args) {
		//���󵵰� ����. �迭�� ������ �����ϰ� ���ʿ��� ü�̴�, ��Ƽ������ ���� ����� ���� ������ ���� ���� ����.
		//List<E> list= new ArrayList<E>();
		//ArrayList<E> list = new ArrayList<E>();
		
		//StringŸ���� ��� ���� ������ Collection�ڷᱸ�� ArrayList�� �����ϰ� ������ 2���� �߰��غ���.
		ArrayList<String> strList = new ArrayList<>();
		strList.add("String 1");
		strList.add("String 2");
		//������ ������Ÿ���� ��� ���� ������... 2�� �߰��غ���
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		
		//�ο��� ������Ÿ���� ��� ���� ������... 2�� �߰��غ���
		ArrayList<Boolean> boolList = new ArrayList<>();
		boolList.add(true);
		boolList.add(false);
		
		//��ü ���� ���
		for(int i=0 ; i<strList.size();i++) {
			System.out.println("strList:" + i+"��° :"+strList.get(i));
			System.out.println("intList:" + i+"��° :"+intList.get(i));
			System.out.println("boolList:" + i+"��° :"+boolList.get(i));
		}
		
		//���� for��
		//for���� ������ �ٸ�: Collection�̳� �迭���� �ڷᱸ�� ���ο� Element�� �ѰǾ� ���־, �������� ���� ����.
		//for(���:�ڷᱸ��){�˾Ƽ� �ڷᱸ���� ũ�⸸ŭ �ݺ��� �ϸ� ���� ���ʿ�ҿ� �������� �ϳ��� ���鼭 �ݺ���.}
		
		for(String str:strList) {
			System.out.println(str);
		}
	}
}
