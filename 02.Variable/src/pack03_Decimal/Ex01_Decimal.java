package pack03_Decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 132456789;
		System.out.println(i);
		//int 이상의 값을 담을 수 있는 정수형 데이터 타입이 존재함.
		long l1 = 0;
		long l2 = 123467890L;
		System.out.println(l1);
		System.out.println(l2);
		
		float f1;
		float f2 = 1.2F;
		f1 = 1.1F;
		System.out.println(f1);
		System.out.println(f2);
		
		double d1;
		double d2 = 2.2;
		d1 = 2.1;
		System.out.println(d1);
		System.out.println(d2);
	}
}

//실수형 데이터 타입: float, double
//실수형은 소숫점이 있는 것을 표현하기 위해 존재
//float는 long과 마찬가지로 구분자 F를 붙여줘야만 함.
//대표적으로 : ※int , double
