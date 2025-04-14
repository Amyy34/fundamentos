package br.com.amy.estruturasdecontrole.exerc26;

import javax.swing.*;

public class StructIfElseIf {
    public static void main(String[] args) {
        var senha = JOptionPane.showInputDialog("DIGITE A SENHA:");

        if ("REDWOMAN".equals(senha)) {
            System.out.println("SENHA CONFIRMADA!");
        } else if (new StringBuilder("REDWOMAN").reverse().toString().equals(senha)) {
            System.out.println("AVISO DE INTRUSO MEDIANTE AMEAÇA DETECTADO!");
        } else {
            System.out.println("SENHA INCORRETA");
        }
    }
}
