package ExerciciosLogica.EstruturaDeRepeticao;

import java.util.Scanner;

public class IV {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf(".:: MERCADO ::.\n\n");

        int id, idMaior=0;
        double valor, somaValor=0, maiorValor=0;

        for (int i = 1; i <=15; i++){

            System.out.printf("Digite o id do %d° produto: ", i);
            id = input.nextInt();

            System.out.printf("Digite o valor do %d° produto: ", i);
            valor = input.nextDouble();

            somaValor = somaValor + valor;

            if(valor>maiorValor){
                maiorValor = valor;
                idMaior = id;
            }
        }

        double media = somaValor/15;

        System.out.printf("\nO produto com maior valor é o produto %d com o valor de R$ %.2f\n",idMaior,maiorValor);
        System.out.printf("Am média de valor é de R$ %.2f\n",media);

        input.close();
    }
}
