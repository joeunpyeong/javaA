package Project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.awt.event.ActionEvent;

public class JoinMemberUI extends JFrame {
	String random;
	DBC dbc = new DBC();
	boolean mailCertification;
	private JTextField ageJTF, emailJTF, codeJTF, idJTF, pwJTF, genderJTF;

	public JoinMemberUI(){
		JFrame jf= new JFrame();
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		jf.setTitle("회원가입");
		jf.setSize(382,468);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setLayout(null);
		
		
		//글씨(라벨)
		//회원가입 라벨
		JLabel mainLabel = new JLabel("회원가입");
		mainLabel.setFont(new Font("굴림", Font.BOLD, 15));
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainLabel.setBounds(142, 20, 80, 30);
		jf.getContentPane().add(mainLabel);
		
		//이름 라벨
		JLabel nameLabel = new JLabel("이름 : ");
		nameLabel.setBounds(62, 70, 80, 30);
		nameLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.getContentPane().add(nameLabel);
		
		//이름 입력
		JTextField nameJTF=new JTextField();
		nameJTF.setBounds(142, 70, 130, 30);
		jf.getContentPane().add(nameJTF);
		
		//나이 라벨
		JLabel ageLabel = new JLabel("나이 : ");
		ageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ageLabel.setBounds(62, 109, 80, 30);
		jf.getContentPane().add(ageLabel);
		
		//나이 입력
		ageJTF = new JTextField();
		ageJTF.setBounds(142, 109, 130, 30);
		jf.getContentPane().add(ageJTF);
		
		//성별 라벨
		JLabel genderLabel = new JLabel("성별:");
		genderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		genderLabel.setBounds(62, 154, 80, 30);
		jf.getContentPane().add(genderLabel);
		
		//성별 입력
		genderJTF = new JTextField();
		genderJTF.setBounds(142, 154, 130, 30);
		jf.getContentPane().add(genderJTF);
		
		//email 라벨
		JLabel emailLabel = new JLabel("e-mail : ");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(62, 194, 80, 30);
		jf.getContentPane().add(emailLabel);
		
		//email 입력
		emailJTF = new JTextField();
		emailJTF.setBounds(142, 194, 130, 30);
		jf.getContentPane().add(emailJTF);
		
		//email코드 라벨
		JLabel eCodeLabel = new JLabel("이메일 코드 : ");
		eCodeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		eCodeLabel.setBounds(62, 234, 80, 30);
		jf.getContentPane().add(eCodeLabel);
		
		//email코드 입력
		codeJTF = new JTextField();
		codeJTF.setBounds(142, 234, 130, 30);
		jf.getContentPane().add(codeJTF);
		
		//아이디 라벨
		JLabel idLabel = new JLabel("아이디 : ");
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(62, 274, 80, 30);
		jf.getContentPane().add(idLabel);
		
		//아이디 입력
		idJTF = new JTextField();
		idJTF.setBounds(142, 274, 130, 30);
		jf.getContentPane().add(idJTF);
		
		//비밀번호 라벨
		JLabel pwLabel = new JLabel("비밀번호 : ");
		pwLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwLabel.setBounds(62, 314, 80, 30);
		jf.getContentPane().add(pwLabel);
		
		//비밀번호 입력
		pwJTF = new JTextField();
		pwJTF.setBounds(142, 314, 130, 30);
		jf.getContentPane().add(pwJTF);
		
		//코드 전송 버튼
		JButton sndCodeBT = new JButton("코드 전송");
		sndCodeBT.setFont(new Font("공체 Light", Font.PLAIN, 9));
		sndCodeBT.addActionListener(e->{
			sendEmail(emailJTF.getText());
		});
		
		sndCodeBT.setBounds(275, 201, 79, 23);
		jf.getContentPane().add(sndCodeBT);
		
		//가입 버튼
		JButton joinBT = new JButton("가입하기");
		joinBT.setBounds(72, 360, 94, 33);
		jf.getContentPane().add(joinBT);
		joinBT.addActionListener(e->{
			if(nameJTF.getText().toString().matches("^[가-힣]*$")==false) {
				JOptionPane.showMessageDialog(null, "한글만 입력 가능합니다.", "You failed to code name", JOptionPane.ERROR_MESSAGE);
			}else if(0>=Integer.parseInt(ageJTF.getText().toString())||Integer.parseInt(ageJTF.getText().toString())>100) {
				JOptionPane.showMessageDialog(null,"나이를 정확히 입력해주세요.",  "You failed to code age", JOptionPane.ERROR_MESSAGE);
			}else if(!genderJTF.getText().toString().contains("남")==false&&!genderJTF.getText().toString().contains("여")==false) {
				JOptionPane.showMessageDialog(null, "성별을 정확히 입력해주세요.","You failed to code genderField",  JOptionPane.ERROR_MESSAGE);
			}else if(!genderJTF.getText().toString().contains("남")==true&&!genderJTF.getText().toString().contains("여")==true) {
				JOptionPane.showMessageDialog(null, "성별을 정확히 입력해주세요.","You failed to code genderField",  JOptionPane.ERROR_MESSAGE);
			}else if(mailCertification==false) {
				JOptionPane.showMessageDialog(null,"이메일을 인증해주세요.", "You failed to code email",  JOptionPane.ERROR_MESSAGE);
			}else if(sameID(idJTF.getText().toString(),pwJTF.getText().toString())==true) {
				JOptionPane.showMessageDialog(null, "id가 중복되었습니다. 다른 아이디를 입력해주세요.",  "You failed to code sameId",JOptionPane.ERROR_MESSAGE);			
			}else {	
				joinMember(nameJTF.getText().toString(),
							Integer.parseInt(ageJTF.getText().toString()),
							genderJTF.getText().toString(),
							emailJTF.getText().toString(),
							idJTF.getText().toString(),pwJTF.getText().toString());
				jf.dispose();
			}
		});
		
		//나가기 버튼
		JButton outBT = new JButton("나가기");
		outBT.setBounds(192, 360, 94, 33);
		jf.getContentPane().add(outBT);
		outBT.addActionListener(e->{
			jf.dispose();
		});
		
		//코드확인 버튼
		JButton checkCodeBT = new JButton("코드확인");
		checkCodeBT.addActionListener(e->{
			if(contrastCode()==true)
				mailCertification=true;
		});

		checkCodeBT.setFont(new Font("공체 Light", Font.PLAIN, 9));
		checkCodeBT.setBounds(275, 238, 79, 23);
		jf.getContentPane().add(checkCodeBT);
		
		jf.setVisible(true);
	}
		
		
		
	
	private boolean sameID(String id,String pw) {
		try {
			dbc.DBConnect();
			dbc.ps=dbc.conn.prepareStatement("SELECT USER_ID,USER_PW from USERLIST where USER_ID=? and USER_PW=?" );
			dbc.ps.setString(1, id);
			dbc.ps.setString(2, pw);
			dbc.rs=dbc.ps.executeQuery();
			if(dbc.rs.next()) {
				if(id.equals(dbc.rs.getString("USER_ID"))) {
					return true;
				}
			}else 
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
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

	private void joinMember(String name, int age, String gender,String email, String id, String pw) {
		try {
			dbc.DBConnect();
			dbc.ps=dbc.conn.prepareStatement("INSERT INTO \"HANUL\".\"USERLIST\" (USER_CODE, USER_NAME, USER_AGE, USER_GENDER, USER_EMAIL, USER_ID, USER_PW)"
											+ " VALUES (?, ?, ?, ?, ?, ?, ?)");
			dbc.ps.setString(1,uniqueValue());
			dbc.ps.setString(2, name);
			dbc.ps.setInt(3, age);
			if(gender.contains("남")) 
				dbc.ps.setString(4, "남");
			else if(gender.contains("여"))
				dbc.ps.setString(4, "여");
			dbc.ps.setString(5, email);
			dbc.ps.setString(6, id);
			dbc.ps.setString(7, pw);
			dbc.ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbc.dbClose();
		}
	}

	private String uniqueValue() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        String formattedTime = currentTime.format(formatter);  // 현재 날짜와 시간을 "yyyyMMddHHmmssSSS" 형식으로 변환
        
        Random random = new Random();
        int randomNumber = random.nextInt(10000);  // 0부터 9999 사이의 랜덤한 숫자 생성
        
        String uniqueValue = formattedTime + randomNumber;  // 현재 시간 정보와 랜덤 숫자를 결합하여 고유한 값 생성
        
        return uniqueValue;
    }
	
	


}
