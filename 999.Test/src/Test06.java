
public class Test06 {
	public static void main(String[] args) {
		//��� ��Ģ(���ַ̹�):Class(.java)������ �빮�ڷ� �����ϱ�.
		//������ �ҹ��ڷ� �����ϴµ� �ǹ��ִ� �ܾ �����ؼ� ������.
		int korScore,mathScore,engScore,sciScore,athScore;
		korScore = 70;
		mathScore = 80;
		engScore = 90;
		sciScore = 80;
		athScore = 70;
		System.out.println(korScore);			
		System.out.println(mathScore);	
		System.out.println(engScore);	
		System.out.println(sciScore);	
		System.out.println(athScore);	
		
		//����ȯ(Casting) : ���� �ٸ� Ÿ���� ������ ��ȯ���� �����.
		//ex)int <->double , String <-> int
		//int < double
		int iValue=10;
		double dValue = iValue+0.5;//�ƹ��͵� �� �� ���� ==>�ڵ� �� ��ȯ
		System.out.println("iValue�� : " + iValue);
		System.out.println("dValue�� : " + dValue);
		//�� ū ������Ÿ���� ���� Ÿ�Կ� ���� �� ������ �߻���.
		//�����ڰ� � Ÿ������ �ٲܰ��� ��ø� ���༭ ������ �ٲ�.
		//�츮�� � �۾��� ��==>��������ȯ
		iValue = (int)dValue;
		System.out.println(iValue);//������ �߻��� = �Ҽ��� ����
		System.out.println("iValue�� : " + iValue);
		System.out.println("dValue�� : " + dValue);
		
		String str = "1234"+12;   //123412
		//���ڿ��� � ���� ���ϴ� �� == ��x => ����(������ ��ħ)
		int iData = 1234+12; //1246
		//������ ������������ == �� ==> ���� ��ħ
		System.out.println(str);
		System.out.println(iData);
		
		//str���� ���� 123412��� ���ڿ��� ����Ǿ�����.
		//���ڷ� �ٲٷ��� ��� �ؾ��ұ�?
		//123412�� ���� ���ڷ� �ٲٰ� +1�� ����� ����ϱ�
		//int =>Integer , double =>Double , wrapperClass ù���ڰ� �빮��
		int sum = Integer.parseInt(str)+1;
		System.out.println(sum);
		
		//boolean(�ο���) true �Ǵ� false �� ������ ������.
		int a=1, b=2, c=3;
		
		
	}
}

