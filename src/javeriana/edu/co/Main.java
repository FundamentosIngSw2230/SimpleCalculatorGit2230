package javeriana.edu.co;

public class Main {
	public static void main(String args[]) 
	{
		ICalculator calc = new CalculadoraCJMP();
		System.out.println(calc.add(20, 2));
		calc.divide(20, 0);
		System.out.println(calc.about());
<<<<<<< HEAD
	
		System.out.println("- - - - - - - -");
		
		ICalculator CalculadoraALVA = new CalculadoraALVA();
		System.out.println (CalculadoraALVA.add(10, 2));
		CalculadoraALVA.divide (20, 0);
		System.out.println (CalculadoraALVA.about());
=======
		System.out.println(calc.multiply(30, 3));
>>>>>>> e77d8f6d0256405639d275f87d246db036f8acc7
	}
}
