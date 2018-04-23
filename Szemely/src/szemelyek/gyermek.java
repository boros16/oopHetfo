package szemelyek;

public class gyermek extends Szemely {
	private String iskola;

	public gyermek(String nev, int kor, String iskola) {
		super(nev, kor);
		this.iskola = iskola;
	}	
	
	@Override
	public String toString() {
		return "Gyermek [" 
				+ super.toString()
				+ ", iskola: " 				
				+ getIskola() 
				+ "]";
	}

	public String getIskola() {
		return iskola;
	}	
}