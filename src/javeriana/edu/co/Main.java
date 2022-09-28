package javeriana.edu.co;

public class Main {
	public static void main(String args[]) 
	{
		ICalculator calc = new CalculadoraCJMP();
		System.out.println(calc.add(20, 2));
		calc.divide(20, 0);
		System.out.println(calc.about());
		System.out.println(calc.multiply(30, 3));

		System.out.println("- - - - - -");
			
		ICalculator ALVACalculator = new CalculadoraALVA();
		System.out.println("Resultado Suma: " + ALVACalculator.add(50, 10));
		System.out.println("Resultado Resta: " + ALVACalculator.substract(50, 10));
		System.out.println("Resultado Multiplicacion: " + ALVACalculator.multiply(50, 10));
		System.out.println("Resultado Division: " + ALVACalculator.divide(50, 5));
		System.out.println("Resultado Division (erronea): " + ALVACalculator.divide(50, 0));


		ICalculator calculator = new CalculadoraJNRA();
		System.out.println("suma: "+ CalculadoraJNRA.add(30,20));
		System.out.println("resta: "+ CalculadoraJNRA.substract(2,10));
		System.out.println("multiplicacion: "+CalculadoraJNRA.multiply(30,20));
		System.out.println("division: "+ CalculadoraJNRA.divide(30,5));

	}
}
