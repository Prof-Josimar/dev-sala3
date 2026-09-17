package view;

import java.util.Scanner;

public class ProblemaA {


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

        if (codigoFuncao == 100) {
            reajuste = salarioBase * 2.0 / 100.0;
        } else if (codigoFuncao == 300) {
            reajuste = salarioBase * 3.0 / 100.0;
        } else if (codigoFuncao == 400) {
            reajuste = salarioBase * 5.0 / 100.0;
        } else { // 600
            reajuste = salarioBase * 7.0 / 100.0;
        }
        double novoSalario = salarioBase + reajuste;

        System.out.println("Reajuste .....:" + reajuste);
        System.out.println("Novo salario...: " + novoSalario);


    }

}
