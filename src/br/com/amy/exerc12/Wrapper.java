package br.com.amy.exerc12;

public class Wrapper {
    public static void main(String[] args) {

        Byte b = 100;
        Short s = Short.valueOf(b);
        Integer i = Integer.parseInt("2500"); // Transformando integer em String
        Long l = 10_000_000L;
        Float f = 1234.67F;
        Double d = 12345678.67686;
        Character c = 'C';
        Boolean b1 = false;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b1);
    }
}
