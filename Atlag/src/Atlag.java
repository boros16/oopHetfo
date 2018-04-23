import java.util.Scanner;

public class Atlag {
	public static void main(String[] args) {
		
		double[] valostomb = new double[10];
		Scanner bemenet = new Scanner(System.in);
		
		for (int i = 0; i < valostomb.length; i++) {
			System.out.println("Kerem adja meg a(z) " + (i + 1) + ". elem erteket!");			
			valostomb[i] = bemenet.nextDouble();			
		}
		
		double mertani_atlag = 1;

		for (int i = 0; i < valostomb.length; i++) {
			mertani_atlag *= valostomb[i];
		}
		mertani_atlag = Math.pow(mertani_atlag, 
								1.0 / valostomb.length);

		System.out.println("A tomb elemeinek mertani atlaga:");
		System.out.println(mertani_atlag);
		
		bemenet.close();
	}
}