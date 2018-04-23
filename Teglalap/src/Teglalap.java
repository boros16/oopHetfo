
public class Teglalap {
	private int a_oldal;
	private int b_oldal;
	
	public Teglalap() {
		this(1);
	}
	
	public Teglalap(int a_oldal, int b_oldal) {
		setOldal(a_oldal, b_oldal);
	}
	
	public Teglalap(int oldalhossz) {
		this(oldalhossz, oldalhossz);
	}
	
	public int terulet() {
		return a_oldal * b_oldal;
	}

	@Override
	public String toString() {
		return a_oldal + ", " + b_oldal + ": " + terulet();	
	}
	
	public void setOldal(int a_oldal, int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	
	public void setOldal(int oldalhossz) {
		setOldal(oldalhossz, oldalhossz);
	}
	
	public boolean nagyobbTeruletuMint(Teglalap masikTeglalap) {
		return terulet() > masikTeglalap.terulet();
	}
	
	public boolean egyenloE(Teglalap masikTeglalap) {
		return a_oldal == masikTeglalap.a_oldal
				&& b_oldal == masikTeglalap.b_oldal;
	}	
}