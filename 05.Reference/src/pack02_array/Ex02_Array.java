package pack02_array;

public class Ex02_Array {
	public static void main(String[] args) {
		//1.ũ�Ⱑ 10�� ũ�⸦ ���� int�� �迭�� ����� ���� 1���� 10���� �Ҵ��ϰ� ����ϱ�.
		
		int[] array = new int[10];
		int sum=0;
		for(int i=0;i<10;i++) {
			array[i]= (i+1)*10;
			System.out.println("array["+i+"]="+array[i]);
			sum+=array[i];
		}
		System.out.println("array�� ��"+sum);
		int avg=sum/10;
		System.out.println("array�� ���"+avg);
		
	}
}
