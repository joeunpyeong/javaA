package Project;


import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class FindAccount extends JFrame {
	private JTextField emailJTF;
	private JTextField codeJTF;

	public FindAccount() {
		JFrame jf= new JFrame();
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		jf.setTitle("계정 찾기");
		jf.setSize(382,468);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setLayout(null);
		
		//회원가입 라벨
		JLabel mainLabel = new JLabel("계정 찾기");
		mainLabel.setFont(new Font("굴림", Font.BOLD, 15));
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainLabel.setBounds(142, 20, 80, 30);
		jf.getContentPane().add(mainLabel);
		
		
		JButton findIdBT = new JButton("아이디 찾기");
		findIdBT.setFont(new Font("굴림", Font.BOLD, 12));
		findIdBT.setBounds(48, 85, 116, 34);
		jf.getContentPane().add(findIdBT);
		
		JButton findPwBT = new JButton("비밀번호 찾기");
		findPwBT.setFont(new Font("굴림", Font.BOLD, 12));
		findPwBT.setBounds(200, 85, 116, 34);
		jf.getContentPane().add(findPwBT);
		
		JLabel middleLabel = new JLabel("아이디 찾기");
		middleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		middleLabel.setFont(new Font("굴림", Font.BOLD, 12));
		middleLabel.setBounds(128, 144, 92, 30);
		jf.getContentPane().add(middleLabel);
		middleLabel.setVisible(false);

		JLabel lastLabel = new JLabel("가입한 이메일로 찾기");
		lastLabel.setBounds(120, 168, 116, 30);
		lastLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.getContentPane().add(lastLabel);
		lastLabel.setVisible(false);

		JTextField nameJTF=new JTextField();
		nameJTF.setBounds(142, 210, 185, 30);
		jf.getContentPane().add(nameJTF);
		nameJTF.setVisible(false);
		
		JLabel nameLabel = new JLabel("본인 이름 입력 :");
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(26, 209, 116, 30);
		jf.getContentPane().add(nameLabel);
		nameLabel.setVisible(false);
		
		JLabel emailLabel = new JLabel("가입한 이메일 입력 :");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(26, 263, 116, 30);
		jf.getContentPane().add(emailLabel);
		emailLabel.setVisible(false);
		
		emailJTF = new JTextField();
		emailJTF.setBounds(142, 264, 185, 30);
		jf.getContentPane().add(emailJTF);
		emailJTF.setVisible(false);
		
		JButton sndCodeBT = new JButton("코드 전송");
		sndCodeBT.setFont(new Font("공체 Light", Font.PLAIN, 9));
		sndCodeBT.setBounds(248, 295, 79, 23);
		jf.getContentPane().add(sndCodeBT);
		sndCodeBT.setVisible(false);
		
		JButton checkCodeBT = new JButton("코드 확인");
		checkCodeBT.setFont(new Font("공체 Light", Font.PLAIN, 9));
		checkCodeBT.setBounds(248, 369, 79, 23);
		jf.getContentPane().add(checkCodeBT);
		checkCodeBT.setVisible(false);
		
		JLabel codeLabel = new JLabel("전송한 코드 입력 :");
		codeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		codeLabel.setBounds(26, 323, 116, 30);
		jf.getContentPane().add(codeLabel);
		codeLabel.setVisible(false);
		
		codeJTF = new JTextField();
		codeJTF.setBounds(142, 338, 185, 30);
		jf.getContentPane().add(codeJTF);
		codeJTF.setVisible(false);
		
		jf.setVisible(true);
		
		//--------------------------------
		
		findIdBT.addActionListener(e->{
			middleLabel.setBounds(128, 144, 92, 30);
			middleLabel.setVisible(true);

			lastLabel.setBounds(120, 168, 116, 30);
			lastLabel.setVisible(true);
			
			nameJTF.setBounds(142, 210, 185, 30);
			nameJTF.setVisible(true);
			
			nameLabel.setBounds(26, 209, 116, 30);
			nameLabel.setVisible(true);
			
			emailLabel.setBounds(26, 263, 116, 30);
			emailLabel.setVisible(true);
			
			emailJTF.setBounds(142, 264, 185, 30);
			emailJTF.setVisible(true);
			
			sndCodeBT.setBounds(248, 295, 79, 23);
			sndCodeBT.setVisible(true);

			checkCodeBT.setBounds(248, 369, 79, 23);
			checkCodeBT.setVisible(true);

			codeLabel.setBounds(26, 323, 116, 30);
			codeLabel.setVisible(true);

			codeJTF.setBounds(142, 338, 185, 30);
			codeJTF.setVisible(true);
			
		});
	}
}
