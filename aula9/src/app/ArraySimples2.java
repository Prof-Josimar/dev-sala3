package app;

import java.util.Scanner;

public class ArraySimples2 {

    public static void main(String[] args) {
        final int TAM = 3;
        String[] nome = new String[TAM];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o nome ");
            nome[i] = sc.next();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.println(nome[i]);
        }

    }

}
