package pack04.db;

public interface DataAccessObject {
	//DAO:�����ͺ��̽��� �����ؼ� �����͸� ����( CRUD )
	//�߰�, �б�, ����, ����
	//Oracle(Oracle Database,MySql)
	String IP="192.16.0.38";
	
	public void select();
	public void insert();
	public void update();
	public void delete();
	
	
}