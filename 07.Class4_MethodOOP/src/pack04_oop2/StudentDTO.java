package pack04_oop2;

public class StudentDTO {
	// �޼ҵ峪 ���� �տ� ���������ڶ�°��� ����ϸ� , �ܺο����� ������ �����Ҽ��ִ�.
	// public , protected , default , private

	// ���� ����Ұ� : public(����,������) , private(������������ , ������)
	// public : ���� ������Ʈ ������ ���� ����
	// default : ���� ��Ű�� ������ ���� ����
	// private : ���� Ŭ���� ���ο����� ���� ����

	private int num;
	private String name;
	// score1~3 => sum , avg ( ���� , ��� )
	// �ܺο��� score1�� ������ �����ؼ� �����Ѱ�� �������� �ŷڰ� ������(���ռ�)

	// getter & setter
	// �����̸��տ� get�� ���̰� �ڿ� �����̸� ù��° ���ڸ� �빮�ڷ� �ٲ����·�,
	// �ܺο����� ������ �����ִ� ������ �޼ҵ带 ���ؼ� ���� �����ϰ� ����� ����.
	// score1=> getScore1()�޼ҵ� => score1�� ����ִ� ���� ��������
	// setScore1(int score1) => score1�� ���� ��������
	private int score1, score2, score3, sum;
	private double avg;

	// ��ü �ʵ�� �ܺο��� ������ �Ұ����� ����(��)
	// ��� �ߴ� �ڵ� �ڵ��ϼ� ������� getter & setter ������.
	// StudentMain �� StudentDAO���� �߻��ϴ� ������ �ذ��غ���.(������)

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}

	public int getScore3() {
		return score3;
	}

	public void setScore3(int score3) {
		this.score3 = score3;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public StudentDTO(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public StudentDTO(int num, String name, int score1, int score2, int score3) {
		this.num = num;
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.sum = this.score1 + this.score2 + this.score3;
		this.avg = (double) (this.score1 + this.score2 + this.score3) / 3;
	}
}
