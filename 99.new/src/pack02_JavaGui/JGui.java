package pack02_JavaGui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JGui {
	public static void main(String[] args) {
	
		//������ ����(�̸�,������,��ġ,������ ���̰�)
		JFrame jf= new JFrame();	
		jf.setTitle("�α���");
		jf.setSize(380,180);
		jf.setLocation(400, 200);
		jf.setLayout(null);
		
		
		//�۾�(��)
		JLabel idLabel = new JLabel("���̵� : ");
		idLabel.setLocation(30,30);
		idLabel.setSize(80, 30);
		idLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.add(idLabel);
		
		//�Է�
		JTextField idPut=new JTextField();
		idPut.setLocation(110,30);
		idPut.setSize(130,30);
		jf.add(idPut);
		
		//�۾�(��)
		JLabel pwLabel = new JLabel("��й�ȣ : ");
		pwLabel.setLocation(30,70);
		pwLabel.setSize(80, 30);
		pwLabel.setHorizontalAlignment(JLabel.CENTER);
		jf.add(pwLabel);
		
		//�Է�
		JTextField pwPut=new JTextField();
		pwPut.setLocation(110,70);
		pwPut.setSize(130,30);
		jf.add(pwPut);
		
		//��ư (��ư �̸��� �Բ� ����, ������, ��ġ)
		JButton logIn = new JButton("�α���");
		logIn.setLocation(260,60);
		logIn.setSize(100,40);
		jf.add(logIn);
		
		//�����ӿ� ��ư �߰�

		jf.setVisible(true);
		
	}

}
