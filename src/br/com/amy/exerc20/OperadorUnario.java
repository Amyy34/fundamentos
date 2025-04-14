package br.com.amy.exerc20;

public class OperadorUnario {
    public static void main(String[] args) {
        var x = 1;
        x++; //Pós-fixada
        System.out.println(x);
        x--; //Pós-fixada
        System.out.println(x);

        ++x; //Pré-fixada
        System.out.println(x);
        --x; //Pré-fixada
        System.out.println(x);

        int y = 1, z = 2;
        System.out.println(++y + z++);
        System.out.println(y + z);
    }
}
