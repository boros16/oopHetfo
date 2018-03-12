public class AlkHaszn {
	
	public static void main(String[] args) {
		Alkalmazott alkalmazott = new Alkalmazott();
		
		//alkalmazott.nev = "Kiss Jozsef";
		alkalmazott.setNev("Kiss Jozsef");
		//alkalmazott.fizetes = 10;	
		alkalmazott.setFizetes(20);
		
		System.out.println(alkalmazott.getNev());
		System.out.println(alkalmazott.getFizetes());
		alkalmazott.fizetesNovel(5);
		System.out.println(alkalmazott);
		System.out.println(alkalmazott.fizetesIntervalommokKozott(10, 100));
		System.out.println(alkalmazott.fizetendoado());
		
		Alkalmazott alkalmazott2 = new Alkalmazott();
		alkalmazott2.setNev("Kiss Klaudia");
		alkalmazott2.setFizetes(20);
		
		System.out.println(alkalmazott.nagyobbfizetesuMint(alkalmazott2));
		System.out.println(alkalmazott2.nagyobbfizetesuMint(alkalmazott));
		
		Alkalmazott[] alkalmazottak =
				new Alkalmazott [5];
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott() ;
			alkalmazottak[i].setNev("A");
			alkalmazottak[i].setFizetes((long)(Math.random() * 50));
			System.out.println(alkalmazottak[i]);
			
		}
	}
}
