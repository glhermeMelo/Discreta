package Unidade2;

import java.util.Scanner;

public class Q1 {

    public static void deltaPositivo(double delta, double a, double b){

        double r1 = (-b + Math.sqrt(delta))/(2*a);
        double r2 = (-b - Math.sqrt(delta))/(2*a);

        System.out.printf("Fₙ  = C₁ * (%.2f)ⁿ + C₂ * (%.2f)ⁿ", r1, r2 );
    }

    public static void deltaZero(double a, double b){

        double r = -b / (2*a);

        System.out.printf("Fₙ = C₁ * (%.2f)ⁿ + C₂ * n * (%.2f)ⁿ", r, r);
    }

    public static void deltaNegativo(double delta, double a, double b){

        delta = delta * (-1);

        double inteiro = -b / (2*a);
        double imag = Math.sqrt(delta)/(2*a);

        double r = Math.sqrt(Math.pow(inteiro,2)+Math.pow(imag,2));

        double angulo = Math.toDegrees(Math.atan(imag /inteiro));

        System.out.printf("Fₙ = %.2fⁿ * [(k₁ * cos(n * %.2fº) + k₂ * sen(n * %.2fº))]", r, angulo,angulo);

    }
    public static void main(String[] args) {
        System.out.println("Digite os valores de A, B e C: ");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        if (a == 0)
            throw new ArithmeticException("A deve ser diferente de 0");

        double b = sc.nextInt();
        double c = sc.nextInt();

        if(a != 1){

            double modulo = Math.abs(a);
            a = a/modulo;
            b= b/modulo;
            c = c/modulo;
        }

        double delta = Math.pow(b,2) - 4 * a * c;

        if (delta > 0)
            deltaPositivo(delta, a, b);
        else if(delta == 0)
            deltaZero(a, b);
        else
            deltaNegativo(delta, a, b);
    }
}
