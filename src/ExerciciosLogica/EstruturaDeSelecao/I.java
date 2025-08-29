// GABRIEL PAULINO MORGUETTO 26/08/2025

//1.	Faça um algoritmo para ler dois números inteiros e informar se estes são iguais ou diferentes.

package ExerciciosLogica.EstruturaDeSelecao;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {

//      leitura
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o 1° numero: ");
        double numero1 = input.nextDouble();

        System.out.printf("Digite o 2° numero: ");
        double numero2 = input.nextDouble();

        if (numero1 == numero2) {
            System.out.printf("\n\nOs numeros %.2f e %.2f são iguais\n",numero1,numero2);
        }else{
            System.out.printf("\n\nOs numeros %.2f e %.2f são diferents\n",numero1,numero2);
        }

        input.close();

    }
}
