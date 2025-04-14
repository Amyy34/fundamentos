package br.com.amy.exerc16;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        var soma = 12 + 12;
        System.out.println("A soma de 12 + 12 é: " + soma);

        var subtracao = 26 - 15;
        System.out.println("A subtração entre 26 e 15 é: " + subtracao);

        var multiplicacao = 35 * 4;
        System.out.println("A multiplicação 35 * 4 traz o resultado : " + multiplicacao);

        var divisao = 65 / 5;
        System.out.println("A divisão 65/5 é igual a: " + divisao);

        var divisaoPorInteiros = 8/(double)3;
        System.out.println("O valor exato de 8/3 é : " + divisaoPorInteiros);

        var restoDivisao = 65 % 5;
        System.out.println("O resto da divisão entre 65 e 5 é: " + restoDivisao);
    }
}
