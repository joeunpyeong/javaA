package pack01.list;

public class TestDTO {
	//DB���� ��ȸ�ؿ°� �޾Ƽ� ��� �����ϱ� ���� ��ü
	//hr(employees):first_name,last_name,salary...
	private String firstName, lastName;
	//private�� �ܺο��� ������ �ٷ� ������ ������ �� ����� ����ϴ°��� �����ΰ�?
	//getter&setter: public���� ������ �޼ҵ带 ���ؼ� �ܺο��� �޼ҵ带 ���� ������ �����ϰ� ����

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