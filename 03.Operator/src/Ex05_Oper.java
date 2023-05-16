
public class Ex05_Oper {
	public static void main(String[] args) {
		int result = 0;
		//result에 10을 더한 결과를 다시 result에 할당.
		result = result+10;
		result +=10; // 6, 7번 줄 같은 식임
		System.out.println(result);
		result+=20;
		System.out.println(result+10);  //result +10 은 저장되지 않음
		System.out.println(result);     //40
	}
}
