package dao.dto.method;

public class HumanDTO {
	//기능:DTO(속성만 가지고 있음,+gatter setter constructor)
	public String eye="눈",mouth="입",ear="귀",hand="손";//상태정보를 저장함
	
	//기능:DAO(인스턴스화1)
	public void seeMovie() {
		System.out.println(eye+"과"+ear+"로 영화를 봅니다.");
	}
	public void ask() {
		System.out.println(mouth+"로 대화중");
	}
	public void coding() {
		System.out.println(hand+"로 코딩중");
	}
}
