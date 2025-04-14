package br.com.amy.exerc18;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        // Os relacionais mais ultilizados:
        // ==, >, <, <=, >=, !=

        var valor = 90;
        System.out.println("VALOR É IGUAL A 90?: " + (valor == 90));
        System.out.println("VALOR É MENOR QUE 90?: " + (valor < 90));
        System.out.println("VALOR É MAIOR OU IGUAL A 90?: " + (valor >= 90));
        System.out.println("VALOR É MENOR OU IGUAL A 90?: " + (valor <= 90));
        System.out.println("VALOR É DIFERENTE DE 90: " + (valor != 90));

    }
}
