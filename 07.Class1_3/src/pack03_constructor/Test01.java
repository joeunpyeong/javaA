package pack03_constructor;

import java.util.Scanner;

public class Test01 {
	//1.�̸�, ���̵�, �н�����, ���̸� �ʵ�� ����ϴ� MemberŬ������ ���� ��
	//MemberŬ���� �ʵ尪�� ���� �Ҵ��ϰ� ����غ���

	//2.�̸�, ���̵�, �н�����, ���̸� �ʵ�� ����ϴ� MemberDTOŬ������ �����Ѵ�.
	//�ʼ��� �ԷµǾ�� �� �� ���� �ʵ�� �����ڸ� ���� �Է¹ްԸ����
	//�ش系���� ����Ѵ�.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Member member=new Member();
		member.name="�浿ȫ";
		member.age=10;
		member.id="id001";
		member.pw="pw001";
		System.out.println("�̸�:"+member.name);
		System.out.println("����:"+member.age);
		System.out.println("���̵�:"+member.id);
		System.out.println("���:"+member.pw);
		
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.print("id:");
		String id = sc.nextLine();
		System.out.print("pw:");
		String pw = sc.nextLine();
		System.out.print("����:");
		int age = Integer.parseInt(sc.nextLine());
		MemberDTO dto = new MemberDTO(name,id,pw,age);
		System.out.println("�̸�:"+dto.name);
		System.out.println("����:"+dto.age);
		System.out.println("���̵�:"+dto.id);
		System.out.println("���:"+dto.pw);
	}
}
