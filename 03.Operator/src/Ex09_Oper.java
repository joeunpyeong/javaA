import java.util.Scanner;

public class Ex09_Oper {
	public static void main(String[] args) {
		//����Ÿ�� ������ = �� �񱳽� ? "��ȯ��1" : "��ȯ��2"
		//int result = num < 10 ? 1: ��2 ? ��3...: ��� ���� ���� �ƴҶ�
		Scanner sc = new Scanner(System.in);
		int score = Integer.parseInt(sc.nextLine());
		System.out.println("���� :"+ score);
		String grade = score > 90 ?"A" : score > 80 ?"B" : score > 70 ?"C" : "D";
		System.out.println(grade);
	}
}
