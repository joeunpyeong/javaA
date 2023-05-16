package pack07_oop3;

public class ProductDTO {
	//접근제한자 : private(외부로부터 바로 접근을 제거한다)
	//정보은닉(information hidding),캡슐화(encapsulation)
	private int num;//상품 고유 번호
	private String name;//상품 이름
	private int price;//가격
	private int cnt;//재고
	
	//가격과 재고가 현실에서는 -가 되면 안된다.
	
	//기본 생성자: JVM에서 제공하며 class의 이름부분이 기본 생성자 메소드이다.(new ClassName();)
	public ProductDTO() {}
	
	
	//1.생성자를 통해서 필드의 값을 초기화 해야할 경우,IDE기능을 이용해서 자동으로 만들기
	
	public ProductDTO(int num, String name, int price, int cnt) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	
	//2.ProductMain이라는 클래스를 만들고 상품의 번호를 출력해보기.(방법은 자유롭게)

	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getCnt() {
		return cnt;
	}


	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
	
}
