
public class Test06 {
	public static void main(String[] args) {
		//명명 규칙(네이밍룰):Class(.java)파일은 대문자로 시작하기.
		//변수는 소문자로 시작하는데 의미있는 단어를 연결해서 조합함.
		int korScore,mathScore,engScore,sciScore,athScore;
		korScore = 70;
		mathScore = 80;
		engScore = 90;
		sciScore = 80;
		athScore = 70;
		System.out.println(korScore);			
		System.out.println(mathScore);	
		System.out.println(engScore);	
		System.out.println(sciScore);	
		System.out.println(athScore);	
		
		//형변환(Casting) : 서로 다른 타입의 변수를 변환시켜 사용함.
		//ex)int <->double , String <-> int
		//int < double
		int iValue=10;
		double dValue = iValue+0.5;//아무것도 한 것 없음 ==>자동 형 변환
		System.out.println("iValue값 : " + iValue);
		System.out.println("dValue값 : " + dValue);
		//더 큰 데이터타입을 작은 타입에 담을 때 오류가 발생함.
		//개발자가 어떤 타입으로 바꿀건지 명시를 해줘서 강제로 바꿈.
		//우리가 어떤 작업을 함==>강제형변환
		iValue = (int)dValue;
		System.out.println(iValue);//문제가 발생함 = 소숫점 유실
		System.out.println("iValue값 : " + iValue);
		System.out.println("dValue값 : " + dValue);
		
		String str = "1234"+12;   //123412
		//문자열에 어떤 값을 더하는 것 == 합x => 결합(글자의 합침)
		int iData = 1234+12; //1246
		//숫자형 데이터의합은 == 합 ==> 값의 합침
		System.out.println(str);
		System.out.println(iData);
		
		//str에는 현재 123412라는 문자열이 저장되어있음.
		//숫자로 바꾸려면 어떻게 해야할까?
		//123412의 값을 숫자로 바꾸고 +1한 결과를 출력하기
		//int =>Integer , double =>Double , wrapperClass 첫글자가 대문자
		int sum = Integer.parseInt(str)+1;
		System.out.println(sum);
		
		//boolean(부울형) true 또는 false 만 저장이 가능함.
		int a=1, b=2, c=3;
		
		
	}
}

