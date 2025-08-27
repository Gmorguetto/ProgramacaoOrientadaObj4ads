package ExerciciosLogica.EstruturaDeRepeticao;

import java.util.Scanner;

public class VI {
    public static void main(String[] args) {
        System.out.printf(".:: CALCULANDO FATORIAL ::.\n\n");

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um numero inteiro: ");
        double numero = input.nextDouble();

        double fatorial = 1;

        if (numero == 0){
            System.out.printf("\nTotal = 1");

        }else{
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.printf("\nFatorial = %.0f\n", fatorial);
        }
    }
}
