package pack04.db;

//A:OracleDAO�� �̿��ؼ� database�۾�
public class OracleDAO implements DataAccessObject{

	@Override
	public void select() {
		System.out.println(IP+"�� �����ؼ� Oracle select");
		
	}

	@Override
	public void insert() {
		System.out.println(IP+"�� �����ؼ� Oracle insert");
		
	}

	@Override
	public void update() {
		System.out.println(IP+"�� �����ؼ� Oracle update");
		
	}

	@Override
	public void delete() {
		System.out.println(IP+"�� �����ؼ� Oracle delete");
		
	}

}
