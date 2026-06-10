package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;

import javax.swing.*;

public class TesteSistema {

    // String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // int
    static int inteiro(String j){
        return Integer.parseInt( JOptionPane.showInputDialog(j) );
    }

    // double
    static double real(String j){
        return Double.parseDouble( JOptionPane.showInputDialog(j) );
    }

    public static void main( String[] args) {

        //String nome, int qtdDeHoras, double valorHora, double salario

        Colaborador objColaborador = new Colaborador(
          texto("Nome"),
          inteiro("Quanridade de Horas Trabalhadas"),
          real("Valor Hora"),
          real("Salario")
        );


        System.out.println(

                objColaborador

        );


    }


}

