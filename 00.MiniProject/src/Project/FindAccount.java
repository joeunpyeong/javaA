package Project;


import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.awt.event.ActionEvent;
public class FindAccount extends JFrame {
	DBC dbc = new DBC();
	String userId,userPw,random;
	int mode=0;
	boolean mailCertification;
	private JTextField emailJTF,codeJTF;
	
	public FindAccount() {
		JFrame jf= new JFrame();
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		jf.setTitle("계정 찾기");
		jf.setSize(375,468);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setLayout(null);
		
		//회원가입 라벨
		JLabel mainLabel = new JLabel("계정 찾기");
		mainLabel.setFont(new Font("굴림", Font.BOLD, 15));
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainLabel.setBounds(140, 20, 80, 30);
		jf.getContentPane().add(mainLabel);
		
		
		JButton findIdBT = new JButton("아이디 찾기");
		findIdBT.setFont(new Font("굴림", Font.BOLD, 12));
		findIdBT.setBounds(48, 85, 116, 34);
		jf.getContentPane().add(findIdBT);
		
		JButton findPwBT = new JButton("비밀번호 찾기");
		findPwBT.setFont(new Font("굴림", Font.BOLD, 12));
		findPwBT.setBounds(200, 85, 116, 34);
		jf.getContentPane().add(findPwBT);
		

		JLabel middleLabel = new JLabel();
		middleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		middleLabel.setFont(new Font("굴림", Font.BOLD, 12));
		middleLabel.setBounds(135, 143, 92, 30);
		jf.getContentPane().add(middleLabel);
		middleLabel.setVisible(false);

		JLabel lastLabel = new JLabel("가입한 이메일로 찾기");
		lastLabel.setBounds(71, 168, 225, 30);
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
		
		JTextField idJTF=new JTextField();
		idJTF.setBounds(142, 250, 185, 30);
		jf.getContentPane().add(idJTF);
		idJTF.setVisible(false);
		
		JLabel idLabel = new JLabel("아이디 입력 :");
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(26, 250, 116, 30);
		jf.getContentPane().add(idLabel);
		idLabel.setVisible(false);
		
		JLabel emailLabel = new JLabel("가입한 이메일 입력 :");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(26, 290, 116, 30);
		jf.getContentPane().add(emailLabel);
		emailLabel.setVisible(false);
		
		emailJTF = new JTextField();
		emailJTF.setBounds(142, 291, 185, 30);
		jf.getContentPane().add(emailJTF);
		emailJTF.setVisible(false);
		
		JButton sndCodeBT = new JButton("코드 전송");
		sndCodeBT.setFont(new Font("공체 Light", Font.PLAIN, 9));
		sndCodeBT.setBounds(248, 322, 79, 23);
		jf.getContentPane().add(sndCodeBT);
		sndCodeBT.setVisible(false);
		sndCodeBT.addActionListener(e->{
			sendEmail(emailJTF.getText());
		});
		
		JButton checkCodeBT = new JButton("코드 확인");
		checkCodeBT.setFont(new Font("공체 Light", Font.PLAIN, 9));
		checkCodeBT.setBounds(248, 376, 79, 23);
		jf.getContentPane().add(checkCodeBT);
		checkCodeBT.setVisible(false);
		checkCodeBT.addActionListener(e->{
			if(contrastCode()==true)
				mailCertification=true;
		});
		
		JLabel codeLabel = new JLabel("전송한 코드 입력 :");
		codeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		codeLabel.setBounds(26, 344, 116, 30);
		jf.getContentPane().add(codeLabel);
		codeLabel.setVisible(false);
		
		codeJTF = new JTextField();
		codeJTF.setBounds(142, 345, 185, 30);
		jf.getContentPane().add(codeJTF);
		codeJTF.setVisible(false);
		
		JButton checkBT = new JButton("확인");
		checkBT.setFont(new Font("굴림", Font.BOLD, 12));
		checkBT.setBounds(139, 389, 97, 30);
		jf.getContentPane().add(checkBT);
	
		checkBT.addActionListener(e->{
			if(mode==1&&findID(nameJTF.getText().toString(),emailJTF.getText().toString())==true&&mailCertification==true) {
				JOptionPane.showMessageDialog(null, "당신의 ID는 "+userId+"입니다.","You success to code certification",JOptionPane.PLAIN_MESSAGE);
				jf.dispose();
			}else if(mode==1&&findID(nameJTF.getText().toString(),emailJTF.getText().toString())==false&&mailCertification==true) {
				JOptionPane.showMessageDialog(null, "인증을 실패했습니다. 다시 시도해주세요.", "You failed to code certification", JOptionPane.ERROR_MESSAGE);
				nameJTF.setText(""); idJTF.setText("");
				emailJTF.setEnabled(true); emailJTF.setText("");
				codeJTF.setEnabled(true);  codeJTF.setText("");
			}else if(mode==2&&findPW(nameJTF.getText().toString(),idJTF.getText().toString(),emailJTF.getText().toString())==true&&mailCertification==true) {
				JOptionPane.showMessageDialog(null, "당신의 PW는 "+userPw+"입니다.","You success to code certification",JOptionPane.PLAIN_MESSAGE);
				jf.dispose();
			}else if(mode==2&&findPW(nameJTF.getText().toString(),idJTF.getText().toString(),emailJTF.getText().toString())==false&&mailCertification==true) {
				JOptionPane.showMessageDialog(null, "인증을 실패했습니다. 다시 시도해주세요.", "You failed to code certification", JOptionPane.ERROR_MESSAGE);
				nameJTF.setText(""); idJTF.setText("");
				emailJTF.setEnabled(true); emailJTF.setText("");
				codeJTF.setEnabled(true);  codeJTF.setText("");
			}
		});
		
		jf.setVisible(true);
		
		//--------------------------------
		
		findIdBT.addActionListener(e->{
			mode=1;
			middleLabel.setText("아이디 찾기");
			idLabel.setVisible(false);
			idJTF.setVisible(false);
			middleLabel.setVisible(true);
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
		findPwBT.addActionListener(e->{
			mode=2;
			middleLabel.setText("비밀번호 찾기");
			nameLabel.setBounds(26, 209, 116, 30);
			middleLabel.setVisible(true);


			lastLabel.setVisible(true);
			
			nameJTF.setBounds(142, 210, 185, 30);
			nameJTF.setVisible(true);
			
			nameLabel.setBounds(26, 209, 116, 30);
			nameLabel.setVisible(true);
			
			idJTF.setVisible(true);
			idLabel.setVisible(true);
			
			emailLabel.setBounds(26, 290, 116, 30);
			emailLabel.setVisible(true);
			
			emailJTF.setBounds(142, 291, 185, 30);
			emailJTF.setVisible(true);
			
			sndCodeBT.setBounds(248, 322, 79, 23);
			sndCodeBT.setVisible(true);

			checkCodeBT.setBounds(248, 376, 79, 23);
			checkCodeBT.setVisible(true);

			codeLabel.setBounds(26, 344, 116, 30);
			codeLabel.setVisible(true);

			codeJTF.setBounds(142, 345, 185, 30);
			codeJTF.setVisible(true);
			
		});
	}

	private boolean findPW(String name, String id, String email) {
		try {
			dbc.DBConnect();
			dbc.ps=dbc.conn.prepareStatement("SELECT * FROM USERLIST WHERE USER_NAME = ? AND USER_ID = ? AND USER_EMAIL = ?");
			dbc.ps.setString(1, name);
			dbc.ps.setString(2, id);
			dbc.ps.setString(3, email);
			dbc.rs=dbc.ps.executeQuery();
            while (dbc.rs.next()) {
                userPw = dbc.rs.getString("USER_PW");
                return true;
            }
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbc.dbClose();
		}
		return false;
	}

	private boolean findID(String name, String email) {
		try {
			dbc.DBConnect();
			dbc.ps=dbc.conn.prepareStatement("SELECT * FROM USERLIST WHERE USER_NAME = ? AND USER_EMAIL = ?");
			dbc.ps.setString(1, name);
			dbc.ps.setString(2, email);
			dbc.rs=dbc.ps.executeQuery();
            while (dbc.rs.next()) {
                userId = dbc.rs.getString("USER_ID");
                return true;
            }
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbc.dbClose();
		}
		return false;
		
	}
	private void randomCode() {
		Random rnd =new Random();
		StringBuffer buf =new StringBuffer();
		for(int i=0;i<20;i++){
		    // rnd.nextBoolean() 는 랜덤으로 true, false 를 리턴. true일 시 랜덤 한 소문자를, false 일 시 랜덤 한 숫자를 StringBuffer 에 append 한다.
		    if(rnd.nextBoolean())
		        buf.append((char)((int)(rnd.nextInt(26))+97));
		    else
		        buf.append((rnd.nextInt(10)));
		}
		random=buf.toString();
		System.out.println("random코드 번호:"+random);
	}
	
	private void sendEmail(String email) {
		randomCode();
		MultiPartEmail mail = new MultiPartEmail();
		
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//한글깨짐 방지
		mail.setDebug(true);//오류를 찾아서 개발을 하고있는 과정인지
		
		mail.setAuthentication("jep3503", "asdf1278");
		mail.setSSLOnConnect(true);
		//=======================고정 어떤 메일을 쓰든 smtp서버와 smtp서버를 이용할 수 있는 고객인증
		
		try {
			mail.setFrom("jep3503@naver.com","게임이름");
			mail.addTo(email,"you");
			mail.setSubject("이메일 계정 인증 메세지");
			mail.setMsg("인증 코드는 "+random+"입니다. 이메일 코드에 입력해주세요.");
			
			//mail객체가 모든 정보를 가지고 전송할 준비를 마침
			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Email오류 아닌거"+e.getMessage());
		}
		
	}
	
	private boolean contrastCode() {
		System.out.println(codeJTF.getText().toString());
		System.out.println(random);
		if(codeJTF.getText().toString().equals(random)) {
			JOptionPane.showMessageDialog(null, "코드 인증을 성공했습니다.","You success to code certification",JOptionPane.PLAIN_MESSAGE);
			emailJTF.setEnabled(false);
			codeJTF.setEnabled(false);
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "코드 인증을 실패했습니다.", "You failed to code certification", JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
}
