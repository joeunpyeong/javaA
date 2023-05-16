package pack01_base;

public class Ex01_Car {
	//클래스의 중괄호 사이(블럭킹 내부)에 있는 모든 것들은 해당하는 이름의 클래스 멤버이다.
	//자동차의 속력, 최대속력 ,색상, 제조사등의 속성은 필드(변수)로 관리를 하고.
	//자동차가 달리거나 멈추거나 하는 기능의 관리는 메소드로 한다.
	
	int speed;//자동차의 속력(기본값 0)
	
	//멤버의 구분: 크게 2가지
	//①인스턴스 멤버(IM,Iv(인스턴스변수),im(인스턴스메소드)..등등)
	//인스턴스화 과정을 거쳐야만 사용이 가능하다.(인스턴스화 과정 후 메모리에 올라가기 때문=>new Class()
	//인스턴스 멤버끼리는 언제든지 접근이 가능하다.
	
	//②스태틱 멤버(SM,sv,sm등)
	//메모리에 별도에 인스턴스화 과정없이 올라가기 떄문에 언제든지 사용이 가능함
	//단,※메모리에 항상 먼저 올라가야하기때문에 인스턴스멤버에 바로 접근이 불가능함 =>인스턴스화 과정 후 사용가능
	void run() {
		System.out.println(speed+"로 달린다.");
	}
	
	public static void main(String[] args) {
		Ex01_Car car = new Ex01_Car();
		car.speed=100;
		car.run();
	}
	
}
