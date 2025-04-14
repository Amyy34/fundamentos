package br.com.amy.estruturasdecontrole.exerc31;

public class StructBreakContinue {
    public static void main(String[] args) {
        System.out.println("Fluxo no Break");

        for (var i = 0; i < 10; i++) {
            if (i == 5) break;
            System.out.println("O valor de i é:" + i);
        }

        for(var i = 0; i < 10; i++) {
            if (i == 5) continue;
            System.out.println("O valor de i é:" + i);
        }
    }
}
