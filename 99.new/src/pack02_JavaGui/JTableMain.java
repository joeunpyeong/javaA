package pack02_JavaGui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableMain {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(400,150);
		jf.setTitle("JTable����");
		 
		String header []= {"�̸�","����","����","����"};
		String contents [][]= {
				{"ȫ�浿","90","87","98"},
				{"������","88","100","60"},
				{"����ġ","70","80","99"}
		};
		
		JTable jt = new JTable(contents,header);
		JScrollPane jsp = new JScrollPane(jt);
		
		jf.add(jsp);
		jf.pack();//���̺��� ũ�⿡ ���缭 �ڵ����� ũ�� �������� 
		jf.setVisible(true);
		
		
		
		
		
	}
}
