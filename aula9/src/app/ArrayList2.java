package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList2 {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        List<Double> salarios = new ArrayList<>();

        double salarioAcumulado = 0.0;
        double maiorSalario = 0.0;
        String nomeMaiorSalario = "";
        int cont = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Digite o nome do funcionário ou SAIR:");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("SAIR")) {
                break;
            }

            nomes.add(nome);

            System.out.println("Digite o salário:");
            double salario = sc.nextDouble();
            sc.nextLine();

            salarios.add(salario);
            salarioAcumulado += salario;
            cont++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
                nomeMaiorSalario = nome;
            }
        }

        System.out.println("\n--- FUNCIONÁRIOS ---");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i) + "\tR$ " + salarios.get(i));
        }

        System.out.println("\nSalário acumulado: R$ " + salarioAcumulado);

        if (cont > 0) {
            System.out.println("Média salarial: R$ " + (salarioAcumulado / cont));
            System.out.println("Maior salário: R$ " + maiorSalario);
            System.out.println("Nome do funcionário com maior salário: " + nomeMaiorSalario);
        } else {
            System.out.println("Nenhum funcionário foi cadastrado.");
        }

        sc.close();
    }
}
