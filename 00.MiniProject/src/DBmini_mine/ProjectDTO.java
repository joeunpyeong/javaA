package DBmini_mine;

public class ProjectDTO {
	private int cnt, code,price;
	private String name;
	public ProjectDTO(int cnt, int code, int price, String name) {
		super();
		this.cnt = cnt;
		this.code = code;
		this.price = price;
		this.name = name;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
	
}
