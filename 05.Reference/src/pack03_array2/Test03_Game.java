package pack03_array2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test03_Game {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ ���� ���߱� ����");
		System.out.println("���̵��� �������ּ���");
		int level=Integer.parseInt(sc.nextLine());
		int[]gameArray=new int[level];//3=>[0][0][0]
		String[]gameResults=new String[level];//[?][?]...[?]
		for(int i=0;i<gameResults.length;i++) {
			gameResults[i]="?";
		}
		int random = new Random().nextInt(level);
		System.out.println(random);
		
		gameArray[random]=1;//[1][0][0]
		System.out.println(Arrays.toString(gameArray));
		while(true) {
			System.out.println("1����" + gameArray.length+"���̿� ���� �Է� !");
			
			for(int i=0;i<gameResults.length;i++) {
				System.out.print(i+1+"["+gameResults[i]+"]");
			}
			
			int userNum = Integer.parseInt(sc.nextLine())-1;
			if(gameArray[userNum]==1) {
				System.out.println("����!!!!");
				break;
			}else {
				gameResults[userNum]="X";
				System.out.println("��");
			}
			
		}
		
		
	}
}
