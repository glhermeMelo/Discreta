package Unidade1;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //Tamanho do somatorio
        int tam = 10;

        //Tamanho do angulo em graus
        double angulo = 45;

        angulo = Math.toRadians(angulo);

        //Somarotio
        double sum = 0.0;

        //laço for para somar os membros do somatório
        for (int i = 1; i <= tam; i++) {
            sum += Math.sin(i * angulo);
        }

        double retornoSeno = calcularSeno(tam, angulo);

        System.out.println("O somatório é " + sum);
        System.out.println("O valor calculando pela fórmula é " + retornoSeno);

    }

    public static double calcularSeno(int tam, double angulo) { //retorna o valor da fórmula
        return Math.sin(angulo * tam / 2) * Math.sin((tam + 1) * angulo / 2) / Math.sin(angulo / 2);

    }
}

    

