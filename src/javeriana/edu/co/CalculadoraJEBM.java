package javeriana.edu.co;

public class CalculadoraJEBM implements ICalculator{
	
	@Override
	public double add(double a , double b) {
		return a+b; 
	}

	@Override
	public double substract(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		try {
			if(b == 0) {throw new ArithmeticException("el denominador es un 0");}
			
		}catch(ArithmeticException e){System.out.println("no se puede dividir por 0");}
		
		return a/b;
	}

	@Override
	public String about() {
		// TODO Auto-generated method stub
		String yo = "calculator implemented by"+Authors.JEBM;
		return yo;
	}

}
