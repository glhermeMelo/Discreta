package ListaFinal.Q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumerosPrimos primos = new NumerosPrimos();

        System.out.println("Quantos primos quer imprimir? ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        primos.listarPrimos(num);
    }
}
