public class CalculadoraVJPF implements ICalculator
{


    public double add(double a, double b)
    {
        return a + b;
    }


    public double substract(double a, double b)
    {
        return a - b;
    }


    public double multiply(double a, double b)
    {
        return a * b;
    }


    public double divide(double a, double b) {
        double resultdivision = 0;
        try
        {
            if (b == 0 )
            {
                throw new ArithmeticException("Alerta: Division mal ejecutada");
            }
        }

        catch (ArithmeticException error)
        {
            System.out.println("La variable b no puede ser cero intent con otro numero");
        }

        divideResult = a / b;
        return resultdivision;
    }


    public String about()
    {
        return "Calculadora Elaborada por: " + Authors.VJPF;
    }

}