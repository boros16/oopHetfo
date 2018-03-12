
public class Alkalmazott {
	String nev;
	long fizetes;
	
	public void fizetesNovel(long ertek) {
		fizetes += ertek;
	}

	public String toString() {
		return "Alkalmazott neve:" + nev + ", fizetese:" + fizetes + "Ft";
	}
	//getter Nev
	public String getNev() {
		return nev;
	}
	//setter Nev
	public void setNev(String nevparameter) {
		this.nev = nevparameter;
	}
	//getter Fizetes
	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}
	
	public boolean fizetesIntervalommokKozott(long alsohatar, long felsohatar) {
		return fizetes >= alsohatar &&
				fizetes <= felsohatar;
	}
	public long fizetendoado() {
		return (long) (fizetes * (16/100.0));
		
	}
	public boolean nagyobbfizetesuMint(Alkalmazott masik) {
		return fizetes >masik.fizetes;
	}
}
