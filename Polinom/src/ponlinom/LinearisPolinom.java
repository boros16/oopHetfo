package ponlinom;

import matematika.Polinom;

public class LinearisPolinom implements Polinom {

	private double a;
	private double b;
	
	public LinearisPolinom(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public double szamol(double x) {
		return a * x + b;
	}

	@Override
	public int getPolinomFoka() {
		if(a == 0){
			return 0;
		} else{
		return 1;
		}
	}

	@Override
	public String toString() {
		return "y=" + a 
				+ "x" 
				+ (b < 0 ? "": "+")
				+ b;
	}

}
