package pack02_Ex;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	List<Item> menu = new ArrayList<>();
	public Menu() {
//		Item item = new Item("������", 1000, 10,  new Status(), "Info");
//		menu = new Item[5];//�̸�, ����,����, ����
		menu.add(new Item("��ǰ��",   "����", "����","����"));
		menu.add(new Item("������",   "1000", "10","�ݵ��� ���� ������"));
		menu.add(new Item("����Ÿ",   "2000",  "5","�ݵ��� ���� ����Ÿ"));
		menu.add(new Item("�޷γ�",    "800", "20","�ݵ��� ���� �޷γ�"));
		menu.add(new Item("������",    "100",  "2","�ݵ��� ���� ������"));
		menu.add(new Item("�Һ���",   "1000",  "5","�ݵ��� ���� �Һ���"));
		menu.add(new Item("ǲ���",   "1500", "10","�ݵ��� ���� ǲ���"));
		menu.add(new Item("�ٳ���",   "1500", "10","�ݵ��� ���� �ٳ���"));
		menu.add(new Item("��¡��",    "800",  "5","�ݵ��� ���� ��¡��"));
		menu.add(new Item("���̽�",     "50",  "50","�ݵ��� ���� ���̽�"));
		menu.add(new Item("�����",   "1000", "10","�ݵ��� ���� �����"));
	}
}
