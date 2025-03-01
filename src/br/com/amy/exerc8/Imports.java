package br.com.amy.exerc8;

import java.util.Random;
import java.util.UUID;

public class Imports {
    public static void main(String[] args) {
        var doubleRandom = Math.random();
        var nome = "fulano";
        var inteiroRandom = new Random().nextInt(10);
        var idUsuario = UUID.randomUUID(); // criar um Id único para cada usuário.

        System.out.println(idUsuario);

        System.out.println(doubleRandom);
        System.out.println(nome);
        System.out.println(inteiroRandom);
    }
}
