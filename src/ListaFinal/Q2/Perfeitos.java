package ListaFinal.Q2;

public class Perfeitos {
    public static boolean perfeitos(int numero){

       int somatorioDivisores = 0;

           for (int i = 1; i <= numero ; i++) {
               if (numero % i == 0) {
                      somatorioDivisores += i;
               }
           }

           return somatorioDivisores == 2 * numero;
       }
    }

