//Exercicio 2

public class Main {
    public static void main(String[] args) {
        int[] vetor = {10,20,30,40,50,60,70,80,90,100};

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] += 2;
            } else {
                vetor[i] *= 2;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("indice " + i + ": " + vetor[i]);
        }
    }
}
