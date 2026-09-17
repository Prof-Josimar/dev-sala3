package view;

import java.util.Scanner;

public class EstruturaRepeticao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salarioAcumulados = 0;
        float maiorSalario = 0;
        System.out.println("Quantos funcionarios serão calculados : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Digite o nome.....: ");
            String nome = sc.next();
            System.out.println("Digite o salario..: ");
            float salario = sc.nextFloat();
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
            float desconto = salario * 8 / 100;
            float salarioLiquido = salario - desconto;
            salarioAcumulados = salarioAcumulados + salarioLiquido;
            System.out.println("Nome...............: " + nome);
            System.out.println("Desconto...........: " + desconto);
            System.out.println("Salario Liquido....: " + salarioLiquido);
            System.out.println("______________________________________");
        }
        System.out.println("Media dos salários liquidos : " + (salarioAcumulados / num));
        System.out.println("Maior salario : " + maiorSalario);
    }
}

