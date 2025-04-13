//Exercicio 6

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value;

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Menu:\n" +
                        "5 - Consultar saldo\n" +
                        "6 - Sacar dinheiro\n" +
                        "7 - Depositar dinheiro\n" +
                        "8 - Pagar contas\n" +
                        "9 - Sair\n" +
                        "Escolha uma opção (5 a 9): "
        );
        value = scanner.nextInt();

        if (value >=5 && value <=9)
            System.out.println("Você escolheu a opção: " + value);
        else System.out.println("Opção invalida!");

    }
}