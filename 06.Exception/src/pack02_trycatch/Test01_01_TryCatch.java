package pack02_trycatch;

import java.util.Random;
import java.util.Scanner;

public class Test01_01_TryCatch {
	public static void main(String[] args) {
		// 배열의 랜덤한공간에 숫자 숨기기 게임.
				// 기존로직은 그대로 사용하면 됨.
				// 단, 사용자의 입력은 자유로운데 잘못입력시 "잘못된입력입니다. 숫자범위 ?~?까지만 입력해주세요"
				// 가 나오고 프로그램은 강제로 종료되는 경우가 없다.(게임 끝까지.)

				Scanner sc = new Scanner(System.in);
				System.out.println("레벨을 입력하세요.");
				int[] array = new int[0];
				System.out.println(array.length);
				int lev = 0;

				while (array.length < 2) {
					try {
						lev = Integer.parseInt(sc.nextLine()); // 숫자 외에 값 입력 오류!
						array = new int[lev]; // -값 또는 들어오면 오류
					} catch (Exception e) {
						System.out.println("숫자 오류 2이상의 숫자를 입력해주세요.");
					}
				}

				int random = new Random().nextInt(lev);
				array[random] = 1;
				System.out.println("숫자를 맞추세요.");
				for (;;) {
					try {

						int num = Integer.parseInt(sc.nextLine());
						if (num == random) {
							System.out.println("딩동댕");
							break;
						} else if (num > random) {
							System.out.println("땡! 더 작은 수를 입력하세요");
						} else {
							System.out.println("땡! 더 큰 수를 입력하세요");
						}
					} catch (Exception e) {
						System.out.println("숫자만 입력해주세요!!!!제발");
					}
				} 
	}
}
