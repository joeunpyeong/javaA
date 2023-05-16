
public class Member {
	//블럭킹 : 지역의 시작과 끝, 내부에 들어있는 모든 것들을 멤버
	//static 여부.
	
	int field=1;			//인스턴스 멤버
	static int sField=2;	//스태틱 멤버
	
	//인스턴스화 : 클래스가 가지고 있는 멤버중에 인스턴스 멤버들을 ㅔ모리에 올려서 사용 가능하게 하는 과정
	//				(인스턴스화 과정이 끝나고나서는 전체 멤버가 사용 가능함, 외부에서  private)
	//생성자(Constuctor)메소드 : 클래스가메모리에 올라갈때 사용할 생성식 ==클래스와 이름이 대소문자가 정확히 같음
	
	public static void main(String[] args) {
		Member mm = new Member();//인스턴스화 과정: new'Member();'생성자 메소드
		System.out.println(sField);
		System.out.println();
	}


}
