// GABRIEL PAULINO MORGUETTO 25/08/2025

//3.	O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
//Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

package ExerciciosLogica.EstruturaSequencial;

import java.util.Scanner;

public class III {
    public static void main(String[] args) {
        System.out.printf(".:: CALCULANDO O PREÇO DO CARRO ::.\n\n");
//      leitura
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o valor do carro:");
        double valorCarro = input.nextDouble();

        double valorFinal = valorCarro + (valorCarro * 0.28) + (valorCarro * 0.45);

        System.out.printf("\nO valor final do carro é : R$ %.2f\n", valorFinal);
    }
}
