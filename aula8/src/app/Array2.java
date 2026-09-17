package app;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        final int TAM = 3;
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o nome da posição " + (i + 1) + " : ");
            nome[i] = sc.next();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.println(nome[i]);
        }
        sc.close();
    }
}
