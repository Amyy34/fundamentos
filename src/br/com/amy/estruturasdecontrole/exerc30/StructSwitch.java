package br.com.amy.estruturasdecontrole.exerc30;

import java.util.Scanner;

public class StructSwitch {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Status atual: ");

        switch (teclado.nextLine().toUpperCase()) {
            case "NORMAL":
                System.out.println("DE 1 A 10 SENTINELAS FORAM AVISTADAS");
                break;
            case "MODERADO":
                System.out.println("DE 10 A 30 SENTINELAS FORAM AVISTADAS");
                break;
            case "MODERADO-ALTO":
                System.out.println("DE 30 A 60 SENTINELAS FORAM AVISTADAS");
                break;
            case "ALTO":
                System.out.println("DE 60 A 100 SENTINELAS FORAM AVISTADAS");
                break;
            default:
                System.out.println(" VALOR NÃO RECONHECIDO");
        }
        teclado.close();
    }
}
