package br.com.amy.exerc14;

import java.util.Scanner;

public class NumeroParaString {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Integer a = 10;

        System.out.println(a.toString());

        System.out.println(a.toString().length());
        System.out.println(Integer.toString(20000));

        System.out.println("Digite o primeiro número: ");
        var primeiroNumero = teclado.nextLine();

        System.out.println("Digite o segundo número: ");
        var segundoNumero = teclado.nextLine();

        var somaNumeros = Double.parseDouble(primeiroNumero)+Double.parseDouble(segundoNumero);

        System.out.println("A soma dos números é: " + somaNumeros);
        System.out.println("A média dos números é: " + somaNumeros/2);
    }
}
