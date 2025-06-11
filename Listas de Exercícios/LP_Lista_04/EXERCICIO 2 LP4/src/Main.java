//Exercicio 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "numero: ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }


        System.out.println("Maior numero digitado: " + maior);
        System.out.println("Menor numero digitado: " + menor);


    }
}