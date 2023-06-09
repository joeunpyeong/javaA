package pack01_base;

public class Const {
	//생성자 <= 객체(Object): 우리가 만들고 있는 모든 클래스
		//모든 클래스는 Object로부터 만들어졌음.(x)
	
	//반드시 필요한 정보가 있다면 객체 생성 시 해당하는 정보를 가지고 생성하기 위해서 필요함.
	int field;

	public Const() {//별도로 생성자 '메소드'를 만들지 않으면 class의 이름으로 생성자 메소드가 존재한다.(JVMx)
			//메소드인데 클래스의 이름과 완전히 똑같은것==>클래스를 변수형태로 인스턴스화 할 때 사용하는 메소드
		this.field=field;
	}
	
	int sum(int x,int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		Const con = new Const();//호출(불러서 만듬)
		System.out.println(con.sum(10, 20));
		System.out.println(con.sum(20, 30));
		
	}
}
