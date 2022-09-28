package javeriana.edu.co;

import java.util.Scanner;

public class CalculadoraMJGG implements ICalculator {
    public double add(double a, double b){
        double resultadoSum;
        resultadoSum=a+b;
        return resultadoSum;

    }

    @Override
    public double substract(double a, double b) {
        double resultadoRest;
        resultadoRest=a-b;        
        return resultadoRest;
    }

    @Override
    public double multiply(double a, double b) {
        double resultadoMul;
        resultadoMul=a*b;
        return resultadoMul;
    }

    @Override
    /**
     * Dado que es una división entre valores de punto flotante, dividir sobre 0 es válido para java
     * dando siempre como resultado infinity, de modo que no es necesario hacer ningún try - catch, sino
     * hacer una validación al inicio de la función, en la cual para efectos de este programa indique que no es
     * válido tener un denominador 0.
     */
    public double divide(double a, double b){

        if(b==0){
            System.out.println("No puede realizarse esta operación");
            return -1;
        }
        double resultadoDiv;
        resultadoDiv=a/b;
        return resultadoDiv; 
    }
    
    @Override
    public String about() {
        String autor;
        autor= "Calculator implemnted by: " + Authors.MJGG;
        return autor;
    }

    void menu(){
        Scanner sc = new Scanner(System.in);
        double resultado;

        System.out.println("\nIndique el tipo de operación que desea realizar");
        System.out.println("1.Suma\n2.Resta\n3.Multiplicación\n4.División\n0.Salir\n");
        int opcion = sc.nextInt();

        if(opcion != 0){

            while (opcion != 0) {

                System.out.print("Indique el primer valor (numerador en división): ");
                double a = sc.nextDouble();
                System.out.print("Indique el segundo valor (denominador en división): ");
                double b = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = add(a, b);
                        System.out.println("el resultado de la suma es: " + resultado);
                        break;
        
                    case 2:
                        resultado = substract(a, b);
                        System.out.println("el resultado de la resta es: " + resultado);
                        break;
                    
                    case 3:
                        resultado = multiply(a, b);
                        System.out.println("el resultado de la multiplicación es: " + resultado);
                        break;
                    
                    case 4:
                        resultado = divide(a, b);
                        if(b != 0){
                            System.out.println("el resultado de la división es: " + resultado);
                        }
                        break;
        
                    default:
                        System.out.println("Este valor no representa una opción");
                        break;
                }

                System.out.println("\nIndique el tipo de operación que desea realizar\n");
                System.out.println("1.Suma\n2.Resta\n3.Multiplicación\n4.División\n0.Salir\n");
                opcion = sc.nextInt();
            }
    
        }

        System.out.println("\n\nhasta la próxima :)\n");
        sc.close();
       
    }

    
}
