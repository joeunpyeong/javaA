package pack03_constructor;

import java.util.Scanner;

public class Ex03_CarMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ :");
		String company = sc.nextLine();
		System.out.print("��  �� :");
		String model = sc.nextLine();
		System.out.print("��  �� :");
		String color = sc.nextLine();
	
		Ex03_Car myCar=new Ex03_Car(company,model,color);
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
	}
}
