
public class product {

	String nev;
	int netto;
	int afakulcs;
	
	public product(String nev,int netto,int afakulcs) {
		super();
		this.nev = nev;
		this.netto = netto;
		this.afakulcs = afakulcs;
	}
	public int brutto() {
			return (int) (netto *(1+afakulcs/100.0));
	}
	public void nettoaratnovel(int szazalek) {
		netto = (int)(netto * (1+ szazalek/100.0));
	}
	public int dragabbe(product masikaru) {
		 if(brutto() > masikaru.brutto()){
			 return 1;
		 }else if(brutto() < masikaru.brutto()){
			 return -1;
		 }else {
			 return 0;
	}
		
	}
}
