
public class Ex08_Oper {
	public static void main(String[] args) {
		//�񱳿����� : ���ǹ��� ���� ���ȴ�.
		//���� : � ���� ������ �Ǵ� ���������� �Ǵ��ϴ� ��
		//ID�� PW�� ���� �Է��� ���� DB�� �ִ� ���� ��ġ�ϴ��� ? "�α���":"���̵�" �Ǵ� ��й�ȣ�� Ȯ���ϼ���"
		//�������� �ݵ�� TRUE�� FALSE�� ���� ���� �� �־�� �Ѵ�.��
		int num1=10 , num2 =10;
		//==, !=(����ǥ + =), ==, <=, >=, <, >
		//���ǽ��� ����ϰ� ������ ����� �ݵ�� true, false�� ���´� 
		boolean result1 = num1 == num2; //true/false : true
		boolean result2 = num1 != num2; //true/false :false
		boolean result3 = num1 <= num2; //true/false : true
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		System.out.println(num1 == num2); //true
		System.out.println(num1 != num2); //false
		System.out.println(num1 <= num2); //true
		
		System.out.println(num1 < num2);  //false
		System.out.println(num1 > num2);  //false
		System.out.println(num1 >= num2); //true
		
		//���� ���� �س� ������(�������� ������ �Ǵ�)
		//�������� ��� TRUE �Ǵ� FALSE�� ����� ���´�
		//���ǽ�A && ���ǽ�B: ���ǽ� A�� ���̰� ���ǽ� B�� ���� ���=>TRUE �� �ܿ��� FALSE
		//&&(AND, *,����) 1*1=1, 1*0=0 = 0; A�̸鼭 B�̰�
		
		//���ǽ�A || ���ǽ�B: ���ǽ� A�� ���̸� ���ǽ� B�� ������� =>TRUE
		//||(OR,+,����): 1+?=0 , 0+0=0; A�̰ų� ,B�Ǵ�
		
		System.out.println("\n����");
		//�ϳ��� false�� �߻��ϸ� �ڿ� ������ ������ x, ������ false
		System.out.println(10>5 && 20>5); //true
		System.out.println(10>5 && 20<5); //false
		System.out.println(5>10 && 20>5); 
		System.out.println(5>10 && 5>20);
		
		System.out.println("\n����");
		//�ϳ��� true�� �߻��ϸ� �ڿ� ������ ������ x, ������ true
		System.out.println(10>5 || 20>5); //true
		System.out.println(10>5 || 20<5); //true
		System.out.println(5>10 || 20>5); //true
		System.out.println(5>10 || 5>20); //false
		
		//���ǽ� ������ &&,||�̿��ؼ� ��� ����.
		System.out.println(10>5 && 20 > 5 || 5 > 10);
		
		
	}
}
