package br.com.amy.estruturasdecontrole.exerc24;

import java.util.Scanner;

public class StructIf {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("QUE PÍLULA VOCÊ ESCOLHE?");
        var pilula = teclado.nextLine();

        if ("AZUL".equalsIgnoreCase(pilula)){
            System.out.println("Ok, FOI BOM FALAR COM VOCÊ, BONS SONHOS");
        }

        if ("VERMELHA".equalsIgnoreCase(pilula)){
            System.out.println("VOCÊ TOMOU A DECISÃO CERTA, HORA DE ACORDAR!");
        }
        teclado.close();
    }
}
