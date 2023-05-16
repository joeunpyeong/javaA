package pack02_trycatch;

import java.util.Scanner;

public class Test01_TryCatch {
		//�迭�� ������ ������ ���� ����� ����.
		//���� ������ �״�� ����ϸ� ��.
		//��, ������� �Է��� �����ο �߸� �Է� ��
		//"�߸��� �Է��Դϴ�. ���ڹ���?~?������ �Է����ּ���"
		//�� ������ ���α׷��� ������ ����Ǵ� ��찡 ����.(���� ������)
		
		
		public static void main(String[] args) {

			while (true) {
				Scanner sc = new Scanner(System.in);
				int count = 0;
				int userNum=0;
				int[]array=new int[0];
				
				System.out.println("����� ã�� ������ ���۵Ǿ����ϴ�.");
				System.out.print("���̵��� �Է� : ");
				
				while (array.length < 1) {
					try {
						userNum = Integer.parseInt(sc.nextLine()); // ���� �ܿ� �� �Է� ����!
						array = new int[userNum]; // -�� �Ǵ� ������ ����
					} catch (Exception e) {
						System.out.println("���� ���� 1�̻��� ���ڸ� �Է����ּ���.");
					}
				}
				
				System.out.println("���̵� : " + userNum);

				array = new int[userNum];
				array[(int) (Math.random() * array.length)] = 1;

				for (int i = 0; i < userNum; i++) {
					System.out.println("[" + (i + 1) + "�� ����]");
				}

				while (true) {
					System.out.print("���ڹ�ȣ�� �Է��Ͻÿ�\n=>");
					int userAnswer=0;
					
					while (true) {
						try {
							userAnswer= Integer.parseInt(sc.nextLine());;

							userAnswer-=1;
							count += 1;// ���� �ܿ� �� �Է� ����!
							if (userNum - 1 < userAnswer || 0 > userAnswer) {
								System.out.println("���Է��ϼ���.\n");
							} else if (array[userAnswer] == 1) {
								System.out.println("����̸� ã�ҽ��ϴ�.\n");
								for (int i = 0; i < userNum; i++) {
									if (array[i] == 1) {
										System.out.println("[�����]");

									} else {
										System.out.println("[" + (i + 1) + "�� ����]");
									}
								}
								System.out.println("�õ� Ƚ���� :" + count + "�� �Դϴ�.\n\n\n\n");
								break;
							} else {
								System.out.println("����̰� �����ϴ�.\n");

							} // -�� �Ǵ� ������ ����
							
						}catch (Exception e) {
							System.out.println("���� ���� 1�̻��� ���ڸ� �Է����ּ���.");
						}
					}
					
					break;
			}

		}
	}
		
}

