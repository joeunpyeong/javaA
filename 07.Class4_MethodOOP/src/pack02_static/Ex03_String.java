package pack02_static;

public class Ex03_String {
	//String Class : ���ڿ��� �����ϱ� ���� ����� ��� �ִ� Ŭ����
	//java.lang(��Ű��)String.class(.java)
	//String ���� Class�̱� ������ ����� ������ �ִ�.
	//�ٸ����(Java,Oracle)�� ���� Ŭ������ ���(�޼ҵ�)Ȱ���غ���.
	//������ �Ұ�ȣ�� x,�޼ҵ�� �Ұ�ȣO
	public static void main(String[] args) {
		String str1 = "apple";//apple���ڿ��� str1�̶�� ������ �Ҵ�
		String str2 = new String("APPLE");//�ν��Ͻ�ȭ ������ ���ļ� STR2��� ������ APPLE�Ҵ�
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		
		//length() �޼ҵ�: ���ڿ��� ���̸� �� �� ����.
		System.out.println("length(int) : "+str1.length());
		
		//toUpperCase() / toLowerCase()
		//�빮�ڷ� ���� / �ҹ��ڷ� ����
		System.out.println("toUpperCase(int) :"+str1.toUpperCase());
		System.out.println("toLowerCaseint() :"+str1.toLowerCase());
		
		//supString() : Ư������ ����(index)
		//subString�޼ҵ带 �ڵ� �ڵ��ϼ�(ctrl+space)�� �غ��� ȣ���غ���
		System.out.println("subString(int) : "+ str1.substring(2));//���� �� index0���� ���ڿ� ������ ���
		System.out.println("subString(int,int) : "+ str1.substring(0,3));//index 1���� 3�� �ձ��� ����
		
		//charAt() : ���ڿ����� Ư�� ���� �� ���ڸ� ����?
		System.out.println("charAt(int) : "+ str1.charAt(1));
		System.out.println("subString(int) : "+ str1.subSequence(1, 2));
		
		//indexOf() : ���ڿ����� Ư�� ������ ���翩�� �� ����:index ��ȯ, ����:-1
		System.out.println("indexOf(int) : "+str1.indexOf("p"));
		
		//split():���ڿ��� �и� �� split()�޼ҵ带 �̿��ؼ� split()�޼ҵ尡 �����ϴ� Ÿ���� �����Ϳ� ��ƺ���.
		String[] temp = str1.split("");
		System.out.println(temp.length);
		String str3 ="ab cd e";
		String[] tempArr = str3.split("");
		System.out.println(tempArr.length);
		
		//replaceAll():���ڿ� ġȯ(Ư�����ڸ� �ٲ㼭 ���ϴ� ���ڷ� �ٲٴ� ��) A=>X
		//PP��� ���ڸ� ã�Ƽ� @@�ٲ㺸��
		System.out.println(str1.replaceAll("p","@"));//returnŸ��?String?
		
		//trim():�¿� ���� ����
		String trimStr1="  abc  def  ";
		System.out.println(trimStr1.trim().replaceAll("", "").length());
	
		
		String eqStr1 = "A";
		String eqStr2 = new String("A");
		System.out.print("eqStr1�� eqStr2�� ");
		if(eqStr1.equals(eqStr2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ�");
		}
	}
}
