package javeriana.edu.co;

public class CalculadoraCJMP implements ICalculator {

    @Override
    public double add(double a, double b) {
        double suma;
        suma = a + b;
        return suma;
    }

    @Override
    public double substract(double a, double b) {
        double diff;
        diff = a - b;
        return diff;
    }

    @Override
    public double multiply(double a, double b) {
        double product;
        product = a * b;
        return product;

    }

    @Override
    public double divide(double a, double b) {
        double dividir = 0;

        try {
            dividir = a / b;
            if (b == 0) {
                throw new ArithmeticException("Division por 0");

            }

        } catch (ArithmeticException e) {
            System.out.println("Ocurrio una exception: " + e.getMessage());

        }
        return dividir;

    }

    @Override
    public String about() {
        String about = "Calculator implemnted by: " + Authors.CJMP;

        return about;
    }

}
