package view;

public class ExerTeste {

    public static void main(String[] args) {
        System.out.println("Usando for");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n\nUsando while\n");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
        int k = 1;
        System.out.println("\n\nUsando do while");
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);
    }
}
