
public class Teglalaptomb {

	public static void main(String[] args) {
		int meret = 10;
		//Tegla teglatomb[] = new Tegla[meret];
		Tegla[] teglatomb = new Tegla[meret];
		
		for (int i = 0; i < teglatomb.length; i++) {
			teglatomb[i] = new Tegla((int)(Math.random() * 9) + 2
					, (int)(Math.random() * 9) + 2);
			
			System.out.println(teglatomb[i]);
		}
		int min_teruletu_tegla_indexe = 0;
		for (int i = 1; i < teglatomb.length; i++) {
			if (teglatomb[min_teruletu_tegla_indexe].teruletNagyobbMint(teglatomb[i])) {
				min_teruletu_tegla_indexe = i;
			}
		}
		System.out.println(teglatomb[min_teruletu_tegla_indexe]);
	}

}
