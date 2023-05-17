package DBmini;

public class ProjectDTO {
	private int CNT, CODE,PRICE;
	private String NAME;
	
	public ProjectDTO(int cNT, int cODE, int pRICE, String nAME) {
		super();
		CNT = cNT;
		CODE = cODE;
		PRICE = pRICE;
		NAME = nAME;
	}
	
	public int getCNT() {
		return CNT;
	}
	public void setCNT(int cNT) {
		CNT = cNT;
	}
	public int getCODE() {
		return CODE;
	}
	public void setCODE(int cODE) {
		CODE = cODE;
	}
	public int getPRICE() {
		return PRICE;
	}
	public void setPRICE(int pRICE) {
		PRICE = pRICE;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	
	
}
