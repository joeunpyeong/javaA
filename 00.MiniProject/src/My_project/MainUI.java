package My_project;

import javax.swing.JFrame;
import javax.swing.JLabel;

//https://ridd-coding.tistory.com/47

public class MainUI extends  JFrame {
	     
	public MainUI(){
		JFrame jf = new JFrame();
		jf.setSize(500,300);
		jf.setLocationRelativeTo(null);
		jf.setTitle("main");
		
		JLabel mainName = new JLabel("작업툴");
		mainName.setBounds(jf.getBounds().x/2, 0, 580, 30);
		jf.add(mainName);

		JLabel producer = new JLabel("제작자");
		producer.setBounds(250, 10, 100, 70);
		jf.add(producer);
		
		

		jf.setVisible(true);
		
	}
	
	
}
