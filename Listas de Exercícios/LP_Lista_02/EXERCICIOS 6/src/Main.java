//Exercicio 11

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Celsius, Fahrenheit;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua temperatura em graus Celsius: ");
        Celsius = scanner.nextDouble();

        Fahrenheit = (Celsius * 9/5) + 32;

        System.out.println("Sua temperatura em Fahrenheit é: " + Fahrenheit);

    }
}