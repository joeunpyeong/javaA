package pack01.list;

public class TestDTO {
	//DB에서 조회해온것 받아서 묶어서 저장하기 위한 객체
	//hr(employees):first_name,last_name,salary...
	private String firstName, lastName;
	//private로 외부에서 변수에 바로 접근을 막았을 떄 만들어 줘야하는것은 무엇인가?
	//getter&setter: public으로 구성된 메소드를 통해서 외부에서 메소드를 통해 변수에 접근하게 만듦

	public TestDTO(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
