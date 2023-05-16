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
		//������ ����(�̸�,������,��ġ,������ ���̰�)
		JFrame jf= new JFrame();
		
		jf.setTitle("�α���");
		jf.setSize(380,180);
		jf.setLocationRelativeTo(null);
		jf.setLayout(null);
		
		
		//�۾�(��)
		JLabel idLabel = new JLabel("���̵� : ");
		idLabel.setBounds(30, 30, 80, 30);
		idLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.add(idLabel);
		
		//�Է�
		JTextField inputId=new JTextField();
		inputId.setBounds(110, 30, 130, 30);
		jf.add(inputId);
		
		//�۾�(��)
		JLabel pwLabel = new JLabel("��й�ȣ : ");
		pwLabel.setBounds(30, 70, 80, 30);
		pwLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.add(pwLabel);
		
		//�Է�
		JPasswordField inputPw=new JPasswordField();
		inputPw.setBounds(110, 70, 130, 30);
		jf.add(inputPw);

		//��ư (��ư �̸��� �Բ� ����, ������, ��ġ)
		JButton logbtn = new JButton("�α���");
		logbtn.setBounds(260, 60, 100, 40);
		jf.add(logbtn);
		
		
		//logbtn�� ��� �߰�
		logbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���ϴ� ���̵�
				String id = "a1";
				//���ϴ� ��й�ȣ
				String pass = "b1";
				
				char[] secret_pw = inputPw.getPassword(); 
				String pw="";
			     for(char cha : secret_pw){         
			         Character.toString(cha);       //cha �� ����� �� string���� ��ȯ
			       //pw �� �����ϱ�, pw �� ���� ��������� ����, ���� ������ �̾ �����ϴ� ���׿�����
			         pw += (pw.equals("")) ? ""+cha+"" : ""+cha+"";   
			     }
				
				if ( id.equals(inputId.getText()) && pass.equals(pw)) {
					//�Ʒ��� �޽����� �����ش�
	                jf.setVisible(false);
				}
				//���� Ʋ���� ���
				else {
					System.out.println("����   id : "+id+"pw : "+pass);
					System.out.println("�Է��� id : "+inputId.getText()+"pw : "+pw);
					JOptionPane.showMessageDialog(null, "You failed to log in", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		jf.setVisible(true);
	}
}
