package sajat.elso;


public class Szam {
	
	private final static double tures = 0.001;
	private double valosSzam;
	public Szam(double valosSzam) {
		super();
		this.valosSzam = valosSzam;
		//tures=2;
	}
	public boolean  valoSzamTuresenBelulVane(double valosSzam) {
		return Math.abs(this.valosSzam - valosSzam);
				< tures;
	}
	 
}
