package pack02_array;

public class Ex01_Array {
	public static void main(String[] args) {
		//�迭�̶�?
		//�ڷ��� ������ �����ϰ� ����Ҷ� �ַ� ����
		//��Ģ : "������" ������Ÿ���� ��� ����ϰ� �ϸ� ������ ����ŭ ���� ó���ϴ� 
		//"��ü" =>�ѹ� ���� ũ��� �ٽ� �ٲٴ°� �����ϴ�.
		//���� dataType[]name       = new dataType[size]
		//     ������Ÿ��[]�迭�̸� = new ������ Ÿ��[ũ��]
		
		//���� ��ĳ�ʳ� ������ ó���� ������ �Է����� ���� ���� 5���� �غ� �ص�.
		int score1= 0,score2= 0, score3= 0,score4= 0, score5= 0;
		
		int[]scoreArray = new int[5];//0[0] 1[0] 2[0] 3[0] 4[0]
		//�迭�� �ε��� ��Ģ : n�� ũ�Ⱑ �־��� �迭�� 0���� n-1������ �ּҸ� ������.
		System.out.println("scoreArray[0]��" + scoreArray[0]);
		System.out.println(scoreArray); //[I@13c27452 => �������� �ּ�(�޸�) / ���� �ƴ�
		scoreArray[0] = 10;//�迭�� ������ Ÿ���� �־������� �ش��ϴ� Ÿ���� ������� ����
		System.out.println("scoreArray[0]��" + scoreArray[0]);
		
		for(int i=0 ; i<5; i++) {
			scoreArray[i]=(i+1)*10;
			System.out.println("scoreArray["+i+"] =" + scoreArray[i]);
		}
		
	}
}
