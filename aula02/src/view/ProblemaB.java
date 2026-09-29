package view;

import java.util.Scanner;

public class ProblemaB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a matricula : ");
        int mat = sc.nextInt();

        System.out.println("Digite o salario base : ");
        double salarioBase = sc.nextDouble();

        System.out.println("Digite o código da função : ");
        System.out.println("Digite 100, 300, 400 ou 600");
        int codigoFuncao = sc.nextInt();

        double reajuste = 0.0;

        switch (codigoFuncao) {
            case 100:
                System.out.println("2%");
                reajuste = salarioBase * 2.0 / 100.0;
                break;
            case 300:
                System.out.println("3%");
                reajuste = salarioBase * 3.0 / 100.0;
                break;
            case 400:
                System.out.println("5%");
                reajuste = salarioBase * 5.0 / 100.0;
                break;
            case 600:
                System.out.println("7%");
                reajuste = salarioBase * 7.0 / 100.0;
                break;

            default:
                System.out.println("Opção Inválida");
                System.exit(0);
        }
        double novoSalario = salarioBase + reajuste;

        System.out.println("Reajuste .....:" + reajuste);
        System.out.println("Novo salario...: " + novoSalario);


    }
}
