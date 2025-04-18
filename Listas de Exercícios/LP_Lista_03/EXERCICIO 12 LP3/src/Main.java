//Exercicio 12

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        double n1, n2, option;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        n1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        n2 = scanner.nextDouble();

        System.out.println("------------------------------\n" +
                "    Menu:\n" +
                "        1. Soma\n" +
                "        2. Subtracao\n" +
                "        3. Multiplicacao\n" +
                "        4. Divisao\n" +
                "    ------------------------------\n" +
                "    Escolha uma opcao: ");

        option = scanner.nextDouble();

        switch((int) option) {
            case 1:
                System.out.println("A soma de " + n1 + " + " + n2 + " É igual a = " + (n1+n2));
                break;
            case 2:
                System.out.println("A subtração de " + n1 + " - " + n2 + " É igual a = " + (n1-n2));
                break;
            case 3:
                System.out.println("A multiplicação de " + n1 + " * " + n2 + " É igual a = " + (n1*n2));
                break;
            case 4:
                System.out.println("A divisão de " + n1 + " / " + n2 + " É igual a = " + (n1/n2));
                break;
            default:
                System.out.println("Valor inválido!");
        }

    }
}