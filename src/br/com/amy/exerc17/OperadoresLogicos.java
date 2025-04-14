package br.com.amy.exerc17;

public class OperadoresLogicos {
    public static void main(String[] args) {

        //Os operadores lógicos são conhecidos como:
        // && = and , || = or , ^ = or exclusivo ou também conhecido como XOR, ! = Not

        var morpheusFoiCapturado = true;
        var trinityFoiCapturada = false;
        var oculos1 = "COLORIDOS";
        var oculos2 = "PRETOS";
        var capa1 = "normal";
        var capa2 = "preta";
        var calcado1 = "tênis";
        var calcado2 = "coturno";
        var parceiro1 = "Morpheus";
        var parceiro2 = "Trinity";
        var acessorios1 = "guarda-chuva";
        var acessorios2 = "guns, a lot of guns";

        System.out.println("TODOS NÃO VOLTARAM A SALVO?: " + (morpheusFoiCapturado && trinityFoiCapturada));
        System.out.println("MORPHEUS OU TRINITY FOI CAPTURADO(A)? : " + (morpheusFoiCapturado || trinityFoiCapturada) );

        var buscaPerfeita1 = "PRETOS".equalsIgnoreCase(oculos1)
                && "PRETA".equalsIgnoreCase(capa1)
                && "COTURNO".equalsIgnoreCase(calcado1)
                && "TRINITY".equalsIgnoreCase(parceiro1)
                && "GUNS, A LOT OF GUNS".equalsIgnoreCase(acessorios1);


        var buscaPerfeita2 = "PRETOS".equalsIgnoreCase(oculos2)
                && "PRETA".equalsIgnoreCase(capa2)
                && "COTURNO".equalsIgnoreCase(calcado2)
                && "TRINITY".equalsIgnoreCase(parceiro2)
                && "GUNS, A LOT OF GUNS".equalsIgnoreCase(acessorios2);

        System.out.println("A BUSCA 1 ENCONTROU O QUE PRECISO?: " + buscaPerfeita1);
        System.out.println("A BUSCA 2 ENCONTROU O QUE PRECISO?: " + buscaPerfeita2);

    }
}
