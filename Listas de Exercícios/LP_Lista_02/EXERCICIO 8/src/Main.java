//Exercicio 18

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      double a, b, x;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        a = scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        b = scanner.nextDouble();



        x = -b / a;


        System.out.println("O valor de x é = " + x);
        System.out.println("O resultado da equação de primeiro grau = " + a + " * " + x + " + " + b + " = 0");




    }
}