
public class Ex07_Oper {
	public static void main(String[] args) {
		// = (����, �� �Ҵ�)
		// �� ������(==,<,>,=<,>=)
		// �ʰ� , �̸� :1 < 4 :    1,2,3
		// ���ǽĿ� ���Ե� ���ڸ� ����
		// �̻� , ���� :1 <=4 :    0,1,2,3,4
		// ���ǽĿ� ���Ե� ���ڸ� ����
		int num =10;
		String result = num == 10 ? "�´�" : "Ʋ����";
		//���ڰ� 10�̸� 1�� �׸��� �ƴ϶�� 2�� ��� ���׿����� �Ẹ��
		int resultInt = num == 10 ? 1 : 2;
		
		System.out.println(result);
		System.out.println(resultInt);
		
		//num�� �ִ� ���� 9 ���϶�� true �׿ܿ��� false��
		//���� �� �ִ� ���� ������
		
		boolean resultB = num <=9 ? true : false;
		System.out.println(!resultB);
	}
}
