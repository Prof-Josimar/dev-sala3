package view;

import java.util.Scanner;

public class TabuadaSimples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero ");
        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
        sc.close();
    }

}
