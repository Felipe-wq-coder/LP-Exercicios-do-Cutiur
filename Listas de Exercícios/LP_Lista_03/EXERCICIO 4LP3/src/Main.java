//Exercicio 4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double score1, score2, mean, recovery;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        score1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        score2 = scanner.nextDouble();

        mean = (score1 + score2) / 2;

        System.out.println("Sua media foi: " + mean);

        if (mean >= 50) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Digite sua nota de recuperação: ");
            recovery = scanner.nextDouble();

            if ((mean + recovery) / 2 >= 50) {
                System.out.println("Você foi aprovado!");
            } else System.out.println("Você foi reprovado!");


        }
    }
}