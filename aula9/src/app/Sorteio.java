package app;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Sorteio {

    public static void main(String[] args) {
        int chute = 0;
        int tentativa=0;
        Random rand = new Random();
        int valor = rand.nextInt(10) + 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite um valor : ");
            chute = sc.nextInt();
            tentativa++;
            if (chute < valor) {
                System.out.println("o numero correto é maior");

            } else if (chute > valor) {
                System.out.println("o numero correto é menor");
            }

        } while (chute != valor);
        System.out.println("Voce acertou na tentativa "+tentativa );
    }
}
