
public class Tegla {
	
	private int a_oldal;
	private int b_oldal;
	
	//konstruktor
	public Tegla(int a_oldal, int b_oldal) {
		setOldalak(a_oldal, b_oldal);
	}
	public Tegla(int oldalhossz) {
		setOldalak(oldalhossz);
	}
	public int terulet() {
		return a_oldal * b_oldal;
	}
	@Override
	public String toString() {
		return + a_oldal + ", " + b_oldal
				+ ": " + terulet();
	}
	public void setOldalak(int a_oldal, int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;		
	}
	public void setOldalak(int oldalhossz) {
		this.a_oldal = oldalhossz;
		this.b_oldal = oldalhossz;	
	}
	public boolean teruletNagyobbMint(Tegla masikTegla) {
		return terulet() > masikTegla.terulet();
	}
	public boolean egyezikE(Tegla masikTegla) {
		return a_oldal == masikTegla.a_oldal && b_oldal == masikTegla.b_oldal;
	}
}
