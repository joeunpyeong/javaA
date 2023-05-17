package Project;

import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInUI extends JFrame {
	public LogInUI() {
		//프레임 설정(이름,사이즈,위치,프레임 보이게)
		ProjectDAO dao = new ProjectDAO();
		JFrame jf= new JFrame();
		
		jf.setTitle("로그인");
		jf.setSize(380,180);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setLayout(null);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		//글씨(라벨)
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setBounds(30, 30, 80, 30);
		idLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.getContentPane().add(idLabel);
		
		//입력
		JTextField inputId=new JTextField();
		inputId.setBounds(110, 30, 130, 30);
		jf.getContentPane().add(inputId);
		
		//글씨(라벨)
		JLabel pwLabel = new JLabel("비밀번호 : ");
		pwLabel.setBounds(30, 70, 80, 30);
		pwLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.getContentPane().add(pwLabel);
		
		//입력
		JPasswordField inputPw=new JPasswordField();
		inputPw.setBounds(110, 70, 130, 30);
		jf.getContentPane().add(inputPw);

		//버튼 (버튼 이름과 함께 생성, 사이즈, 위치)
		JButton logbtn = new JButton("로그인");
		logbtn.setBounds(260, 65, 92, 40);
		jf.getContentPane().add(logbtn);
		
		
		JButton joinMember = new JButton("회원가입");
		joinMember.addActionListener(e->{
			new JoinMemberUI();
		});

		joinMember.setBorderPainted(false);
		joinMember.setBounds(72, 108, 92, 23);
		jf.getContentPane().add(joinMember);
		
		JButton findIdPw = new JButton("id/pw 찾기");
		findIdPw.addActionListener(e->{
			new FindAccount();
		});
		findIdPw.setBorderPainted(false);
		findIdPw.setBounds(176, 108, 98, 23);
		jf.getContentPane().add(findIdPw);
		
		
		//------------------------------------------------------------------긴 기능
		//logbtn에 기능 추가
		
		logbtn.addActionListener(e->{
			char[] secret_pw = inputPw.getPassword(); 
			String pw="";
		     for(char cha : secret_pw){         
		         Character.toString(cha);       //cha 에 저장된 값 string으로 변환
		       //pw 에 저장하기, pw 에 값이 비어있으면 저장, 값이 있으면 이어서 저장하는 삼항연산자
		         pw += (pw.equals("")) ? ""+cha+"" : ""+cha+"";   
		     }
			if (dao.loginDAO(inputId.getText(),pw)) {
                jf.setVisible(false);
                projectMain.logInSuccess=true;
                //창은 닫고 프로그램은 종료하지 않게하는 코드
                hideAllWindows();
                new MainUI();
                JOptionPane.showMessageDialog(null, "로그인 성공", "You success to log in",JOptionPane.INFORMATION_MESSAGE);
			}
			//만약 틀렸을 경우
			else {
				JOptionPane.showMessageDialog(null,  "ERROR_MESSAGE","You failed to log in", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		
		jf.setVisible(true);
	}
	
	public static void hideAllWindows() {
	    Window[] windows = Window.getWindows();
	    for (Window window : windows) {
	        window.setVisible(false);
	    }
	}
}
