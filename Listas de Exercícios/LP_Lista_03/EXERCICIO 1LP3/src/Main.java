//Exercicio 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, raiz;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de um numero: ");
        number = scanner.nextDouble();

        raiz = Math.sqrt(number);

        if (number >0)
            System.out.println("a raiz quadrada desse numero é: " + raiz);
        else System.out.println("Valor invalido!");





    }
}