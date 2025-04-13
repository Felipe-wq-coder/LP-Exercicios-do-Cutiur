//Exercicio 9 e 10

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double KM, Miles, KM2, Miles2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua velocidade em kilometros: ");
        KM = scanner.nextDouble();

        System.out.println("Digite sua velocidade em milhas: ");
        Miles2 = scanner.nextDouble();

        Miles = KM / 1.609;
        KM2 = Miles2 * 1.609;

        System.out.println("Sua velocidade em milhas seria de: " + Miles);
        System.out.println("Sua velocidade em Kilometros seria de: " + KM2);
    }
}