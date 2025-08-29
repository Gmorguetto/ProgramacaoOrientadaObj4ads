package ExerciciosLogica.EstruturaDeSelecao;

import java.util.Scanner;

public class VI {
    public static void main(String[] args) {
        System.out.printf(".:: CALCULANDO O COMBUSTIVEL ::.\n\n");
//      leitura
        Scanner input = new Scanner(System.in);
        System.out.printf(".:: QUAL SEU COMBUSTIVEL? ::.\n");
        System.out.printf("[ 1 ] ALCOOL\n");
        System.out.printf("[ 2 ] GASOLINA");

        System.out.printf("\nQual é a opção: ");
        int opcao = input.nextInt();

        System.out.printf("\nDigite a quantidade de combustivel: ");
        double combustivel = input.nextDouble();

        double valorFinal;
        switch (opcao){
            case 1:
                valorFinal = combustivel * 2.9;
                System.out.printf("\nO valor a ser pago por %.2f litros de alcool é de R$ %.2f\n",combustivel,valorFinal);
                break;

            case 2:
                valorFinal = combustivel * 2.3;
                System.out.printf("\nO valor a ser pago por %.2f litros de gasolina é de  R$ %.2f\n",combustivel,valorFinal);
                break;

            default:
                System.out.printf("\nOPCAO INVALIDA\n");
        }
        input.close();

    }
}
