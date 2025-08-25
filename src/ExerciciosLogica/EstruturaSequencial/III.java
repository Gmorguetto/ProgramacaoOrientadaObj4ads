package ExerciciosLogica.EstruturaSequencial;

import java.util.Scanner;

public class III {
    public static void main(String[] args) {
        System.out.printf(".:: CALCULANDO O PREÇO DO CARRO ::.\n\n");

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o valor do carro:");
        double valorCarro = input.nextDouble();

        double valorFinal = valorCarro + (valorCarro * 0.28) + (valorCarro * 0.45);

        System.out.printf("\nO valor final do carro é : R$ %.2f\n", valorFinal);
    }
}
