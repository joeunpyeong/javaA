package pack07_oop3;

public class ProductDAO {
	
	public  void display(ProductDTO dto) {

		System.out.println("��ȣ :"+dto.getNum());
		System.out.println("�̸� :"+dto.getName());
		System.out.println("���� :"+dto.getPrice());
		System.out.println("���� :"+dto.getCnt());
		
//		for(int i=0;i<dtoArr.length;i++) {
//			dao.display(dtoArr[i]);
//			System.out.println("");
//		}
	}
}
