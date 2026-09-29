package app;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Matriz3x3 {

    public static void main(String[] args) {
        final int TAM = 3; // final transforma uma variáel em uma constante
        double[][] valores = new double[TAM][TAM];
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                Random rand = new Random();
                valores[i][j] = rand.nextDouble() * 100;
            }
        }
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                System.out.printf("i%d, j%d = %.2f | ", i, j, valores[i][j]);
            }
            System.out.println();

        }


    }

}
