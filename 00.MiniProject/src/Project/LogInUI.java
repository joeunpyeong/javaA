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
		//������ ����(�̸�,������,��ġ,������ ���̰�)
		ProjectDAO dao = new ProjectDAO();
		JFrame jf= new JFrame();
		
		jf.setTitle("�α���");
		jf.setSize(380,180);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setLayout(null);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		//�۾�(��)
		JLabel idLabel = new JLabel("���̵� : ");
		idLabel.setBounds(30, 30, 80, 30);
		idLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.getContentPane().add(idLabel);
		
		//�Է�
		JTextField inputId=new JTextField();
		inputId.setBounds(110, 30, 130, 30);
		jf.getContentPane().add(inputId);
		
		//�۾�(��)
		JLabel pwLabel = new JLabel("��й�ȣ : ");
		pwLabel.setBounds(30, 70, 80, 30);
		pwLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.getContentPane().add(pwLabel);
		
		//�Է�
		JPasswordField inputPw=new JPasswordField();
		inputPw.setBounds(110, 70, 130, 30);
		jf.getContentPane().add(inputPw);

		//��ư (��ư �̸��� �Բ� ����, ������, ��ġ)
		JButton logbtn = new JButton("�α���");
		logbtn.setBounds(260, 65, 92, 40);
		jf.getContentPane().add(logbtn);
		
		
		JButton joinMember = new JButton("ȸ������");
		joinMember.addActionListener(e->{
			new JoinMemberUI();
		});

		joinMember.setBorderPainted(false);
		joinMember.setBounds(72, 108, 92, 23);
		jf.getContentPane().add(joinMember);
		
		JButton findIdPw = new JButton("id/pw ã��");
		findIdPw.addActionListener(e->{
			new FindAccount();
		});
		findIdPw.setBorderPainted(false);
		findIdPw.setBounds(176, 108, 98, 23);
		jf.getContentPane().add(findIdPw);
		
		
		//------------------------------------------------------------------�� ���
		//logbtn�� ��� �߰�
		
		logbtn.addActionListener(e->{
			char[] secret_pw = inputPw.getPassword(); 
			String pw="";
		     for(char cha : secret_pw){         
		         Character.toString(cha);       //cha �� ����� �� string���� ��ȯ
		       //pw �� �����ϱ�, pw �� ���� ��������� ����, ���� ������ �̾ �����ϴ� ���׿�����
		         pw += (pw.equals("")) ? ""+cha+"" : ""+cha+"";   
		     }
			if (dao.loginDAO(inputId.getText(),pw)) {
                jf.setVisible(false);
                projectMain.logInSuccess=true;
                //â�� �ݰ� ���α׷��� �������� �ʰ��ϴ� �ڵ�
                hideAllWindows();
                new MainUI();
                JOptionPane.showMessageDialog(null, "�α��� ����", "You success to log in",JOptionPane.INFORMATION_MESSAGE);
			}
			//���� Ʋ���� ���
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
