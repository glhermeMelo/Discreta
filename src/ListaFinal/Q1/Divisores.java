package ListaFinal.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        sc.close();

        List<Integer> listaDivisores = new ArrayList<>();

        int qtd = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                listaDivisores.add(i);
                qtd++;
            }
        }

        System.out.println("Divisores de " + num + ": " + listaDivisores);
        System.out.println(num + " possui " + qtd + " divisores.");

    }
}