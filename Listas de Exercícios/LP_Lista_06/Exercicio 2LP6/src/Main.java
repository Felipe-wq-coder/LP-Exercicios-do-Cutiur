//Exercicio 2

import java.util.Scanner;

public class Main {

    public static long calcularFatorial(int N) {
        if (N < 0) {
            throw new IllegalArgumentException("N deve ser um número não-negativo");
        }

        long fatorial = 1;
        for (int i = 1; i <= N; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para calcular o fatorial:");
        int N = scanner.nextInt();

        long resultado = calcularFatorial(N);
        System.out.println("O fatorial de " + N + " é: " + resultado);

        scanner.close();
    }
}
