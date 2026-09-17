package view;

import java.util.Scanner;

public class EstruturaRepeticaoEnquanto {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salarioAcumulados = 0;
        float maiorSalario = 0;
        int contador =0;
        String nome = "";
        System.out.println("Digite o nome.....: ");
        nome = sc.next();
        while(!nome.equalsIgnoreCase("SAIR")) {
            contador++;
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
            System.out.println("Digite o nome.....: ");
            nome = sc.next();

        }
        System.out.println("Total de Empregados : "+contador);
        if(contador>0){
        System.out.println("Media dos salários liquidos : " + (salarioAcumulados / contador));
        }else{
            System.out.println("Nenhum calculo realizado");
        }
        System.out.println("Maior salario : " + maiorSalario);
    }



    }



