package Unidade3;

public class Trabalho3 {

    public static void main(String[] args) {

        String mensagem = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz.,";

        System.out.println("Func 1 Grau: ");
        String Codificada = criptografar1Grau.codificar1Grau(mensagem);
        System.out.println(Codificada);
        String Decodificada = criptografar1Grau.decodificar1Grau(Codificada);
        System.out.println(Decodificada);

        System.out.println("\nFunc 2 Grau: ");
        String Codificada2 = criptografar2Grau.codificar2Grau(mensagem);
        System.out.println(Codificada2);
        String Decodificada2 = criptografar2Grau.decodificar2Grau(Codificada2);
        System.out.println(Decodificada2);

    }
}