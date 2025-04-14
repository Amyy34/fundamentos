package br.com.amy.exerc10;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Na mesma");
        System.out.print(" linha\n");

        System.out.print("Em outra\n");
        System.out.print("linha\n");

        System.out.println("Na mesma linha");


        System.out.printf("Minha idade é: %d Anos!\n", 19);

        System.out.print("Qual é seu nome?: ");
        var nome = teclado.nextLine();
        System.out.print("Qual a sua sobremesa prefrida?: ");
        var sobremesa = teclado.nextLine();
        System.out.print("Qual é a sua idade?: ");
        var idade = teclado.nextInt();

        System.out.printf("ENTENDI, SEU NOME É: %s, VOCÊ TEM %d ANOS E SUA SOBREMESA PREFERIDA É: %s", nome, idade, sobremesa);

        teclado.close();
    }
}
