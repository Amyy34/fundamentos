package br.com.amy.exerc22;

public class IgualdadeEntreStrings {
    public static void main(String[] args) {
        System.out.println("olá" == "olá");

        var x = "olá";
        var y = new String("olá");
        System.out.println(x == y);
        System.out.println(x.equalsIgnoreCase(y));
    }
}
