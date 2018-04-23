public class TeglalapotHasznalo {
	public static void main(String[] args) {
		Teglalap a_objektum = new Teglalap(2);
		Teglalap b_objektum = new Teglalap(3, 4);
		Teglalap c_objektum;
		c_objektum = a_objektum;
		
		System.out.println("Referencia valtozok adatai:");
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		a_objektum.setOldal(5);

		System.out.println("Referencia valtozok adatai: (a_obj. modositasa utan)");
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		a_objektum.setOldal(3, 4);
		
		System.out.println("Referencia valtozok adatai: (a_obj. adatai megegyeznek b_obj. adataival)");
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);

		System.out.println("a_objektum == b_objektum");
		System.out.println(a_objektum == b_objektum);
		
		System.out.println("a_objektum == c_objektum");
		System.out.println(a_objektum == c_objektum);
		
		System.out.println("a_objektum.egyenloE(b_objektum)");
		System.out.println(a_objektum.egyenloE(b_objektum));
	}
}