//Exercicio 5

public class Main {
    public static void main(String[] args) {
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] v2 = new int[v1.length];

        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[v1.length - 1 - i];
        }

        System.out.println("(original)   (invertido)");
        for (int i = 0; i < v1.length; i++) {
            System.out.printf("%d\t\t     %d\n", v1[i], v2[i]);
        }
    }
}

