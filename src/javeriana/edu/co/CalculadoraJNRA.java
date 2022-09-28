package javeriana.edu.co;

public class CalculadoraJNRA implements ICalculator{

	public double add(double a, double b){
		return a + b;
	}

	public double substract(double a, double b){
		return a - b;
	}

	public double multiply(double a, double b){
		return a * b;
	}

	public double divide(double a, double b){
			try{
				if (b == 0)
				{
					throw new ArithmeticException("b no puede ser 0");
				}
			}
			catch (ArithmeticException error){
				System.out.println("no se puede dividir entre 0");
			}
			return a / b;
		}
}
