package ExerciciosLogica.EstruturaDeSelecao;

import java.util.Scanner;

public class II {
    public static void main(String[] args) {
        System.out.printf(".:: COMPRANDO MAÇA ::.\n");

//      leitura
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o numero de maças comprada: ");
        int macasCompradas = input.nextInt();

        if (macasCompradas < 12) {
            double valorFinal = (macasCompradas * 1.3);
            System.out.printf("\nO valor para %d maças é de R$ 1.30.\nTotal = R$ %.2f\n", macasCompradas, valorFinal);
        } else {
            double valorFinal = (macasCompradas * 1);
            System.out.printf("\nO valor para %d maças é de R$ 1.00.\nTotal = R$ %.2f\n", macasCompradas, valorFinal);
        }
    }
}
