package pack03_for;

public class Ex02_For {
	public static void main(String[] args) {
		//����� �����ϰ� ��ø�� �����ϴ�.
		int num=0;
		for(int i=1 ; i<=10 ; i++) {
//			if(i%2==0) {
//				System.out.println(i+"¦��");
//			}else if(i%2==1){
//				System.out.println(i+"Ȧ��");
//			}else {
//				System.out.println(i +"= 0");
//			}
			System.out.println(i);
			num+=i;
		}
		System.out.println("=" + num);
		
		
	}
}
