package javeriana.edu.co;


public interface ICalculator {
	public double add (double a, double b);
	public double substract(double a, double b);
	public double multiply(double a, double b);
	public double divide(double a, double b); //throws exception
	public String about();
}
