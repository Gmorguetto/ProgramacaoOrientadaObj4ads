package ExerciciosLogica.EstruturaDeRepeticao;

public class II {
    public static void main(String[] args) {
        System.out.printf(".:: TODOS OS PARES DE 1 A 38 ::. \n\n");
//
        for (int i = 1; i <= 38; i++) {
            if (i % 2 == 0){//se o resto de 2 der zero par
                System.out.printf("[ %d ] ",i);
            }
        }
    }
}
