
public class Test01 {
	public static void main(String[] args) {
		int iNum=1;
		long lNum=2L;
		System.out.println(iNum);
		System.out.println(lNum);
		double dNum=1.1;
		float fNum=2.2F;
		System.out.println(dNum);
		System.out.println(fNum);
		
		String str = "문자열";
		
		//캐스팅
		String numStr="123";
		System.out.println(numStr);
		int numInt = Integer.parseInt(numStr)+10;
		System.out.println(numInt);
		String numStr2 = numInt+"";
		System.out.println(numStr2);
		
	}
}
