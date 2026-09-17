package view;

import java.util.Locale;
import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String nome;
        float nota1, nota2, media;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome : ");
            nome = sc.next();
            System.out.println("Digite a primeira nota : ");
            nota1 = sc.nextFloat();
            System.out.println("Digite a segunda  nota : ");
            nota2 = sc.nextFloat();
            media = (nota1 + nota2) / 2;
            if (media >= 6) {
                System.out.printf(" %s esta aprovado com média %.1f\n", nome, media);
            } else {
                System.out.printf(" %s esta REPROVADO com média %.1f\n", nome, media);
            }

        }
        sc.close();
    }
}