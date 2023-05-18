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
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//�̰� ������ â�϶� x��ư ������ �ݱ� �³�
		
		//�����̸�
		JLabel mainLabel = new JLabel("���� �̸�");
		mainLabel.setFont(new Font("����ü", Font.PLAIN, 22));
		mainLabel.setBounds(0, 20, 484, 55);
		mainLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.getContentPane().add(mainLabel);
		
		//�α���
		if(projectMain.logInSuccess!=true) {
			JButton logbtn = new JButton("�α���");
			logbtn.setBounds(392, 228, 80, 23);
			jf.getContentPane().add(logbtn);
			logbtn.addActionListener(e->{
				new LogInUI();
			});
			
		}else if(projectMain.logInSuccess==true) { // ����� �г��� �Ǵ� �̸� ���� �Ұ���, ����� �ڵ� ���� �г������� �ұ� ������
			JLabel logiOn = new JLabel("");
			logiOn.setFont(new Font("����ü", Font.PLAIN, 22));
			logiOn.setBounds(0, 20, 484, 55);
			logiOn.setHorizontalAlignment(JLabel.CENTER);
			jf.getContentPane().add(logiOn);
		}
		
		
		//���ӽ���
		JButton gameStartBT = new JButton("���� ����");
		gameStartBT.setBorderPainted(false);
		gameStartBT.setBounds(39, 102, 98, 23);
		jf.getContentPane().add(gameStartBT);
		gameStartBT.addActionListener(e->{
			if(projectMain.logInSuccess==true) {
				JOptionPane.showMessageDialog(null,  "���� �������Դϴ�. ������ �ٽ� �õ����ּ���.","You failed to code fixing", JOptionPane.ERROR_MESSAGE);	
			}else if(projectMain.logInSuccess==false) {
				JOptionPane.showMessageDialog(null,  "�α����� �Ǿ����� �ʽ��ϴ�. �ٸ� ���̵� �Է����ּ���.","You failed to code LogIn", JOptionPane.ERROR_MESSAGE);	
			}
		});
		
		
		//ȯ�漳��
		JButton preferencesBT = new JButton("ȯ�� ����");
		preferencesBT.setBounds(39, 136, 98, 23);
		preferencesBT.setBorderPainted(false);
		jf.getContentPane().add(preferencesBT);
		preferencesBT.addActionListener(e->{
			JOptionPane.showMessageDialog(null,  "���� �������Դϴ�. ������ �ٽ� �õ����ּ���.","You failed to code fixing", JOptionPane.ERROR_MESSAGE);	
		});
		
		//����
		JButton gameEndBT = new JButton("����");
		gameEndBT.setBounds(39, 169, 98, 23);
		gameEndBT.setBorderPainted(false);
		jf.getContentPane().add(gameEndBT);
		gameEndBT.addActionListener(e->{
			System.exit(0);
		});

		jf.setVisible(true);
		
	}
}
