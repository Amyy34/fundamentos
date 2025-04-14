package br.com.amy.estruturasdecontrole.exerc29;

import java.util.Scanner;

public class StructDoWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        var codigoDeAcesso = "";


        do {
            System.out.println("DIGITE O CÓDIGO DE ACESSO: ");
            codigoDeAcesso = teclado.nextLine().trim();

            if (codigoDeAcesso.isBlank()) {
                System.out.println("O CÓDIGO NÃO PODE SER EM BRANCO");
            }
        } while (codigoDeAcesso.isBlank());

        System.out.println("CÓDIGO CONFIRMADO!");
        teclado.close();
    }
}
