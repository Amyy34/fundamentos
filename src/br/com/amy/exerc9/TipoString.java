package br.com.amy.exerc9;

public class TipoString {
    public static void main(String[] args) {
        String originalText = "Sou original".concat("!!!"); // concatenar

        System.out.println(originalText);

        System.out.println("A frase contida em originalText começa com original? " + originalText.startsWith("original")); // Começa com:

        System.out.println("A frase contida em originalText começa com sou? " + originalText.toLowerCase().startsWith("sou")); //começa com

        System.out.println("A frase contida em originalText tem o tamanho: " + originalText.length()); // tamanho

        System.out.println("originalText está vazio?: " +originalText.isEmpty()); // É vazio?

        System.out.println("A frase contida em originalText termina com original? " +originalText.endsWith("original")); //Termina com:

        var novaString = "Sou original!!!";

        System.out.println("A frase contida em originalText é igual a frase contida em novaString? " +originalText.equals(novaString)); // é igual

        System.out.println("A frase contida em originalText contém '!' ? " +originalText.contains("!")); // Contém

        System.out.println("Qual o index da palavra 'sou' dentro da frase contida em originalText? " +originalText.indexOf("Sou")); // index do valor

        System.out.println("Essa são os respectivos valores contidos no index de intevalo de 0 à 3 (sem incluir o 3): " +originalText.substring(0,3)); //substring

        System.out.println("A frase contida em originalText concatenada com a frase 'Deu pra notar!: " +originalText.concat(" Deu pra notar!")); // concatenar

        String nomeCarro = "Ferrari";
        var ano = 2020;
        var valor = 500_000.00;

        System.out.printf("nome do carro: %s;\nAno do carro: %d;\nvalor do carro: %.2f.",nomeCarro, ano, valor ); // printf(formatação)



    }
}
