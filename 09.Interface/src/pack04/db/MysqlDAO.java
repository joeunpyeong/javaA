package pack04.db;

//A:MySql�� �̿��ؼ� database�۾�
public class MysqlDAO implements DataAccessObject{

	@Override
	public void select() {
		System.out.println(IP+"�� �����ؼ� MySql select");
		
	}

	@Override
	public void insert() {
		System.out.println(IP+"�� �����ؼ� MySql insert");
		
	}

	@Override
	public void update() {
		System.out.println(IP+"�� �����ؼ� MySql update");
		
	}

	@Override
	public void delete() {
		System.out.println(IP+"�� �����ؼ� MySql delete");
		
	}

}
