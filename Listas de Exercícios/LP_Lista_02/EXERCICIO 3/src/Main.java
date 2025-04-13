//Exercicio 5 e 6

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double KMH1, MS1, KMH2, MS2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua velocidade em KM por hora: ");
        KMH1 = scanner.nextDouble();

        System.out.println("Digite sua velocidade em Metros por segundo: ");
        MS2 = scanner.nextDouble();

        MS1 = KMH1 / 3.6;
        KMH2 = MS2 * 3.6;

        System.out.println("sua velocidade de KMH em metros por segundo é =  " + MS1);
        System.out.println("Esta velocidade em metros por segundo em KMH =  " + KMH2);

    }
}