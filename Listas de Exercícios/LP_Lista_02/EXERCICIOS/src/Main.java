//Exercio 1 ao 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numero;
        System.out.println("Digite um numero: ");
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextDouble();

        double dobro = numero * 2;
        double quadrado = numero * numero;
        double QuintaParte = numero / 5;

        System.out.println("O dobro deste numero é = " + dobro);
        System.out.println("Este numero ao quadrado é = " + quadrado);
        System.out.println("A quinta parte deste numero é = " + QuintaParte);

    }
}