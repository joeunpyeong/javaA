package pack02.inter;

public class RemoteMain {
	public static void main(String[] args) {
		//RemoteControl == �������̽�(����� �� ���� ��)
		//Audio ����� ��ӹ޾� ���� �޼ҵ带 ������ ���� ��
		Audio ad=new Audio();
		ad.turnOn();
		ad.turnOff();
		ad.setVolume(5);//�������̽� �κ��� �̿��ؼ� adio�� �ּ� ������ �ִ� ������ �������ָ� ����
	
		Television tv=new Television();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(5);
		//���⼺:�������̽����� ��ӹ��� ��ü Audio&Telvision�� ���������� turnOn,turnOff,setVolume
		//�� ������ ����
		//����  RemoteControl(Interface)==Audio==Television
		
		RemoteControl[] rcArr = new RemoteControl[2];
		rcArr[0]=new Television();
		rcArr[1]=new Audio();
		for (int i = 0; i < rcArr.length; i++) {
			rcArr[i].turnOn();
		}
	}
}
