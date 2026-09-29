package app;

import java.util.Locale;
import java.util.Scanner;

public class NumerosNegativosArray {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantos numeros voce vai digitar ? ");
        int num = sc.nextInt();
        int[] vetor = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Digite um número ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            if(vetor[i]<0){
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}
