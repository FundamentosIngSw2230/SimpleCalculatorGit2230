package javeriana.edu.co;

public class CalculadoraALVA implements ICalculator
{

    @Override
    public double add(double a, double b) 
    {
        return a + b;
    }

    @Override
    public double substract(double a, double b) 
    {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) 
    {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        double divideResult = 0;
        try 
        {
            divideResult = a / b;
        } 
        
        catch (Exception e) 
        {
            System.out.println("Error, dividiste mal. Revisa porfa :D");
        }
        return divideResult;
    }

    @Override
    public String about() 
    {
        return "Calculadora hecha por: " + Authors.ALVA;
    }

}
