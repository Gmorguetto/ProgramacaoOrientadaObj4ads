package ExerciciosLogica.Vetores;

import java.util.Scanner;

public class IV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o valor %d: ", i + 1);
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i += 2) {
            if (vetor[i] > 0) {
                soma += vetor[i];
            }
        }

        System.out.println("\nA soma dos elementos positivos nas posições pares é: " + soma);

        input.close();
    }
}
