package a02_09;

import javax.swing.*;

public class Cliente {

//    Atributos
    String nome;
    int idade;
    double saldo;

//    Métodos
    public void cadastrar(){
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu saldo: "));
    }

    public void exibir(){
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n" +
                "Idade: "+idade+"\n" +
                "Saldo: "+saldo);
    }
}
