package br.com.amy.desafiofinal;

import java.util.Scanner;


public class ChurrascoCalculator {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n========= MENU CHURRASCO =========");
            System.out.println("0 ==> PARA FINALIZAR\n1 ==> PARA INFORMAR O NÚMERO DE ADULTOS E CRIANÇAS\n2 ==> PARA INFORMAR O NÚMERO DE PESSOAS");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 0:
                    System.out.print("\nATÉ LOGO :)");
                    break;
                case 1:
                    ChurrascoCalculator.calcularQtd(teclado);
                    break;
                case 2:
                    System.out.print("Digite o número de pessoas: ");
                    var pessoas = teclado.nextInt();

                    var carne = pessoas * 300.0;
                    var linguica = pessoas * 300.0;
                    var bebida = pessoas * 600.0;

                    System.out.println("\nCÁLCULO FINALIZADO...");
                    System.out.printf("PARA ALIMENTAR %d PESSOAS SERÃO NECESSÁRIOS:\n", pessoas);
                    System.out.printf("%.2f GRAMAS DE CARNE, %.2f GRAMAS DE LINGUIÇA E %.2f ML DE BEBIDA.\n", carne, linguica, bebida);
                    break;

                default:
                    System.out.println("Opção inválida, por favor selecione uma das opções válidas do menu\n");

            }
        } while (opcao != 0);

        teclado.close();
    }

    public static void calcularQtd(Scanner teclado) {

        System.out.print("Digite a quantidade de adultos: ");
        var adultos = teclado.nextInt();
        System.out.print("Digite a quantidade de crianças: ");
        var criancas = teclado.nextInt();

        var carne = adultos * 300.0 + criancas * 250;
        var linguica = adultos * 300.0 + criancas * 250;
        var bebida = adultos * 600.0 + criancas * 550;

        System.out.println("\nCÁLCULO FINALIZADO...");
        System.out.printf("PARA ALIMENTAR %d ADULTOS E %d CRIANÇAS SERÃO NECESSÁRIOS:\n", adultos, criancas);
        System.out.printf("%.2f GRAMAS DE CARNE, %.2f GRAMAS DE LINGUIÇA E %.2f ML DE BEBIDA.\n", carne, linguica, bebida);
    }
}