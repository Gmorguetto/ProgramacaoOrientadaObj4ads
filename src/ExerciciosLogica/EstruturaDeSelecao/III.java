// GABRIEL PAULINO MORGUETTO 26/08/2025

//3.	Uma loja fornece 10% de desconto para funcionários e 5% de desconto para clientes vips. Faça um programa que calcule o valor total a ser pago por uma pessoa.
//        O programa deverá ler o valor total da compra efetuada e um código que identifique se o comprador é um cliente comum (1), funcionário (2) ou vip (3).

package ExerciciosLogica.EstruturaDeSelecao;

import java.util.Scanner;

public class III {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        menu
        System.out.printf(".:: MENU IDENTIFICAÇÃO DO CLIENTE ::.\n\n");
        System.out.printf("[ 1 ] CLIENTE COMUM\n");
        System.out.printf("[ 2 ] FUNCIONARIO\n");
        System.out.printf("[ 3 ] V.I.P\n");

        System.out.printf("\nDigite a opcao: ");
        int opcao = input.nextInt();

        System.out.printf("\nDigite o valor do produto: ");
        double valor = input.nextDouble();

//        Lógica

        double valorFinal;

        switch (opcao) {
            case 1:
                System.out.printf("\nO valor final do produto: R$ %.2f\n", valor);
                break;

            case 2:
                valorFinal = valor - (valor * 0.1);
                System.out.printf("\nO valor final do produto com 10porcento de desconto: R$ %.2f\n", valorFinal);
                break;

            case 3:
                valorFinal = valor - (valor * 0.05);
                System.out.printf("\nO valor final do produto com 5porcento de desconto: R$ %.2f\n", valorFinal);
                break;

            default:
                System.out.println("\nOpcao invalida");

        }
    }
}
