package pack02_Ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInUI extends JFrame {
	public LogInUI() {
		//프레임 설정(이름,사이즈,위치,프레임 보이게)
		JFrame jf= new JFrame();
		
		jf.setTitle("로그인");
		jf.setSize(380,180);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		
		//글씨(라벨)
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setBounds(30, 30, 80, 30);
		idLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.add(idLabel);
		
		//입력
		JTextField inputId=new JTextField();
		inputId.setBounds(110, 30, 130, 30);
		jf.add(inputId);
		
		//글씨(라벨)
		JLabel pwLabel = new JLabel("비밀번호 : ");
		pwLabel.setBounds(30, 70, 80, 30);
		pwLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.add(pwLabel);
		
		//입력
		JPasswordField inputPw=new JPasswordField();
		inputPw.setBounds(110, 70, 130, 30);
		jf.add(inputPw);

		//버튼 (버튼 이름과 함께 생성, 사이즈, 위치)
		JButton logbtn = new JButton("로그인");
		logbtn.setBounds(260, 60, 100, 40);
		jf.add(logbtn);
		
		
		//logbtn에 기능 추가
		logbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//원하는 아이디
				String id = "a1";
				//원하는 비밀번호
				String pass = "b1";
				
				char[] secret_pw = inputPw.getPassword(); 
				String pw="";
			     for(char cha : secret_pw){         
			         Character.toString(cha);       //cha 에 저장된 값 string으로 변환
			       //pw 에 저장하기, pw 에 값이 비어있으면 저장, 값이 있으면 이어서 저장하는 삼항연산자
			         pw += (pw.equals("")) ? ""+cha+"" : ""+cha+"";   
			     }
				
				if ( id.equals(inputId.getText()) && pass.equals(pw)) {
					//아래의 메시지를 보여준다
	                jf.setVisible(false);
				}
				//만약 틀렸을 경우
				else {
					System.out.println("정답   id : "+id+"pw : "+pass);
					System.out.println("입력한 id : "+inputId.getText()+"pw : "+pw);
					JOptionPane.showMessageDialog(null, "You failed to log in", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		jf.setVisible(true);
	}
}
