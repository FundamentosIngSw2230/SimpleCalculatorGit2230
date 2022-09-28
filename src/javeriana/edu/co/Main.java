package javeriana.edu.co;

public class Main {
	public static void main(String args[]) {
		ICalculator calc = new CalculadoraCJMP();
		System.out.println(calc.add(20, 2));
		calc.divide(20, 0);
		System.out.println(calc.about());
		System.out.println(calc.multiply(30, 3));
	}

}
