package ListaFinal.Q4;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int qtd) {
        System.out.println(qtd + " Números Primos:");

        int j =0;

        for (int i = 2; j < qtd; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + " ");
                j++;
            }
        }
        System.out.println();
    }
}
