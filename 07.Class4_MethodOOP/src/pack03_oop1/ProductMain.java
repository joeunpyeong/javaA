package pack03_oop1;

public class ProductMain {
	public static void main(String[] args) {
		//��ǰ �ΰ��� �����ϱ�
		//1.��ǻ�� 2.��Ʈ��
		//display()�޼ҵ带 �̿��ؼ� ���� ����غ���.
//		Product p1 = new Product(1,"��ǻ��");
//		p1.display();
//		Product p2 = new Product(2,"��Ʈ��");
//		p2.display();
		
		ProductDTO dto = new ProductDTO();
		dto.num=1;
		dto.name="��ǻ��";
		ProductDAO dao = new ProductDAO();
		dao.display(dto);
	}
}
