package pack06_game;

import java.util.Scanner;

public class Test02_ScorePg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor =-1 , eng =-1, mat = -1;
		System.out.println("���������� �Է����ּ���.");
		while(kor==1) {
			kor = Integer.parseInt(sc.nextLine());
			if(kor>0 ||kor<=100) {
				System.out.println("������Է¿Ϸ�");
			}else {
				System.out.println("�߸��Է� 1~100������ ����!!");
				kor=-1;
			}
		}
		System.out.println("���������� �Է����ּ���.");
		while(eng==1) {
			eng = Integer.parseInt(sc.nextLine());
			if(kor>0 ||eng<=100) {
				System.out.println("������Է¿Ϸ�");
			}else {
				System.out.println("�߸��Է� 1~100������ ����!!");
				eng=-1;
			}
		}
		System.out.println("���������� �Է����ּ���.");
		while(mat==1) {
			mat = Integer.parseInt(sc.nextLine());
			if(kor>0 ||mat<=100) {
				System.out.println("���м����Է¿Ϸ�");
			}else {
				System.out.println("�߸��Է� 1~100������ ����!!");
				mat=-1;
			}
		}
		System.out.println("���� ���� : " + kor);
		System.out.println("���� ���� : " + eng);
		System.out.println("���� ���� : " + mat);
	}
}
