package pack02_JavaGui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableMain {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setSize(400,150);
		jf.setTitle("JTable예제");
		 
		String header []= {"이름","국어","영어","수학"};
		String contents [][]= {
				{"홍길동","90","87","98"},
				{"성춘향","88","100","60"},
				{"전우치","70","80","99"}
		};
		
		JTable jt = new JTable(contents,header);
		JScrollPane jsp = new JScrollPane(jt);
		
		jf.add(jsp);
		jf.pack();//테이블의 크기에 맞춰서 자동으로 크기 조절해줌 
		jf.setVisible(true);
		
		
		
		
		
	}
}
