package br.com.amy.exerc7;

public class NotacaoPonto {
    public static void main(String[] args) {
        var frase1 = "You take the blue pill, the story ends, you wake up in your bed and believe whatever you want to believe.";
        var frase2 = "You take the red pill, you stay in wonderland, and I show you how deep the rabbit hole goes.";

        System.out.println(frase1.toUpperCase()); // Deixar maiusculo.
        System.out.println(frase2.toLowerCase()); // Deixar Minusculo.
        System.out.println(frase2.charAt(5)); // Imprimir a letra ou caracter da posição de index 5.

        var frase2EmMaiusculo = frase2.toUpperCase();
        System.out.println("Frase 2 em maiusculo: " + frase2EmMaiusculo);

        System.out.println(frase2.replace(",", "<>")); // Trocar um caracter na frase inteira por outro.

        var fraseCompleta = frase1.concat("\n" + frase2); // concatenar dois elementos.
        System.out.println(fraseCompleta);
    }
}
