//Exercicio 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double N1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero, para exibir sua tabuada: ");
        N1 = scanner.nextDouble();

        for (double i = 0; i <= 10; i++) {
            double resultado = N1 * i;
            System.out.println(N1 + " x " + i + " = " + resultado);
        }



    }
}