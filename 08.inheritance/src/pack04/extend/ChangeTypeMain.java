package pack04.extend;

public class ChangeTypeMain {
	public static void main(String[] args) {
		//CellPhone =>DmbPhone=>SmartPhone
		//CellPhone�� �θ�Ŭ�����̱� ������ �ڽ�Ŭ������ �Ϻΰ� �״�� ������.
		//�ڽ�Ŭ������ �θ�Ŭ������ ��ԵǸ� �� ����� �״�� ����� �����ϴ�.
		
//		CellPhone cp = new DmbPhone(1,"����","��");
//		CellPhone cp2 = new SmartPhone(1,"����","��",5);
//		cp2.powerOn();//�ڽ�Ŭ�������� ������ �� �޼ҵ尡 ȣ���̵�.
		CellPhone[] cpArr= new CellPhone[2];
		cpArr[0]=new DmbPhone(1,"����","��");
		cpArr[1]=new SmartPhone(1,"����","��",5);
		
		DmbPhone dp = new SmartPhone(1,"����","��",0);
		
		for(int i=0;i<cpArr.length;i++) {
			cpArr[i].powerOn();
		}
		//����Ÿ�Ժ�ȯ�߿� �ڵ��� ������ �־��� ���� ���̰� ������?
		//ex)int <=>double
		//int���� intNum, double dNum �ΰ��� ���� �ٲ㼭 ��ƺ���.
		int intNum=5;
		double dNum=3.14;
		dNum=intNum;//�ڵ�
		intNum=(int)dNum;//����:��κ��� Ÿ�Ժ�ȯ�� �ǹ� casting
		
		SmartPhone sp = (SmartPhone)new DmbPhone(1,"����","��");
		//�ڽ�= �θ�; ���� ĳ������ ����� �Ѵ�.
		
	}
}
