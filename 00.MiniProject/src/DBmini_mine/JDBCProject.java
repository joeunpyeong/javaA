package DBmini_mine;



public class JDBCProject {
	public static void main(String[] args) {
		ProjectDAO dao = new ProjectDAO();
		boolean isTrue = dao.getConn();
		while(isTrue==true) {
			System.out.println("\n=====�������ý���=====");
			System.out.println("1.��ǰȮ��");
			System.out.println("2.��ǰ�߰�");
			System.out.println("3.��ǰ��������");
			System.out.println("4.��ǰ����");
			System.out.println("0.����");
			System.out.println("=======================");
			int selectNum = dao.selectNum();
			if(selectNum==1) {
				dao.displayList();
			}
			else if(selectNum==2) {
				dao.addList();
			}
			else if(selectNum==3) {
				dao.updateList();
			}
			else if(selectNum==4) {
				dao.delete();
			}
			else if(selectNum==0) {
				break;
			}
			else {
				System.out.println("�ٽ��Է����ּ���");
			}
		}
		
	}
}
