package pack04.extend;

public class ExamMain {
	public static void main(String[] args) {
		DmbPhone dmbP = new DmbPhone(1, "����", "LG");
		dmbP.powerOn();
		dmbP.bell();
		dmbP.sendVoice("��������?");
		dmbP.receiveVoice("Ȥ�� ���� �غ� �Ǽ̳���?");
		dmbP.hangUp();
		//cellPhone���� ���� �س��� ���
		dmbP.turnOnDmb();
		dmbP.changeChannel(10);
		dmbP.turnOffDmb();
	}
}
