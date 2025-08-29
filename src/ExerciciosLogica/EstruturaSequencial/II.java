// GABRIEL PAULINO MORGUETTO 25/08/2025

//2.	Ler uma medida em polegadas e imprimir a equivalente em centímetros, sabendo que 2.54 cm equivale a 1 polegada.

package ExerciciosLogica.EstruturaSequencial;

import java.util.Scanner;

public class II {
    public static void main(String[] args) {
        System.out.printf(".:: CALCULANDO POLEGADAS EM CM ::.\n");
//      leitura
        Scanner input = new Scanner(System.in);

        double polegada, cm;

        System.out.printf("Digite o valor em polegada: ");
        polegada = input.nextDouble();

        cm = polegada * 2.54;

        System.out.printf("\nO valor em cm é: %.2f\n", cm);

        input.close();

    }
}
