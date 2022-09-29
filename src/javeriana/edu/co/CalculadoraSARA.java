package javeriana.edu.co;

public class CalculadoraSARA implements ICalculator
{
    public double add (double a, double b )
    {   double sum ; sum = a+b;
        return sum;}

    public double substract (double a, double b )
    {double rest ; rest = a-b;
        return rest;}

    public double multiply (double a, double b )
    {double mul ; mul = a*b;
        return mul;}

    public double divide (double a, double b )
    {double div=0 ;
        try {
            if (b==0)
            {
                throw new ArithmeticException("El divisor no puede tener valor cero");
            }
        }
        catch (ArithmeticException error)
        {
            System.out.println("No se puede dividir entre el numero cero");
        }
        div = a/b;
        return div;}

    public String about() {
        String about = "Calculator implemnted by: " + Authors.SARA;

        return about;
    }
}