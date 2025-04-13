//Exercicio 4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double score1, score2, mean;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        score1 = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        score2 = scanner.nextDouble();

        mean = (score1 + score2) / 2;

        System.out.println("A media das notas é = " + mean);
    }
}