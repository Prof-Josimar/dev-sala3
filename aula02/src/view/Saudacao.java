package view;

import java.util.Scanner;

public class Saudacao {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Nome :  ? ");
        String nome = sc.next();

        System.out.println("Digite a hora (entre 0 e 23) ");
        int hora = sc.nextInt();

        System.out.println("Digite o sexo (F/M)");
        char sexo = sc.next().toUpperCase().charAt(0);

        String saudacao;
        if(hora<12){
            saudacao = "Bom Dia ";
        }else if(hora<18){
            saudacao = "Boa Tarde ";
        }else{
            saudacao = "Boa Noite ";
        }
        String tratamento;
        if(sexo=='M'){
            tratamento = "Sr.";
        }else{
            tratamento = "Sr.ª";
        }

    }
}
