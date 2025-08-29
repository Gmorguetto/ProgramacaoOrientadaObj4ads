package ExerciciosLogica.Vetores;

import java.util.Scanner;

public class III {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[10];
        int verso[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o valor %d: ", i + 1);
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            verso[i] = vetor[9 - i];
        }

        System.out.print("\nVetor original: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" [%d] ", vetor[i]);
        }

        System.out.print("\nVetor invertido: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" [%d] ", verso[i]);
        }

        input.close();
    }
}
