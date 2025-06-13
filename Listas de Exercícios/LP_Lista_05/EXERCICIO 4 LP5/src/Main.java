//Exercicio 4
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("\nMaior número: " + maior + " na posição " + posMaior);
        System.out.println("Menor número: " + menor + " na posição " + posMenor);
    }
}
