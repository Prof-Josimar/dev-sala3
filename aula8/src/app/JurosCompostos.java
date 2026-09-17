package app;
import java.util.Scanner;

public class JurosCompostos {

    // Método para calcular o montante com juros compostos usando for
    public static double calcularMontante(double capital, double taxa, int tempo) {
        double montante = capital;
        for (int i = 1; i <= tempo; i++) {
            montante = montante * (1 + taxa);
            System.out.println("Após período " + i + ": " + montante);
        }
        return montante;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora de Juros Compostos ===");
        System.out.print("Digite o capital inicial: ");
        double capital = sc.nextDouble();

        System.out.print("Digite a taxa de juros (em decimal, ex: 0.05 = 5%): ");
        double taxa = sc.nextDouble();

        System.out.print("Digite o tempo (número de períodos): ");
        int tempo = sc.nextInt();

        double montanteFinal = calcularMontante(capital, taxa, tempo);

        System.out.println("Montante final após " + tempo + " períodos: " + montanteFinal);

        sc.close();
    }
}
