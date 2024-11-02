package Unidade3;

public class criptografar1Grau {
    public static int func1Grau(int x){
        return (3 * x - 1) ;
    }

    public static int inversa1Grau (int x){
        return ((x +1)/3);
    }

    public static String codificar1Grau (String mensagem){
        StringBuilder codificada = new StringBuilder();

        for (char c: mensagem.toCharArray())
            codificada.append((char)func1Grau(c));

        return codificada.toString();
    }

    public static String decodificar1Grau(String mensagem){

        StringBuilder decodificada = new StringBuilder();

        for (char c: mensagem.toCharArray())
            decodificada.append((char)inversa1Grau(c));

        return decodificada.toString();
    }
}
