package br.com.amy.exerc5;

public class Inferencia {
    public static void main(String[] args) {
        var numero1 = 5;
        var numero2 = 5.5;
        var numero3 = 1L;
        var texto1 = "Está aula está muito legal!";
        var texto2 = 'A' ;

        System.out.println(typeOf(numero1));
        System.out.println(typeOf(numero2));
        System.out.println(typeOf(numero3));
        System.out.println(typeOf(texto1));
        System.out.println(typeOf(texto2));

    }

    static String typeOf(Object obj) {
        return obj.getClass().toGenericString();
    }
}
