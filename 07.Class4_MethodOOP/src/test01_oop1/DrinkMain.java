package test01_oop1;

public class DrinkMain {
	public static void main(String[] args) {
		// �ݺ��� ����ؼ� �ϴٰ� ������Ű�� �Է¹޾� ����Ǿ���.
		// DrinkDTO dto = //null , 0 , 0 <= �ʱⰪ�� ����.
		DrinkDAO dao = new DrinkDAO();
		//DrinkDTO[] drinkArr = dao.initDrinks();// ����3���� �ִ� �迭�� return ����

		while (true) {
			dao.display();
			System.out.println("0.�����ڸ��,1.�����ֹ� , -1.����");
			int inputMenu = dao.inputInt();
			if(inputMenu == 0) {
				System.out.println("�����ڸ�带 �����մϴ�.");
				System.out.println("���� ��Ģ�� ���� ������ �α����� ���ּ���.");
				AdminDAO aDao = new AdminDAO();
				if(aDao.adminLogin()) {
					System.out.println("1.�����߰� 2.������� 3.������� -1.���θ޴��� �̵�");
					inputMenu = dao.inputInt();
					if(inputMenu==1) {
						aDao.addMenu(dao);
					}else if(inputMenu==2) {
						
					}else if(inputMenu==3) {
						
					}else if(inputMenu==-1) {
						
					}else {
						System.out.println("�߸��Է��ϼ̽��ϴ�. ���θ޴��� �̵��մϴ�.");
					}
					
				}
			}
			if (inputMenu == 1) {
				System.out.println("���� �־��ּ���.");
				int money = dao.inputMoney();
				System.out.println("�ݾ� �Է� �� : "+ money);
				while(money != -1) {
					System.out.println("�ܵ� : "+money + " ���� ��ȣ�� �Է����ּ���.");//0~2, ����� 1~3
					int choice = dao.choiceMenu();
					System.out.println(choice + "�� ���ÿϷ�");
					money =dao.orderMenu(choice, money);
				}
			} else if (inputMenu == -1) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
	}
}
