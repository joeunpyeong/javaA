package pack02_static;

public class Test01_Method {
	//1.사용자로부터 콘솔창을 통해 id와 pw를 입력받는다.
	//2.id와 pw를 Test01_Method의 login이라는 메소드에 전송하여
	//id가 master ,pw가 master1234이면 true, 그 외에는 false를 리턴하게 만든다.
	//3.해당 결과에 따라서 로그인되었습니다. 로그인 실패가 콘솔창에 나오게 만들기
	
	//4.Scanner자체를 Test01_Method내부에 메소드 구현을 통해서 생성받아 사용하게끔 처리
	
	
	boolean login(String id, String pw) {
		
		if(id.equals("master")&&pw.equals("master1234")) {
			System.out.println("로그인되었습니다.");
		
			return true;
		}else {
			System.out.println("로그인 실패\n");
			return false;
		}
		
	}
	
	
}
