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
		
		jf.setTitle("���� ã��");
		jf.setSize(375,468);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setLayout(null);
		
		//ȸ������ ��
		JLabel mainLabel = new JLabel("���� ã��");
		mainLabel.setFont(new Font("����", Font.BOLD, 15));
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainLabel.setBounds(140, 20, 80, 30);
		jf.getContentPane().add(mainLabel);
		
		
		JButton findIdBT = new JButton("���̵� ã��");
		findIdBT.setFont(new Font("����", Font.BOLD, 12));
		findIdBT.setBounds(48, 85, 116, 34);
		jf.getContentPane().add(findIdBT);
		
		JButton findPwBT = new JButton("��й�ȣ ã��");
		findPwBT.setFont(new Font("����", Font.BOLD, 12));
		findPwBT.setBounds(200, 85, 116, 34);
		jf.getContentPane().add(findPwBT);
		

		JLabel middleLabel = new JLabel();
		middleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		middleLabel.setFont(new Font("����", Font.BOLD, 12));
		middleLabel.setBounds(135, 143, 92, 30);
		jf.getContentPane().add(middleLabel);
		middleLabel.setVisible(false);

		JLabel lastLabel = new JLabel("������ �̸��Ϸ� ã��");
		lastLabel.setBounds(71, 168, 225, 30);
		lastLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.getContentPane().add(lastLabel);
		lastLabel.setVisible(false);

		JTextField nameJTF=new JTextField();
		nameJTF.setBounds(142, 210, 185, 30);
		jf.getContentPane().add(nameJTF);
		nameJTF.setVisible(false);
		
		JLabel nameLabel = new JLabel("���� �̸� �Է� :");
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(26, 209, 116, 30);
		jf.getContentPane().add(nameLabel);
		nameLabel.setVisible(false);
		
		JTextField idJTF=new JTextField();
		idJTF.setBounds(142, 250, 185, 30);
		jf.getContentPane().add(idJTF);
		idJTF.setVisible(false);
		
		JLabel idLabel = new JLabel("���̵� �Է� :");
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(26, 250, 116, 30);
		jf.getContentPane().add(idLabel);
		idLabel.setVisible(false);
		
		JLabel emailLabel = new JLabel("������ �̸��� �Է� :");
		emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		emailLabel.setBounds(26, 290, 116, 30);
		jf.getContentPane().add(emailLabel);
		emailLabel.setVisible(false);
		
		emailJTF = new JTextField();
		emailJTF.setBounds(142, 291, 185, 30);
		jf.getContentPane().add(emailJTF);
		emailJTF.setVisible(false);
		
		JButton sndCodeBT = new JButton("�ڵ� ����");
		sndCodeBT.setFont(new Font("��ü Light", Font.PLAIN, 9));
		sndCodeBT.setBounds(248, 322, 79, 23);
		jf.getContentPane().add(sndCodeBT);
		sndCodeBT.setVisible(false);
		sndCodeBT.addActionListener(e->{
			sendEmail(emailJTF.getText());
		});
		
		JButton checkCodeBT = new JButton("�ڵ� Ȯ��");
		checkCodeBT.setFont(new Font("��ü Light", Font.PLAIN, 9));
		checkCodeBT.setBounds(248, 376, 79, 23);
		jf.getContentPane().add(checkCodeBT);
		checkCodeBT.setVisible(false);
		checkCodeBT.addActionListener(e->{
			if(contrastCode()==true)
				mailCertification=true;
		});
		
		JLabel codeLabel = new JLabel("������ �ڵ� �Է� :");
		codeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		codeLabel.setBounds(26, 344, 116, 30);
		jf.getContentPane().add(codeLabel);
		codeLabel.setVisible(false);
		
		codeJTF = new JTextField();
		codeJTF.setBounds(142, 345, 185, 30);
		jf.getContentPane().add(codeJTF);
		codeJTF.setVisible(false);
		
		JButton checkBT = new JButton("Ȯ��");
		checkBT.setFont(new Font("����", Font.BOLD, 12));
		checkBT.setBounds(139, 389, 97, 30);
		jf.getContentPane().add(checkBT);
	
		checkBT.addActionListener(e->{
			if(mode==1&&findID(nameJTF.getText().toString(),emailJTF.getText().toString())==true&&mailCertification==true) {
				JOptionPane.showMessageDialog(null, "����� ID�� "+userId+"�Դϴ�.","You success to code certification",JOptionPane.PLAIN_MESSAGE);
				jf.dispose();
			}else if(mode==1&&findID(nameJTF.getText().toString(),emailJTF.getText().toString())==false&&mailCertification==true) {
				JOptionPane.showMessageDialog(null, "������ �����߽��ϴ�. �ٽ� �õ����ּ���.", "You failed to code certification", JOptionPane.ERROR_MESSAGE);
				nameJTF.setText(""); idJTF.setText("");
				emailJTF.setEnabled(true); emailJTF.setText("");
				codeJTF.setEnabled(true);  codeJTF.setText("");
			}else if(mode==2&&findPW(nameJTF.getText().toString(),idJTF.getText().toString(),emailJTF.getText().toString())==true&&mailCertification==true) {
				JOptionPane.showMessageDialog(null, "����� PW�� "+userPw+"�Դϴ�.","You success to code certification",JOptionPane.PLAIN_MESSAGE);
				jf.dispose();
			}else if(mode==2&&findPW(nameJTF.getText().toString(),idJTF.getText().toString(),emailJTF.getText().toString())==false&&mailCertification==true) {
				JOptionPane.showMessageDialog(null, "������ �����߽��ϴ�. �ٽ� �õ����ּ���.", "You failed to code certification", JOptionPane.ERROR_MESSAGE);
				nameJTF.setText(""); idJTF.setText("");
				emailJTF.setEnabled(true); emailJTF.setText("");
				codeJTF.setEnabled(true);  codeJTF.setText("");
			}
		});
		
		jf.setVisible(true);
		
		//--------------------------------
		
		findIdBT.addActionListener(e->{
			mode=1;
			middleLabel.setText("���̵� ã��");
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
			middleLabel.setText("��й�ȣ ã��");
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
}
