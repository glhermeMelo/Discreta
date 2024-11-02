package ListaFinal.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números perfeitos deseja? ");
        int n = sc.nextInt();

        sc.close();

        int numero = 2;

        int contador = 0;

        while(contador < n){
            if(Perfeitos.perfeitos(numero)){
                System.out.println(numero);
                contador++;
            }
            numero += 2;
        }

    }
}
