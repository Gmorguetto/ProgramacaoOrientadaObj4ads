package a19_08;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(".:: CALCULANDO SUA IDADE ::.");
        int ano;
          Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano que voce nasceu: ");
        ano = input.nextInt();
        int idade = 2025 - ano;
        System.out.printf("Voce tem %d anos",idade);




    }
}
