package app;

import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        final int TAM = 5;
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[TAM];
        double[] salario = new double[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o nome da posição " + (i + 1) + " : ");
            nome[i] = sc.next();
            System.out.println("Digite o salario da posição " + (i + 1) + " : ");
            salario[i] = sc.nextDouble();
            sc.nextLine();
        }

        int indiceMaiorSalario = 0;
        double maiorSalario = 0.0;

        for (int i = 0; i < TAM; i++) {
            if (salario[i] > maiorSalario) {
                maiorSalario = salario[i];
                indiceMaiorSalario = i;
            }
        }
        System.out.println("O maior salário é " + salario[indiceMaiorSalario]
                + " Nome " + nome[indiceMaiorSalario]);
        sc.close();


    }
}
