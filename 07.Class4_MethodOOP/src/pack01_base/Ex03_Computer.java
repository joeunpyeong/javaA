package pack01_base;

public class Ex03_Computer {
	//Ex03_Computer�� �޼ҵ带 �����ϱ�
	//sum1�̶�� �޼ҵ带 ����
	//�ش��ϴ� �޼ҵ�� �������� ������� �迭�� �Է¹޾� �迭�� ������ �����ϴ� �޼ҵ��̴�.
	//������ ���ϰ��� ����� �޼ҵ� ȣ��η� ��ȯ(return)�ϴ� ����� �����غ���.
	
	//Ex03_ComputerMain���� ȣ���ؼ� ����غ���
	
	int sum1(int arr[]) {
		int sum=0;
		
		for(int i=0; i<arr.length ;i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
	
	//���� �Ⱦ��� ������ �޼ҵ� �Ķ����
	int sum2(int...values) {
		int sum = 0;
		for(int i=0 ; i<values.length;i++) {
			sum+=i;
		}
		return sum;
	}
	
	
	
}
