//Exercicio 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valor de N:");
        N = scanner.nextInt();

        if (N <= 0) {
            throw new IllegalArgumentException("N deve ser maior que 0");
        }

        int soma = 0;
        for (int i = 1; i <= N; i++) {
            soma += i;
        }

        System.out.println("A soma de 1 até " + N + " é: " + soma);
    }
}
