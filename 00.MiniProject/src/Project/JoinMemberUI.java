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
		
		jf.setTitle("È¸¿ø°¡ÀÔ");
		jf.setSize(382,468);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setLayout(null);
		
		
		//±Û¾¾(¶óº§)
		//È¸¿ø°¡ÀÔ ¶óº§
		JLabel mainLabel = new JLabel("È¸¿ø°¡ÀÔ");
		mainLabel.setFont(new Font("±¼¸²", Font.BOLD, 15));
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainLabel.setBounds(142, 20, 80, 30);
		jf.getContentPane().add(mainLabel);
		
		//ÀÌ¸§ ¶óº§
		JLabel nameLabel = new JLabel("ÀÌ¸§ : ");
		nameLabel.setBounds(62, 70, 80, 30);
		nameLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.getContentPane().add(nameLabel);
		
		//ÀÌ¸§ ÀÔ·Â
		JTextField nameJTF=new JTextField();
		nameJTF.setBounds(142, 70, 130, 30);
		jf.getContentPane().add(nameJTF);
		
		//³ªÀÌ ¶óº§
		JLabel ageLabel = new JLabel("³ªÀÌ : ");
		ageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ageLabel.setBounds(62, 109, 80, 30);
		jf.getContentPane().add(ageLabel);
		
		//³ªÀÌ ÀÔ·Â
		ageJTF = new JTextField();
		ageJTF.setBounds(142, 109, 130, 30);
		jf.getContentPane().add(ageJTF);
		
		//¼ºº° ¶óº§
		JLabel genderLabel = new JLabel("¼ºº°:");
		genderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		genderLabel.setBounds(62, 154, 80, 30);
		jf.getContentPane().add(genderLabel);
		
		//¼ºº° ÀÔ·Â
		genderJTF = new JTextField();
		genderJTF.setBounds(142, 154, 130, 30);
		jf.getContentPane().add(genderJTF);
		
		//email ¶óº§
		JLabel emailLabel = new JLabel("e-mail : ");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(62, 194, 80, 30);
		jf.getContentPane().add(emailLabel);
		
		//email ÀÔ·Â
		emailJTF = new JTextField();
		emailJTF.setBounds(142, 194, 130, 30);
		jf.getContentPane().add(emailJTF);
		
		//emailÄÚµå ¶óº§
		JLabel eCodeLabel = new JLabel("ÀÌ¸ÞÀÏ ÄÚµå : ");
		eCodeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		eCodeLabel.setBounds(62, 234, 80, 30);
		jf.getContentPane().add(eCodeLabel);
		
		//emailÄÚµå ÀÔ·Â
		codeJTF = new JTextField();
		codeJTF.setBounds(142, 234, 130, 30);
		jf.getContentPane().add(codeJTF);
		
		//¾ÆÀÌµð ¶óº§
		JLabel idLabel = new JLabel("¾ÆÀÌµð : ");
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(62, 274, 80, 30);
		jf.getContentPane().add(idLabel);
		
		//¾ÆÀÌµð ÀÔ·Â
		idJTF = new JTextField();
		idJTF.setBounds(142, 274, 130, 30);
		jf.getContentPane().add(idJTF);
		
		//ºñ¹Ð¹øÈ£ ¶óº§
		JLabel pwLabel = new JLabel("ºñ¹Ð¹øÈ£ : ");
		pwLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwLabel.setBounds(62, 314, 80, 30);
		jf.getContentPane().add(pwLabel);
		
		//ºñ¹Ð¹øÈ£ ÀÔ·Â
		pwJTF = new JTextField();
		pwJTF.setBounds(142, 314, 130, 30);
		jf.getContentPane().add(pwJTF);
		
		//ÄÚµå Àü¼Û ¹öÆ°
		JButton sndCodeBT = new JButton("ÄÚµå Àü¼Û");
		sndCodeBT.setFont(new Font("°øÃ¼ Light", Font.PLAIN, 9));
		sndCodeBT.addActionListener(e->{
			sendEmail(emailJTF.getText());
		});
		
		sndCodeBT.setBounds(275, 201, 79, 23);
		jf.getContentPane().add(sndCodeBT);
		
		//°¡ÀÔ ¹öÆ°
		JButton joinBT = new JButton("°¡ÀÔÇÏ±â");
		joinBT.setBounds(72, 360, 94, 33);
		jf.getContentPane().add(joinBT);
		joinBT.addActionListener(e->{
			if(nameJTF.getText().toString().matches("^[°¡-ÆR]*$")==false) {
				JOptionPane.showMessageDialog(null, "ÇÑ±Û¸¸ ÀÔ·Â °¡´ÉÇÕ´Ï´Ù.", "You failed to code name", JOptionPane.ERROR_MESSAGE);
			}else if(0>=Integer.parseInt(ageJTF.getText().toString())||Integer.parseInt(ageJTF.getText().toString())>100) {
				JOptionPane.showMessageDialog(null,"³ªÀÌ¸¦ Á¤È®È÷ ÀÔ·ÂÇØÁÖ¼¼¿ä.",  "You failed to code age", JOptionPane.ERROR_MESSAGE);
			}else if(!genderJTF.getText().toString().contains("³²")==false&&!genderJTF.getText().toString().contains("¿©")==false) {
				JOptionPane.showMessageDialog(null, "¼ºº°À» Á¤È®È÷ ÀÔ·ÂÇØÁÖ¼¼¿ä.","You failed to code genderField",  JOptionPane.ERROR_MESSAGE);
			}else if(!genderJTF.getText().toString().contains("³²")==true&&!genderJTF.getText().toString().contains("¿©")==true) {
				JOptionPane.showMessageDialog(null, "¼ºº°À» Á¤È®È÷ ÀÔ·ÂÇØÁÖ¼¼¿ä.","You failed to code genderField",  JOptionPane.ERROR_MESSAGE);
			}else if(mailCertification==false) {
				JOptionPane.showMessageDialog(null,"ÀÌ¸ÞÀÏÀ» ÀÎÁõÇØÁÖ¼¼¿ä.", "You failed to code email",  JOptionPane.ERROR_MESSAGE);
			}else if(sameID(idJTF.getText().toString(),pwJTF.getText().toString())==true) {
				JOptionPane.showMessageDialog(null, "id°¡ Áßº¹µÇ¾ú½À´Ï´Ù. ´Ù¸¥ ¾ÆÀÌµð¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä.",  "You failed to code sameId",JOptionPane.ERROR_MESSAGE);			
			}else {	
				joinMember(nameJTF.getText().toString(),
							Integer.parseInt(ageJTF.getText().toString()),
							genderJTF.getText().toString(),
							emailJTF.getText().toString(),
							idJTF.getText().toString(),pwJTF.getText().toString());
				jf.dispose();
			}
		});
		
		//³ª°¡±â ¹öÆ°
		JButton outBT = new JButton("³ª°¡±â");
		outBT.setBounds(192, 360, 94, 33);
		jf.getContentPane().add(outBT);
		outBT.addActionListener(e->{
			jf.dispose();
		});
		
		//ÄÚµåÈ®ÀÎ ¹öÆ°
		JButton checkCodeBT = new JButton("ÄÚµåÈ®ÀÎ");
		checkCodeBT.addActionListener(e->{
			if(contrastCode()==true)
				mailCertification=true;
		});

		checkCodeBT.setFont(new Font("°øÃ¼ Light", Font.PLAIN, 9));
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
		    // rnd.nextBoolean() ´Â ·£´ýÀ¸·Î true, false ¸¦ ¸®ÅÏ. trueÀÏ ½Ã ·£´ý ÇÑ ¼Ò¹®ÀÚ¸¦, false ÀÏ ½Ã ·£´ý ÇÑ ¼ýÀÚ¸¦ StringBuffer ¿¡ append ÇÑ´Ù.
		    if(rnd.nextBoolean())
		        buf.append((char)((int)(rnd.nextInt(26))+97));
		    else
		        buf.append((rnd.nextInt(10)));
		}
		random=buf.toString();
		System.out.println("randomÄÚµå ¹øÈ£:"+random);
	}
	
	private void sendEmail(String email) {
		randomCode();
		MultiPartEmail mail = new MultiPartEmail();
		
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//ÇÑ±Û±úÁü ¹æÁö
		mail.setDebug(true);//¿À·ù¸¦ Ã£¾Æ¼­ °³¹ßÀ» ÇÏ°íÀÖ´Â °úÁ¤ÀÎÁö
		
		mail.setAuthentication("jep3503", "asdf1278");
		mail.setSSLOnConnect(true);
		//=======================°íÁ¤ ¾î¶² ¸ÞÀÏÀ» ¾²µç smtp¼­¹ö¿Í smtp¼­¹ö¸¦ ÀÌ¿ëÇÒ ¼ö ÀÖ´Â °í°´ÀÎÁõ
		
		try {
			mail.setFrom("jep3503@naver.com","°ÔÀÓÀÌ¸§");
			mail.addTo(email,"you");
			mail.setSubject("ÀÌ¸ÞÀÏ °èÁ¤ ÀÎÁõ ¸Þ¼¼Áö");
			mail.setMsg("ÀÎÁõ ÄÚµå´Â "+random+"ÀÔ´Ï´Ù. ÀÌ¸ÞÀÏ ÄÚµå¿¡ ÀÔ·ÂÇØÁÖ¼¼¿ä.");
			
			//mail°´Ã¼°¡ ¸ðµç Á¤º¸¸¦ °¡Áö°í Àü¼ÛÇÒ ÁØºñ¸¦ ¸¶Ä§
			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Email¿À·ù ¾Æ´Ñ°Å"+e.getMessage());
		}
		
	}
	
	private boolean contrastCode() {
		System.out.println(codeJTF.getText().toString());
		System.out.println(random);
		if(codeJTF.getText().toString().equals(random)) {
			JOptionPane.showMessageDialog(null, "ÄÚµå ÀÎÁõÀ» ¼º°øÇß½À´Ï´Ù.","You success to code certification",JOptionPane.PLAIN_MESSAGE);
			emailJTF.setEnabled(false);
			codeJTF.setEnabled(false);
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "ÄÚµå ÀÎÁõÀ» ½ÇÆÐÇß½À´Ï´Ù.", "You failed to code certification", JOptionPane.ERROR_MESSAGE);
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
			if(gender.contains("³²")) 
				dbc.ps.setString(4, "³²");
			else if(gender.contains("¿©"))
				dbc.ps.setString(4, "¿©");
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
        String formattedTime = currentTime.format(formatter);  // ÇöÀç ³¯Â¥¿Í ½Ã°£À» "yyyyMMddHHmmssSSS" Çü½ÄÀ¸·Î º¯È¯
        
        Random random = new Random();
        int randomNumber = random.nextInt(10000);  // 0ºÎÅÍ 9999 »çÀÌÀÇ ·£´ýÇÑ ¼ýÀÚ »ý¼º
        
        String uniqueValue = formattedTime + randomNumber;  // ÇöÀç ½Ã°£ Á¤º¸¿Í ·£´ý ¼ýÀÚ¸¦ °áÇÕÇÏ¿© °íÀ¯ÇÑ °ª »ý¼º
        
        return uniqueValue;
    }
	
	


}
