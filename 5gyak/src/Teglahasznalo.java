
public class Teglahasznalo {
	public static void main(String[] args) {
		Tegla a_objektum = new Tegla(2);
		Tegla b_objektum = new Tegla(3, 4);
		
		//Tegla c_objektum = a_objektum;
		Tegla c_objektum;
		c_objektum = a_objektum;
		
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		//a_objektum.setOldalak(5, 5);
		a_objektum.setOldalak(5);
		
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		System.out.println(a_objektum == b_objektum);
		System.out.println(a_objektum == c_objektum);
		System.out.println(a_objektum.egyezikE(b_objektum));
	}
}
