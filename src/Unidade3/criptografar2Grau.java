package Unidade3;

public class criptografar2Grau {
    public static int func2Grau (int x){
        return (int) (Math.pow(x,2) + 2 * x + 2) ;
    }

    public static int inversa2Grau (int x){
        return (int) ((-2 + Math.sqrt(4 * (x - 1))) /2);
    }

    public static String codificar2Grau (String mensagem){
        StringBuilder codificada = new StringBuilder();

        for (char c: mensagem.toCharArray())
            codificada.append((char)func2Grau(c));

        return codificada.toString();
    }

    public static String decodificar2Grau (String mensagem){

        StringBuilder decodificada = new StringBuilder();

        for (char c: mensagem.toCharArray())
            decodificada.append((char)inversa2Grau(c));

        return decodificada.toString();
    }
}
