//Exercicio 7 e 8

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mm, inch, mm2, inch2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua medida em Milimetros: ");
        mm = scanner.nextDouble();

        System.out.println("Digite sua medida em Polegadas: ");
        inch2 = scanner.nextDouble();

        inch = mm / 25.5;
        mm2= mm * 25.5;

        System.out.println("Sua medida de milimetros em polegadas é = " + inch);
        System.out.println("Sua medida de polegadas em milimetros é = " + mm2);

    }
}