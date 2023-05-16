package pack02_Ex;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class OBListUI extends  JFrame {

	    public OBListUI(){
			Menu mn= new Menu();
			JFrame jf = new JFrame();
			jf.setSize(400,150);
			jf.setLocationRelativeTo(null);
			jf.setTitle("재고 리스트");
			
			String header []= {
					mn.menu.get(0).name,mn.menu.get(0).price,mn.menu.get(0).stock,mn.menu.get(0).info
			};
			String [][] contents =new String[mn.menu.size()-1][4];
			System.out.println(mn.menu.size());
			for(int i=0 ;i < mn.menu.size()-1 ; i++) {
					contents[i][0]=mn.menu.get(i+1).name;
					contents[i][1]=mn.menu.get(i+1).price;
					contents[i][2]=mn.menu.get(i+1).stock;
					contents[i][3]=mn.menu.get(i+1).info;
			}
			
			JTable list = new JTable(contents,header);
			JScrollPane jsp = new JScrollPane(list);
			
			jf.add(jsp);
			jf.pack();//테이블의 크기에 맞춰서 자동으로 크기 조절해줌 

			jf.setVisible(true);
	    }
}
