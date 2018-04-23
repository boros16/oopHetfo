
public class Alkalmazott {
	private static int nyugdijkorhatar = 65;
	
	private String nev;
	private int kor;
	private long fizetes;
	
	public Alkalmazott(String nev, int kor, long fizetes) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	
	public Alkalmazott(String nev, int kor) {
		super();
		this.nev = nev;
		this.kor = kor;
		fizetes = kor * 10000;
	}
	
	public int hanyEvVanMegNyugdijjig() {
		return nyugdijkorhatar - kor;
	}

	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev
				+ ", kor=" + kor 
				+ ", fizetes=" + fizetes 
				+ ", hany év van még nyugdij-ig="
				+ hanyEvVanMegNyugdijjig() + "]";
	}
	//csak random-hoz
	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}

	public static void setNyugdijkorhatar(int nyugdijkorhatar){
		Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
	}
	
	public static Alkalmazott tobbEvevanhatranyugdijjig(Alkalmazott elsoAlkalmazott,
			Alkalmazott masodikAlkalmazott) {
				if (elsoAlkalmazott.hanyEvVanMegNyugdijjig() > masodikAlkalmazott.hanyEvVanMegNyugdijjig()) {
					return elsoAlkalmazott;
				} else {
					return masodikAlkalmazott;
				}
	}
	
	
}