package dao.dto.method;

public class HumanDTO {
	//���:DTO(�Ӽ��� ������ ����,+gatter setter constructor)
	public String eye="��",mouth="��",ear="��",hand="��";//���������� ������
	
	//���:DAO(�ν��Ͻ�ȭ1)
	public void seeMovie() {
		System.out.println(eye+"��"+ear+"�� ��ȭ�� ���ϴ�.");
	}
	public void ask() {
		System.out.println(mouth+"�� ��ȭ��");
	}
	public void coding() {
		System.out.println(hand+"�� �ڵ���");
	}
}
