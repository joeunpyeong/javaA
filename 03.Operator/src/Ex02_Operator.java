

public class Ex02_Operator {
	public static void main(String[] args) {
		int num1 = 1 , num2 = 1;
		System.out.println(num1++); //후행연산
		System.out.println(++num2); //선행연산
		
		System.out.println("증감식 후 : "+num1);
		System.out.println("증감식 후 : "+num2);
		
		//2
		System.out.println(num1--); //2
		System.out.println(--num2); //1
	}
}
