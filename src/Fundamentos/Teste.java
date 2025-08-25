package Fundamentos;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double F, C;
        final double x = 32.0;
        final double y = 5.0/9.0;

        System.out.printf("\n.:: CALCULANDO TEMPERATURA ::.\n");
        System.out.println("Digite o valor da temperatura (F°): ");
        F = input.nextDouble();

        C = (F - x) * y;

        System.out.printf("\n %.2f° Fahrenheit é equivalente a %.2f° Celsius\n", F, C);
    }

}
