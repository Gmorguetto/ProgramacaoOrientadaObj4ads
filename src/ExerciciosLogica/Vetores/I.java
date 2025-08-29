package ExerciciosLogica.Vetores;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite %d° numero: ", i + 1);
            vetor[i] = input.nextInt();
        }

        for (int j = 0; j < 10; j++) {

            if(vetor[j]%2==1){
                System.out.printf("[ %d ]", vetor[j]);
            }
        }
        input.close();
    }
}
