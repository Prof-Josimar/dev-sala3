package view;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num = sc.nextInt();
        // usando if else
        if (num % 2 == 0) {
            System.out.println("é par");
        } else {
            System.out.println("é impar");
        }

        // usando if else
        if(num <0 ){
            System.out.println("É negativo");
        }else{
            System.out.println("é poisitovo");
        }
        // USANDO operador ternário
        System.out.println(num > 0 ? "é positivo" : "é negativo");


    }


}


