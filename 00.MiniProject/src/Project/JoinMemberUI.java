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
		
		jf.setTitle("ȸ������");
		jf.setSize(382,468);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setLayout(null);
		
		
		//�۾�(��)
		//ȸ������ ��
		JLabel mainLabel = new JLabel("ȸ������");
		mainLabel.setFont(new Font("����", Font.BOLD, 15));
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainLabel.setBounds(142, 20, 80, 30);
		jf.getContentPane().add(mainLabel);
		
		//�̸� ��
		JLabel nameLabel = new JLabel("�̸� : ");
		nameLabel.setBounds(62, 70, 80, 30);
		nameLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.getContentPane().add(nameLabel);
		
		//�̸� �Է�
		JTextField nameJTF=new JTextField();
		nameJTF.setBounds(142, 70, 130, 30);
		jf.getContentPane().add(nameJTF);
		
		//���� ��
		JLabel ageLabel = new JLabel("���� : ");
		ageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ageLabel.setBounds(62, 109, 80, 30);
		jf.getContentPane().add(ageLabel);
		
		//���� �Է�
		ageJTF = new JTextField();
		ageJTF.setBounds(142, 109, 130, 30);
		jf.getContentPane().add(ageJTF);
		
		//���� ��
		JLabel genderLabel = new JLabel("����:");
		genderLabel.setHorizontalAlignment(SwingConstants.CENTER);
		genderLabel.setBounds(62, 154, 80, 30);
		jf.getContentPane().add(genderLabel);
		
		//���� �Է�
		genderJTF = new JTextField();
		genderJTF.setBounds(142, 154, 130, 30);
		jf.getContentPane().add(genderJTF);
		
		//email ��
		JLabel emailLabel = new JLabel("e-mail : ");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(62, 194, 80, 30);
		jf.getContentPane().add(emailLabel);
		
		//email �Է�
		emailJTF = new JTextField();
		emailJTF.setBounds(142, 194, 130, 30);
		jf.getContentPane().add(emailJTF);
		
		//email�ڵ� ��
		JLabel eCodeLabel = new JLabel("�̸��� �ڵ� : ");
		eCodeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		eCodeLabel.setBounds(62, 234, 80, 30);
		jf.getContentPane().add(eCodeLabel);
		
		//email�ڵ� �Է�
		codeJTF = new JTextField();
		codeJTF.setBounds(142, 234, 130, 30);
		jf.getContentPane().add(codeJTF);
		
		//���̵� ��
		JLabel idLabel = new JLabel("���̵� : ");
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(62, 274, 80, 30);
		jf.getContentPane().add(idLabel);
		
		//���̵� �Է�
		idJTF = new JTextField();
		idJTF.setBounds(142, 274, 130, 30);
		jf.getContentPane().add(idJTF);
		
		//��й�ȣ ��
		JLabel pwLabel = new JLabel("��й�ȣ : ");
		pwLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pwLabel.setBounds(62, 314, 80, 30);
		jf.getContentPane().add(pwLabel);
		
		//��й�ȣ �Է�
		pwJTF = new JTextField();
		pwJTF.setBounds(142, 314, 130, 30);
		jf.getContentPane().add(pwJTF);
		
		//�ڵ� ���� ��ư
		JButton sndCodeBT = new JButton("�ڵ� ����");
		sndCodeBT.setFont(new Font("��ü Light", Font.PLAIN, 9));
		sndCodeBT.addActionListener(e->{
			sendEmail(emailJTF.getText());
		});
		
		sndCodeBT.setBounds(275, 201, 79, 23);
		jf.getContentPane().add(sndCodeBT);
		
		//���� ��ư
		JButton joinBT = new JButton("�����ϱ�");
		joinBT.setBounds(72, 360, 94, 33);
		jf.getContentPane().add(joinBT);
		joinBT.addActionListener(e->{
			if(nameJTF.getText().toString().matches("^[��-�R]*$")==false) {
				JOptionPane.showMessageDialog(null, "�ѱ۸� �Է� �����մϴ�.", "You failed to code name", JOptionPane.ERROR_MESSAGE);
			}else if(0>=Integer.parseInt(ageJTF.getText().toString())||Integer.parseInt(ageJTF.getText().toString())>100) {
				JOptionPane.showMessageDialog(null,"���̸� ��Ȯ�� �Է����ּ���.",  "You failed to code age", JOptionPane.ERROR_MESSAGE);
			}else if(!genderJTF.getText().toString().contains("��")==false&&!genderJTF.getText().toString().contains("��")==false) {
				JOptionPane.showMessageDialog(null, "������ ��Ȯ�� �Է����ּ���.","You failed to code genderField",  JOptionPane.ERROR_MESSAGE);
			}else if(!genderJTF.getText().toString().contains("��")==true&&!genderJTF.getText().toString().contains("��")==true) {
				JOptionPane.showMessageDialog(null, "������ ��Ȯ�� �Է����ּ���.","You failed to code genderField",  JOptionPane.ERROR_MESSAGE);
			}else if(mailCertification==false) {
				JOptionPane.showMessageDialog(null,"�̸����� �������ּ���.", "You failed to code email",  JOptionPane.ERROR_MESSAGE);
			}else if(sameID(idJTF.getText().toString(),pwJTF.getText().toString())==true) {
				JOptionPane.showMessageDialog(null, "id�� �ߺ��Ǿ����ϴ�. �ٸ� ���̵� �Է����ּ���.",  "You failed to code sameId",JOptionPane.ERROR_MESSAGE);			
			}else {	
				joinMember(nameJTF.getText().toString(),
							Integer.parseInt(ageJTF.getText().toString()),
							genderJTF.getText().toString(),
							emailJTF.getText().toString(),
							idJTF.getText().toString(),pwJTF.getText().toString());
				jf.dispose();
			}
		});
		
		//������ ��ư
		JButton outBT = new JButton("������");
		outBT.setBounds(192, 360, 94, 33);
		jf.getContentPane().add(outBT);
		outBT.addActionListener(e->{
			jf.dispose();
		});
		
		//�ڵ�Ȯ�� ��ư
		JButton checkCodeBT = new JButton("�ڵ�Ȯ��");
		checkCodeBT.addActionListener(e->{
			if(contrastCode()==true)
				mailCertification=true;
		});

		checkCodeBT.setFont(new Font("��ü Light", Font.PLAIN, 9));
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
		    // rnd.nextBoolean() �� �������� true, false �� ����. true�� �� ���� �� �ҹ��ڸ�, false �� �� ���� �� ���ڸ� StringBuffer �� append �Ѵ�.
		    if(rnd.nextBoolean())
		        buf.append((char)((int)(rnd.nextInt(26))+97));
		    else
		        buf.append((rnd.nextInt(10)));
		}
		random=buf.toString();
		System.out.println("random�ڵ� ��ȣ:"+random);
	}
	
	private void sendEmail(String email) {
		randomCode();
		MultiPartEmail mail = new MultiPartEmail();
		
		mail.setHostName("smtp.naver.com");
		mail.setCharset("utf-8");//�ѱ۱��� ����
		mail.setDebug(true);//������ ã�Ƽ� ������ �ϰ��ִ� ��������
		
		mail.setAuthentication("jep3503", "asdf1278");
		mail.setSSLOnConnect(true);
		//=======================���� � ������ ���� smtp������ smtp������ �̿��� �� �ִ� ������
		
		try {
			mail.setFrom("jep3503@naver.com","�����̸�");
			mail.addTo(email,"you");
			mail.setSubject("�̸��� ���� ���� �޼���");
			mail.setMsg("���� �ڵ�� "+random+"�Դϴ�. �̸��� �ڵ忡 �Է����ּ���.");
			
			//mail��ü�� ��� ������ ������ ������ �غ� ��ħ
			mail.send();
			
		} catch (EmailException e) {
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Email���� �ƴѰ�"+e.getMessage());
		}
		
	}
	
	private boolean contrastCode() {
		System.out.println(codeJTF.getText().toString());
		System.out.println(random);
		if(codeJTF.getText().toString().equals(random)) {
			JOptionPane.showMessageDialog(null, "�ڵ� ������ �����߽��ϴ�.","You success to code certification",JOptionPane.PLAIN_MESSAGE);
			emailJTF.setEnabled(false);
			codeJTF.setEnabled(false);
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "�ڵ� ������ �����߽��ϴ�.", "You failed to code certification", JOptionPane.ERROR_MESSAGE);
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
			if(gender.contains("��")) 
				dbc.ps.setString(4, "��");
			else if(gender.contains("��"))
				dbc.ps.setString(4, "��");
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
        String formattedTime = currentTime.format(formatter);  // ���� ��¥�� �ð��� "yyyyMMddHHmmssSSS" �������� ��ȯ
        
        Random random = new Random();
        int randomNumber = random.nextInt(10000);  // 0���� 9999 ������ ������ ���� ����
        
        String uniqueValue = formattedTime + randomNumber;  // ���� �ð� ������ ���� ���ڸ� �����Ͽ� ������ �� ����
        
        return uniqueValue;
    }
	
	


}
