package pack04_oop2;

//Student Class:�л��� ���������� ������ �� �ְ� ���� ���赵
public class Student {
	//�ʵ�θ� ���� �����ϰ� StudentMain���� Student��ü�� �����ϰ� ������ �Ҵ��ϰ� ����غ���
	//���(�ʵ�) : �л��� ��ȣ,�̸�,����,����,���� ����,���� ���
	
	int num,kor,math,eng,sum;
	String name;
	double avg;
	public Student(int num, int kor, int math, int eng,String name) {
		super();
		this.num = num;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.sum = this.kor+this.math+this.eng;
		this.name = name;
		this.avg = this.sum/3;
	}
	
	void display() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(sum);
		System.out.println(avg);
	}
	
}
