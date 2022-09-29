public class CalculadoraLFRP implements ICalculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        double res = 0;
        try {
            res = a/b;
            if (b==0) {
                throw new ArithmeticException("indeterminacion: division por 0");
            }
        } catch (ArithmeticException s) {
            System.out.println("Ocurrio una exception: " + s.getMessage());
        }
        return res;
    }

    @Override
    public String about() {
        String about = "Implementado por Lukas Rodriguez: " + Authors.LFRP;
        return about;
    }

}