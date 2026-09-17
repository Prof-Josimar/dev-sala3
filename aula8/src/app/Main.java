package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> ids = new ArrayList<>();
        List<String> nomes = new ArrayList<>();
        List<Float> salarios = new ArrayList<>();

        int id;
        do {
            System.out.print("Digite o ID (0 para sair): ");
            id = scanner.nextInt();
            if (id != 0) {
                scanner.nextLine(); // Limpa o buffer

                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();

                System.out.print("Digite o salário: ");
                float salario = scanner.nextFloat();

                ids.add(id);
                nomes.add(nome);
                salarios.add(salario);

                System.out.println("Funcionário cadastrado com sucesso!\n");
            }
        } while (id != 0);

        System.out.println("\n=== Cadastro Final ===");
        for (int i = 0; i < ids.size(); i++) {
            System.out.printf("ID: %d | Nome: %s | Salário: R$ %.2f%n", ids.get(i), nomes.get(i), salarios.get(i));
        }


        scanner.close();
    }
}