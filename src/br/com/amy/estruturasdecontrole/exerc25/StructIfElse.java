package br.com.amy.estruturasdecontrole.exerc25;

import javax.swing.*;

public class StructIfElse {
    public static void main(String[] args) {
        var valor = JOptionPane.showInputDialog("INFORME A SENHA:");

        if ("REDWOMAN".equals(valor)) {
            System.out.println("SENHA CONFIRMADA!");
        } else {
            System.out.println("SENHA INCORRETA");
        }
    }
}
