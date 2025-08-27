package a26_08;

public class vetor {
    public static void main(String[] args) {

//        criar vetor
        int vetor[] = new int[10];

//        for para preencher todas as posiçoes
        for (int i=0; i<5; i++){
            vetor[i]=i+1;//só para nao começar com zero
        }

        for (int i=0; i<5; i++){
            System.out.printf("Valor %d\n", vetor[i]);//exibir todo o vetor
        }
    }
}
