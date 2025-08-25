package ExerciciosLogica.EstruturaSequencial;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {

//      para funcionar o scanner
        Scanner input = new Scanner(System.in);
//      declaração
        int numero;

//        Para digitar um numero e ler um numero
        System.out.print("Digite um numero: ");
        numero = input.nextInt();

        System.out.printf("\n.:: O número digitado foi: %d::.\n\n", numero);
        System.out.printf("O antecessor do numero %d é: %d\n", numero, numero-1);
        System.out.printf("O sucessor do numero %d é %d\n", numero, numero+1);


    }
}
