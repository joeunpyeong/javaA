package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Game01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//���� �����
		int userNum=0 , count=0;
		int random = new Random().nextInt(100)+1;
		
		while(true) {
			System.out.println("1���� 100������ ������ �Է��ϼ��� ��");
			userNum = Integer.parseInt(sc.nextLine());
			count++;
			if(userNum<random) {
				System.out.println("�� ū ���� �Է��ϼ���!");
			}else if(userNum>random) {
				System.out.println("�� ���� ���� �Է��ϼ���!");
			}else {
				System.out.println("������ϴ�.!");
				System.out.println("�õ� Ƚ���� :"+ count +"�� �Դϴ�.");
				break;
			}
		}
		
		//���� �Է� ���α׷� �����
		while(true) {
			int kor,eng,mat,sum;

			System.out.println("\n���������� �Է��ϼ��� : ");
			kor = Integer.parseInt(sc.nextLine());
			if(kor>100||kor<0) {
				System.out.println("����");
				continue;
			}
			
			System.out.println("���������� �Է��ϼ��� : ");
			eng = Integer.parseInt(sc.nextLine());
			if(eng>100||eng<0) {
				System.out.println("����");
				continue;
			}
			System.out.println("���������� �Է��ϼ��� : ");
			mat = Integer.parseInt(sc.nextLine());
			if(mat>100||mat<0) {
				System.out.println("����");
				continue;
			}
			sum=kor+eng+mat;
			System.out.println("���� : " + sum);
			double avg= (double)sum/3;
			System.out.println("��� : " + avg);
		}
		
	}
}
