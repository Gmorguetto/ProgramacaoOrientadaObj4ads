package ExerciciosLogica.EstruturaDeRepeticao;

public class V {
    public static void main(String[] args) {

        double chico = 1.50;
        double juca = 1.10;
        int anos = 0;

        while (juca <= chico){//enquanto o juca for menor ou igual ao chico roda

            chico += 0.02;
            juca += 0.03;

            anos++;
        }

        System.out.printf("São necessarios %d anos para juca ser maior que o chico\n",anos);
        System.out.printf("Altura chico: %.2f\n", chico);
        System.out.printf("Altura juca: %.2f\n", juca);

    }
}
