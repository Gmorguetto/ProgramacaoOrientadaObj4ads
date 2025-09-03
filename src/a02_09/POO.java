package a02_09;
// classe é um conjunto
//quando tem 1 elemento é um objeto

import java.util.Scanner;

public class POO {
    public void calcular(int a, int b){
        System.out.printf("O valor da soma é %d",(a+b));
    }
    public static void main(String[] args) {

        System.out.printf(".:: CALCULADORA ::.\n\n");
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o 1° numero: ");
        int x = input.nextInt();

        System.out.printf("Digite o 2° numero: ");
        int y = input.nextInt();



        POO obj = new POO(); //cria objeto
        obj.calcular(x,y); //executa
    }
}
