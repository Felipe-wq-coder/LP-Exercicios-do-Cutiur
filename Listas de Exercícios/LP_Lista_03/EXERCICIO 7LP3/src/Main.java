//Exercicio 7 (não entendi usei chatgpt)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.println("=== Equação do Segundo Grau: ax² + bx + c = 0 ===");
        System.out.print("Digite o valor de a: ");
        a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Isso não é uma equação do segundo grau (a não pode ser zero).");
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                if (delta == 0) {
                    System.out.println("A equação possui uma raiz real: x = " + x1);
                } else {
                    System.out.println("A equação possui duas raízes reais:");
                    System.out.println("x₁ = " + x1);
                    System.out.println("x₂ = " + x2);
                }
            }
        }

        scanner.close();
    }
}
