package pack02_array;

public class Test01_ArraySum {
	public static void main(String[] args) {
		//10���� ũ�⸦ ���� String�� �迭 sArr�� �ִ�.
		//sArr���ο��� ���ڿ� 1���� ������ �ε������� 10������ �Ҵ��� �Ǿ��ִ�.
		//sArr���ο� ����ִ� ���ڿ��� ���ڷιٲ㼭 �������� ���ϰ� ����غ���. 
		
		int sum = 0;
		String[] sArr= new String[10];
		for(int i=0 ; i<10 ; i++) {
			sArr[i]=""+(i+1);
			System.out.println(sArr[i]);
			sum+=Integer.parseInt(sArr[i]);
		}
		System.out.println(sum);
	}
}
