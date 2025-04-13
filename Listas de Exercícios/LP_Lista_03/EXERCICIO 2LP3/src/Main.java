//Exercicio 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro numero: ");
        number1 = scanner.nextDouble();

        System.out.println("Digite o valor do segundo numero: ");
        number2 = scanner.nextDouble();

        if (number1 > number2)
            System.out.println(number1 + " > " + number2);
        else if (number1 < number2)
            System.out.println(number1 + " < " + number2);
        else System.out.println(number1 + " = "  +  number2);{

        }
    }
}