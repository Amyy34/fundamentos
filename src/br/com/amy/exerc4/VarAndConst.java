package br.com.amy.exerc4;

public class VarAndConst {
    public static void main(String[] args) {
        String textBase = "HOJE O DIA ESTÁ: ";
        final String bom = "BOM.";
        final String regular = "REGULAR.";
        final String ruim = "RUIM.";

        System.out.println(textBase + bom);
        System.out.println(textBase + regular);
        System.out.println(textBase + ruim);

        textBase = "PARA MIM HOJE O DIA ESTÁ: ";

        System.out.println(textBase + bom);
        System.out.println(textBase + regular);
        System.out.println(textBase + ruim);
    }
}
