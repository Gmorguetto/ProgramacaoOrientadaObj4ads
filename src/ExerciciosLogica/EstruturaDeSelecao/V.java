// GABRIEL PAULINO MORGUETTO 26/08/2025

//5.	Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das seguintes categorias:
//        infantil A = 5 - 7 anos
//        infantil B = 8-10 anos
//        juvenil A = 11-13 anos
//        juvenil B = 14-17 anos
//        adulto = maiores de 18 anos

        package ExerciciosLogica.EstruturaDeSelecao;

import java.util.Scanner;

public class V {
    public static void main(String[] args) {
        System.out.printf(".:: CLASSIFICAÇÃO NADADOR ::.\n\n");

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a idade do nadador(a): ");
        int idade = input.nextInt();

        if(idade >= 5 && idade <= 7) {
            System.out.printf("\nA categoria do nadador(a) é: INFANTIL A");
        }else if(idade >= 8 && idade <= 10) {
            System.out.printf("\nA categoria do nadador(a) é: INFANTIL B");
        }else if(idade >= 11 && idade <= 13) {
            System.out.printf("\nA categoria do nadador(a) é: JUVENIL A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.printf("\nA categoria do nadador(a) é: JUVENIL B");
        }else if (idade >= 18) {
            System.out.printf("\nA categoria do nadador(a) é: ADULTO");
        }else{
            System.out.printf("\nO participante não tem idade para o sport");

            input.close();

        }
    }
}
