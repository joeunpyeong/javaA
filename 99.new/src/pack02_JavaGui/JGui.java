package pack02_JavaGui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JGui {
	public static void main(String[] args) {
	
		//프레임 설정(이름,사이즈,위치,프레임 보이게)
		JFrame jf= new JFrame();	
		jf.setTitle("로그인");
		jf.setSize(380,180);
		jf.setLocation(400, 200);
		jf.setLayout(null);
		
		
		//글씨(라벨)
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setLocation(30,30);
		idLabel.setSize(80, 30);
		idLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.add(idLabel);
		
		//입력
		JTextField idPut=new JTextField();
		idPut.setLocation(110,30);
		idPut.setSize(130,30);
		jf.add(idPut);
		
		//글씨(라벨)
		JLabel pwLabel = new JLabel("비밀번호 : ");
		pwLabel.setLocation(30,70);
		pwLabel.setSize(80, 30);
		pwLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.add(pwLabel);
		
		//입력
		JTextField pwPut=new JTextField();
		pwPut.setLocation(110,70);
		pwPut.setSize(130,30);
		jf.add(pwPut);
		
		//버튼 (버튼 이름과 함께 생성, 사이즈, 위치)
		JButton logIn = new JButton("로그인");
		logIn.setLocation(260,60);
		logIn.setSize(100,40);
		jf.add(logIn);
		
		//프레임에 버튼 추가

		jf.setVisible(true);
		
	}

}
