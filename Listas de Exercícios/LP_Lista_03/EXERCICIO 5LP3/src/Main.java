// Exercicio 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua média de notas: ");
        score = scanner.nextDouble();

        if (score >= 8.5)
            System.out.println("Seu rank foi A");
        else if (score >= 7)
            System.out.println("Seu rank foi B");
        else if (score >= 5)
            System.out.println("Seu rank foi C");
        else System.out.println("Seu rank foi D");

    }
}