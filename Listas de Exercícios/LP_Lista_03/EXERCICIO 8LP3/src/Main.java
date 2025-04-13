//Exercicio 8

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("O numero " + number + " é par.");
        } else System.out.println("O numero " + number + " é impar.");

    }
}