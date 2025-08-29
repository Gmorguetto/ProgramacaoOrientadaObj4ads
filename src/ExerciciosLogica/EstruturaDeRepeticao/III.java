package ExerciciosLogica.EstruturaDeRepeticao;

import java.util.Scanner;

public class III {
    public static void main(String[] args) {
        System.out.printf(".:: CALCULANDO 2 VALOR ::.\n\n");
//  leitura
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o valor 1:");
        int valor1 = input.nextInt();

        System.out.printf("Digite o valor 2:");
        int valor2 = input.nextInt();

        for (int i = valor1; i <= valor2; i++) {
            System.out.printf("[ %d ] ", i);
        }

        input.close();

    }
}
