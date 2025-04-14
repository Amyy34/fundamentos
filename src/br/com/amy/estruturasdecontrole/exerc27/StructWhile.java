package br.com.amy.estruturasdecontrole.exerc27;

import java.util.Scanner;

public class StructWhile {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE O CÓDIGO DE ACESSO: ");

        while (teclado.nextLine().isBlank()){
            System.out.println("O CÓDIGO NÃO PODE SER EM BRANCO");
        }
        System.out.println("CÓDIGO CONFIRMADO!");
        teclado.close();
    }
}
