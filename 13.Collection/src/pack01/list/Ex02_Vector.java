package pack01.list;

import java.util.List;
import java.util.Vector;

public class Ex02_Vector {
	public static void main(String[] args) {
		//���󵵰� ���ų� �ſ� ���� ������ �̷и� ���캸�� �Ѿ
		//List��� Interface�� ��ӹ޾ұ� ������ �⺻ ������ ArrayList, LinkedList, Vector���� �����.
		//?TestDTO��� Ŭ������ ��� �����ϰ� �ʹ�. ? ���� �� ������
		//1.List�����غ���
		//2.List�� ��� �߰��غ���.��(TestDTO)��
		//3.List�� �ִ� ��� ���� ����غ���(����:FirstName:��, LastName:�̸�)
		
		List<TestDTO> list=new Vector<TestDTO>();//ũ�� ?
		list.add(new TestDTO("��","����"));
		list.add(new TestDTO("��","����"));
		
		System.out.println(list.get(0).getFirstName()+list.get(0).getLastName());
		
		TestDTO[] arrDTOs=new TestDTO[1];
		arrDTOs[0]= new TestDTO("FirstName","LastName");
		arrDTOs[1]= new TestDTO("FirstName1","LastName1"); //������
		
		
	}
}
