package pack04.extend;

public class ExamMainSmart {
	public static void main(String[] args) {
		SmartPhone sp=new SmartPhone(1, "����", "samsung", 5);
		sp.powerOn();//CellPhone
		sp.turnOnDmb();//DmbPhone
		sp.internetOn();//SmartPhone
		//sp.changeFolder();  //private�� �ȵ�
		
		
	}
}
