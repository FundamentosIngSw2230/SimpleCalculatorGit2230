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


		ICalculator calculatorSARA = new CalculadoraSARA();
		System.out.println("La suma es: "+ CalculadoraJNRA.add(10,20));
		System.out.println("La resta es: "+ CalculadoraJNRA.substract(20,45));
		System.out.println("La multiplicacion es: "+CalculadoraJNRA.multiply(8,16));
		System.out.println("La division es: "+ CalculadoraJNRA.divide(30,0));

	}
}
