package sajat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Proba1 {

	public static void main(String[] args) {
		int elemekSzama = 5;
		int[] egeszTomb = new int[elemekSzama];
		Scanner beolvasas = new Scanner(System.in);
		
		for (int i = 0; i < egeszTomb.length; i++) {
			boolean rosszAdat = true;
			do{
				System.out.println("Kerem adja meg a(z)" + (i + 1)
						+ ". egesz szamot!");
				System.out.println("szam:");
				try {
					egeszTomb[i] = beolvasas.nextInt();
					beolvasas.nextLine();
					rosszAdat = false;
				} catch (InputMismatchException e) {
					System.out.println("rossz input");
				}
				finally{
					System.out.println("finally blokk");
				}
			} while (rosszAdat);
			
		}
		System.out.println("A tomb elemei:");
		for (int i : egeszTomb) {
			System.out.println(i);
		}
		beolvasas.close();
		}

}
