package app;

import java.util.Scanner;

public class JurosSimples {

    // Método para calcular os juros simples
    public static double calcularJuros(double capital, double taxa, double tempo) {
        return capital * taxa * tempo;
    }

    // Método para calcular o montante total (capital + juros)
    public static double calcularMontante(double capital, double taxa, double tempo) {
        double juros = calcularJuros(capital, taxa, tempo);
        return capital + juros;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora de Juros Simples ===");
        System.out.print("Digite o capital inicial: ");
        double capital = sc.nextDouble();

        System.out.print("Digite a taxa de juros (em decimal, ex: 0.05 = 5%): ");
        double taxa = sc.nextDouble();

        System.out.print("Digite o tempo (em meses ou anos): ");
        double tempo = sc.nextDouble();

        double juros = calcularJuros(capital, taxa, tempo);
        double montante = calcularMontante(capital, taxa, tempo);

        System.out.println("Juros: " + juros);
        System.out.println("Montante final: " + montante);

        sc.close();
    }
}
