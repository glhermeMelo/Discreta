import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        int tamSomatorio = 4;

        System.out.println("Número de permutações para " + tamSomatorio + " elementos = " + numPermutacoes(tamSomatorio)); //exibir o número de permutações caóticas
    }

    public static int calcularFatorial(int num) {
        if (num == 0) //se for 0!, retorna 1 (resultado do fatorial)
            return 1;

        int somatorio = num * calcularFatorial(num - 1); //função recursiva para calcular os fatoriais

        return somatorio; //retornando o fatorial
    }

    public static int numPermutacoes (int n) {
        double soma = 0.0;

        for (int i = 0; i <= n; i++) {
            soma += Math.pow(-1, i) / calcularFatorial(i);
        }

        soma += calcularFatorial(n) * soma;

        return (int) soma;
    }
}
