package pack02_static;

import java.util.Scanner;

import pack01_base.Ex04_Car;

public class Test01_MethodMain {
	public static void main(String[] args) {
		while(true) {
			Test01_Method ec = new Test01_Method();
			Scanner sc = new Scanner(System.in);
			System.out.print("id�� �Է�\n=>");
			String id = sc.nextLine();
			System.out.print("pw�� �Է�\n=>");
			String pw = sc.nextLine();
			
			if((ec.login(id, pw))==true){
				break;
			}
		}
		
		
	}
}
