public class Szemely {
	private String nev;
	private int testtomeg;
	double magassag;


	public double testTomegIndex() {
		return testtomeg / (magassag * magassag);
	}

	public String alkat() {
		double testtomegindex = testTomegIndex();
		
		if (testtomegindex < 18.5)
			return "sovány";
		else if (testtomegindex > 25)
			return "túlsúlyos";
		else
			return "normál";
	}

	public String toString() {
		return nev + ", " + testtomeg + " kg, " 
				+ magassag + " m, alkat: " 
				+ alkat() + " (tti: " 
				+ String.format("%.1f", testTomegIndex()) + ")";
	}	
	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getTesttomeg() {
		return testtomeg;
	}

	public void setTesttomeg(int testtomeg) {
		this.testtomeg = testtomeg;
	}

	public double getMagassag() {
		return magassag;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}	

	public double modositott_testTomegIndex() {
		return 1.3 * testtomeg / Math.pow(magassag, 2.5);
	}
}