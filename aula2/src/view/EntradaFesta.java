package view;

import java.util.Scanner;

public class EntradaFesta {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        float salario;
        boolean amigoDono;

        System.out.println("Idade ? ");
        idade = sc.nextInt();

        System.out.println("Salário ? ");
        salario = sc.nextFloat();

        System.out.println("Amigo dono ? (S/N)");
        String resposta = sc.next().toUpperCase();
        amigoDono = resposta.charAt(0)=='S';

        if(idade>=18 && salario>3000 || amigoDono){
            System.out.println("Pode Entrar");
        }else{
            System.out.println("NÃO Pode Entrar");
        }
    }
}
