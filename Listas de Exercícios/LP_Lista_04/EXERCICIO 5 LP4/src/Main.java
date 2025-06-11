//Exercicio 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        numero = scanner.nextInt();

        long fatorial = 1;


        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numero + " é: " + fatorial);
    }
}