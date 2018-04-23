public class kenyer extends product{
	private double mennyiseg;

	public kenyer(String nev, int netto,int afakulcs, double mennyiseg) {
		super(nev,netto,afakulcs);
		this.mennyiseg = mennyiseg;
		
	}

	@Override
	public String toString() {
		return "kenyer ["+super.toString()
				+ ",egysegar: "
				+ brutto() / mennyiseg
				+ "]";
	}

	public double getMennyiseg() {
		return mennyiseg;
	}

		public static boolean elso_kenyer_nagyobb_egysegaru(kenyer elso_kenyer, kenyer masodik_kenyer) {
			return elso_kenyer.brutto() / elso_kenyer.mennyiseg >
					masodik_kenyer.brutto() / masodik_kenyer.brutto();
		}
}
