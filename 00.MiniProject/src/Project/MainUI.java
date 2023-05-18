package Project;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

public class MainUI extends  JFrame {
	     
	public MainUI(){
		JFrame jf = new JFrame();
		
		jf.setTitle("main");
		jf.setSize(500,300);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setLayout(null);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//이거 마지막 창일때 x버튼 누르면 닫기 맞나
		
		//게임이름
		JLabel mainLabel = new JLabel("게임 이름");
		mainLabel.setFont(new Font("굴림체", Font.PLAIN, 22));
		mainLabel.setBounds(0, 20, 484, 55);
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.getContentPane().add(mainLabel);
		
		//로그인
		if(projectMain.logInSuccess!=true) {
			JButton logbtn = new JButton("로그인");
			logbtn.setBounds(392, 228, 80, 23);
			jf.getContentPane().add(logbtn);
			logbtn.addActionListener(e->{
				new LogInUI();
			});
			
		}else if(projectMain.logInSuccess==true) { // 사용자 닉네임 또는 이름 들어가게 할거임, 사용자 코드 말고 닉네임으로 할까 생각중
			JLabel logiOn = new JLabel("");
			logiOn.setFont(new Font("굴림체", Font.PLAIN, 22));
			logiOn.setBounds(0, 20, 484, 55);
			logiOn.setHorizontalAlignment(JLabel.CENTER);
			jf.getContentPane().add(logiOn);
		}
		
		
		//게임시작
		JButton gameStartBT = new JButton("게임 시작");
		gameStartBT.setBorderPainted(false);
		gameStartBT.setBounds(39, 102, 98, 23);
		jf.getContentPane().add(gameStartBT);
		gameStartBT.addActionListener(e->{
			if(projectMain.logInSuccess==true) {
				JOptionPane.showMessageDialog(null,  "현재 제작중입니다. 다음에 다시 시도해주세요.","You failed to code fixing", JOptionPane.ERROR_MESSAGE);	
			}else if(projectMain.logInSuccess==false) {
				JOptionPane.showMessageDialog(null,  "로그인이 되어있지 않습니다. 다른 아이디를 입력해주세요.","You failed to code LogIn", JOptionPane.ERROR_MESSAGE);	
			}
		});
		
		
		//환경설정
		JButton preferencesBT = new JButton("환경 설정");
		preferencesBT.setBounds(39, 136, 98, 23);
		preferencesBT.setBorderPainted(false);
		jf.getContentPane().add(preferencesBT);
		preferencesBT.addActionListener(e->{
			JOptionPane.showMessageDialog(null,  "현재 제작중입니다. 다음에 다시 시도해주세요.","You failed to code fixing", JOptionPane.ERROR_MESSAGE);	
		});
		
		//종료
		JButton gameEndBT = new JButton("종료");
		gameEndBT.setBounds(39, 169, 98, 23);
		gameEndBT.setBorderPainted(false);
		jf.getContentPane().add(gameEndBT);
		gameEndBT.addActionListener(e->{
			System.exit(0);
		});

		jf.setVisible(true);
		
	}
}
