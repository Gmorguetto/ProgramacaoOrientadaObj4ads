// GABRIEL PAULINO MORGUETTO 26/08/2025

//4.	Ler as notas da 1a. e 2a. avaliações de um aluno.
//        Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado).
//        Escrever também a média calculada.

package ExerciciosLogica.EstruturaDeSelecao;

import java.util.Scanner;

public class IV {
    public static void main(String[] args) {
        System.out.printf(".:: CALCULANDO MÉDIA ::.\n\n");

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a nota 1a: ");
        double nota1 = input.nextDouble();

        System.out.printf("Digite a nota 2a: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.printf("\nA media do aluno é: %.2f\n", media);
            System.out.printf("APROVADO");
        }else{
            System.out.printf("\nA media do aluno é: %.2f\n", media);
            System.out.printf("\nREPROVADO");

            input.close();

        }
    }
}
