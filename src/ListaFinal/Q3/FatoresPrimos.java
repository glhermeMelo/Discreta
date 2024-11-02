package ListaFinal.Q3;

import java.util.Scanner;

public class FatoresPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int n = scanner.nextInt();

        scanner.close();

        System.out.println("Fatores primos de " + n + ":");

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }
}

