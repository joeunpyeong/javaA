package pack00_x;

import java.util.Scanner;

public class New {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ��ĳ�� �غ�

		int st = 0, st1 = 0; // ���丮
		int power=0, agi=0, inte=0, nar=0, app=0, hp = 1, money=0, fame = 0; // �ɷ�ġ
		int cat = 0; // ���,����,����
		int[] inventory = new int[6]; // 0~5 ,�� 6���� �κ��丮
		String catName = null;
		// ����
		while (true) {
			System.out.println("���� �̸� \n�г����� �Է����ּ���");
			System.out.print("������� �г��� : ");
			String userName = sc.nextLine(); // String userName ���� �г���
//------
			System.out.println("�� ������ ���۵Ǹ� ���������� ���ž��մϴ�.\n");

			// 1
			System.out.println("�� �ٶ��� ���� �� ����� ��â�� �� �ӿ��� �������� ��ġ�� ������ϴ�.\n�и� �� �ȿ��� �������ϴµ� ������.\n");
			System.out.println("1.�������� ���ƴٳ� ����. 2.���� ���� �ö󰡼� ������ ���ɴ�.");
			while (true) {
				System.out.print("=>");
				st = Integer.parseInt(sc.nextLine());
				if (st == 1) { // 1-1
					System.out.println(
							"��â�� �� ���� ���ƴٴϴ� �� �糪�� �����(��:2 ,��ø 3)�� �����ƽ��ϴ�. �ο�ðڽ��ϱ�?\n 1.�ο��(��:2�̻�) 2.����ģ��(��ø:3�̻�) 3.����δ�(����:6�̻�)");
					System.out.print("=>");
					st1 = Integer.parseInt(sc.nextLine());
					if (st1 == 1) {// 1-1-1
						if (agi >= 4) {// 1-1-1.1
							System.out.println("�糪�� ����̸� �ѾƳ½��ϴ�.");
							System.out.print("����� �Ǳ����ϰ� ���� �����ϴ�. \n�ȴٺ��� ");
						} else {// 1-1-1.2
							System.out.println("����� ����� ����� ����̿��� ���Ƚ��ϴ�.");
							hp -= 2;
							System.out.println("(ü���� 2 �����߽��ϴ�. ���� ü�� :" + hp + ")");
							System.out.print("����� ��ģ ���� �̲��� �ȴٺ��� ");
						}
					} else if (st1 == 2) { // 1-1-2
						if (agi >= 4) {// 1-1-2.1
							System.out.println("����� ������ �����ƽ��ϴ�.");
							System.out.print("����ģ ����� �쿬�� ");
						} else {// 1-1-2.2
							System.out.println("����ġ�� ���� �ڸ� �Ѿƿ��� ����̿��� ���Ƚ��ϴ�.");
							hp -= 2;
							System.out.println("(ü���� 2 �����߽��ϴ�. ���� ü�� :" + hp + ")");
							System.out.print("����� ��ģ ���� �̲��� �ȴٺ��� ");
						}
					} else if (st1 == 3) {
						System.out.print("����̿��� �ٰ��� ����̱⸦ �õ��մϴ�.");
						if (inte >= 6) {// 1-1-2.1
							System.out.println("������ TV���� �� ������ ���� ����̸� ����� �� �־����� \n����̴� �������� ����̿��� �������ϴ�.");
							hp--;
							System.out.println("(ü���� 1 �����߽��ϴ�. ���� ü�� :" + hp + ")");
							cat++;
							System.out.print("�쿩���� ���� ����� ����̸� ��鿴���ϴ�.\n ������ ��Ű� ������ �Բ� �� ������� �̸��� �����ּ���.\n=>");
							catName = sc.nextLine();
							System.out.print("����� �����" + catName + "�� ���� ���� ������ �������� ");
						} else {// 1-1-2.2
							System.out.println("���� �ձ濡 ����̰� ����ϸ� ����� ��Ţ�ϴ�.");
							hp -= 6;
							System.out.println("(ü���� 6 �����߽��ϴ�. ���� ü�� :" + hp + ")");
							System.out.print("����� ��ģ ���� �̲��� �ȴٺ��� ");
						}
						System.out.println("���� ������ �߰��߽��ϴ�.");
					}
					break;
				} else if (st == 2) {// 1-2
					System.out.println("���� ������ �����ٺ��� �� ���� �ȵǴ� ���� ���� ������ ���Դϴ�.");
					break;
				} else {
					System.out.println("�������� �ʴ� �������Դϴ�. �ٽ� �Է��� �ּ���.");
				}
			}
			// 2
			System.out.print("����� ���� �Ա��� �����߽��ϴ�. ������ ������ ����\n���� �Ա����� â�� �� ����� ��ſ��� �ɾ���� ���� �̴ϴ�.\n\"�������̿� �� ������?\""
					+ "\n�˷��ְ� ���� �̸��� �Է��ϼ���. \n �� �̸���  ");
			String sSay = sc.nextLine();
			if (!userName.equals(sSay)) { // .equals() ->���ڿ� �� �����ϰ� ��Ű�� ��
				System.out.println("���� ����� ���� ��Ѹ��� â�� ���̴�ϴ�. �׸��� ������ ���� ���� �����߽��ϴ�. \"�� ���� �������� �ϰ� �ֱ�\"");
				fame--;
				System.out.println("(���� 1 �����߽��ϴ�. ���� �� :" + fame + ")");
			}
			System.out.print("\"���� �̸��� ����� �ƴϴ�.");
			if (cat > 1) {
				System.out.println("���� �Ƥ�..\"/n" + "���� ����� " + catName + "�� ���� ");

			} else {
				System.out.println("���� ���.. �ʴ� �� ������ ���� �� ����. \n���� ��������� �� ������ ������ �Ѵٸ�... \"");
			}

		}
	}
}
//int random = (int)(Math.random()*6)+1;   ������ ����� �����Լ�

//�ɷ�ġ ��power, �ں�money, ��øagi, ����inte, ȭ��nar, �ܸ�app, �ǰ�helth
//sSay(����������� �˷��� �̸�), ����coin(���� �÷��� Ƚ��), st����(�÷��̾ ������ ������ ����)
//String userName  ���� �г���
//inventory

//���丮 ¥�°� ����׿�

//Ex02_Array ���� ���鶧 ���� ��