package pack01.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex03_LinkedList {
	public static void main(String[] args) {
		//���󵵰� ����. �ε������� ü�̴�(����) ������ ������ �־ ������ �ѵΰ��� ������
		//���� ��� �뵵�δ� ������ ������.(������ Ȯ���� ������ �Ǽ��� ������ �ĺ� �Ұ�.
		
		//å ���� : System.nanoTime();�̶�� �޼ҵ带 �̿��ؼ� ArrayList vsLinkedList�� ��
		
		List<String> listArray = new ArrayList<String>();
		List<String> listLinked = new LinkedList<String>();
		
		long startTime;
		long endTime;
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++) {
			listArray.add(0,i+"");//0�� �ε����� �����ֱ� ó���� ��. Linked�� �����ֱ⿡�� �� ������
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList�� �۾��ð�:"+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++) {
			listLinked.add(0,i+"");//0�� �ε����� �����ֱ� ó���� ��. Linked�� �����ֱ⿡�� �� ������
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList�� �۾��ð�:"+(endTime-startTime)+"ns");
		
	}
}
