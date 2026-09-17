package view;

import java.util.Scanner;

public class Op2 {

    public static void main(String[] args) {
        int x,y ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para x ");
        x = sc.nextInt();

        System.out.println("Digite um valor para y ");
        y = sc.nextInt();

        if(x>y){
            System.out.println("x é maior");
        }else if(y>x){
            System.out.println("y é maior");
        }else{
            System.out.println("são iguais");
        }
        sc.close();

    }
}
