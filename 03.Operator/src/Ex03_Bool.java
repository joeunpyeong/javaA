
public class Ex03_Bool {
	public static void main(String[] args) {
		//true (1) , false(0)
		//AND 연산자는 논리곱  TRUE(1) * FALSE(0)(논리 곱은 모든 조건이 TRUE일때만 TRUE임)
		//로그인(아이디가 맞고 (TRUE) *비밀번호가 맞고(TRUE) => 로그인 TRUE)

		//OR 연산자는 논리합 TRUE(1) + FALSE(0) = TRUE(논리합은 하나의 TRUE가 전체 조건식을 TRUE로 만듬)
		//한가지의 조건만 만족을 시키면 TRUE
		//AND 연산자 & , OR 연산자|
		
		//NOT =>!
		//어떤 true , false(bool)앞에 붙이면 해당 결과를 반전시킴

		boolean bTrue = true , bFalse = false;
		System.out.println(!bTrue);
		System.out.println(!bFalse);
		
		
	}
}
