package szemelyek;

public class Szemely {
	private String nev;
	private int kor;	
	
	public Szemely(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
	}

	public String getNev() {
		return nev;
	}

	public int getKor() {
		return kor;
	}

	@Override
	public String toString() {
		return "Nev: " + getNev() + ", kor: " + getKor();
	}
	
	public boolean eletkorNagyobbMint(Szemely masik_szemely) {
		return getKor() >= masik_szemely.getKor();
	}
		
}