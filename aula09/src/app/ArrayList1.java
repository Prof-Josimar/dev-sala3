package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {

    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um nome (ou FIM para encerrar): ");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("FIM")) {
                break;
            } else {
                listaNomes.add(nome);
            }
        }

        System.out.println("\nNomes cadastrados usado for");
        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.print(listaNomes.get(i) + " ");
        }
        System.out.println("\nNomes cadastrados usado for each");

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        sc.close();
    }
}
