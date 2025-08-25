package a19_08;

import javax.swing.*;

public class NomeIdadeDialog {
    public static void main(String[] args) {

        String nome;
        int idade;

//  EXIBIR MENSAGEM NA TELA
        nome = JOptionPane.showInputDialog("Qual seu nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade"));
        JOptionPane.showMessageDialog(null,"Nome: "+nome + "\nIdade: "+idade);

    }
}
