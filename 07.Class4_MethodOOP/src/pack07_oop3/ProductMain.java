package pack07_oop3;

public class ProductMain {
	public static void main(String[] args) {
		ProductDTO[]dtoArr = new ProductDTO[5];
		//1.dtoArr:0~4������ � �����Ͱ� ���������?

		//2.dtoArr[0]=? �� ������ �� ����� �ұ�?		
		//
		//3.dtoArr�� �̿��ؼ� ��ǰ ��ȣ ����غ���
		
		dtoArr[0]=new ProductDTO(1,"��ǻ��",10000,5);
		dtoArr[1]=new ProductDTO(2,"��Ʈ��",20000,4);
		dtoArr[2]=new ProductDTO(3,"��  ��",1000,10);
		dtoArr[3]=new ProductDTO(4,"Ŀ��",2000,5);
		dtoArr[4]=new ProductDTO(5,"���콺",5000,6);
		ProductDAO dao = new ProductDAO();
//		dao.display(dto1);
//		dao.display(dto2);
//		dao.display(dto3);
//		dao.display(dto4);
//		dao.display(dto5);
		
		//for.�� ProductDAO�� �Űܼ� ��� �Ȱ��� �����
		for(int i=0;i<dtoArr.length;i++) {
			dao.display(dtoArr[i]);
			System.out.println("");
		}
		
		//ProductDAO.display(dto1);
		//ProductDAO.display(dto2);

//		System.out.println("��ȣ"+dto1.getNum()+":");
//		System.out.println("�̸�"+dto1.getName()+":");
//		System.out.println("����"+dto1.getPrice()+":");
//		System.out.println("����"+dto1.getCnt()+":");
		//System.out.println(dto.cnt);<=����������(private)�� ������ �ٷ������� ���Ƴ���
		//System.out.println(dto.getNum);
		//�Ź� dto�� ������ �ϳ��� getter�� �ҷ����°� �ƴ϶� display()��� �޼ҵ带 �����ϰ�
		//�ش��ϴ� �޼ҵ� ȣ�� �� dto�� ������ ������ �� �ְ� �غ���
		//��ȣ:1 , �̸�:��ǻ��,����:10000,����:5
		}
}
