package ExerciciosLogica.Vetores;

import java.util.Scanner;

public class II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double vetor[] = new double[6];
        double soma = 0, maior, menor;

        System.out.print("Digite o valor 1: ");
        vetor[0] = input.nextDouble();

        soma = vetor[0];
        maior = vetor[0];
        menor = vetor[0];

        for (int i = 1; i < 6; i++) {
            System.out.printf("Digite o valor %d: ", i + 1);
            vetor[i] = input.nextDouble();

            soma += vetor[i];

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        double media = soma / 6;

        System.out.printf("\nA média dos números é: %.2f\n", media);
        System.out.printf("Maior número: %.2f\n", maior);
        System.out.printf("Menor número: %.2f\n", menor);

        input.close();
    }
}
