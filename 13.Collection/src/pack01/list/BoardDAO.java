package pack01.list;

import java.util.ArrayList;
import java.util.List;

public class BoardDAO {

	
	//dao.getList()�޼ҵ��  : BoardDAO�� �ν��Ͻ�ȭ ������ ���� dao��� �̸��� ��ü�� �ǰ� dao.������ ����. (�ν��Ͻ����)
	//BoardDTO�� 3�� ���� - 3�� add��Ű�� ��
	//List�� return�ϴ� �޼ҵ��� - List<BoardDTO>�� �����������
	public List<BoardDTO> getList() {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
//		BoardDTO dto1 = new BoardDTO(1, "����1", "����1");
//		list.add(dto1);
//		BoardDTO dto2 = new BoardDTO(1, "����1", "����1");
//		list.add(dto2);
//		BoardDTO dto3 = new BoardDTO(1, "����1", "����1");
//		list.add(dto3);
		list.add( new BoardDTO(1, "����1", "����1"));
		list.add( new BoardDTO(2, "����2", "����2"));
		list.add( new BoardDTO(3, "����3", "����3"));
		
		return list ;
	}
	
	public void getDisplay(List<BoardDTO> list) {
		for(BoardDTO dto:list){
			System.out.println(dto.getBoardNum());
			System.out.println(dto.getBoardTitle());
			System.out.println(dto.getBoardContent());
		}
	}
	
	
	public void intMethod(int x) {
		System.out.println(x);
	}
	
	
	
}
