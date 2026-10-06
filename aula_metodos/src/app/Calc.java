package app;

import entity.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = sc.nextInt();

        // Método void e static.
        // Por ser static, pode ser chamado diretamente pela classe,
        // sem a necessidade de criar um objeto.
        // Como é void, o próprio método realiza a operação
        // e não retorna nenhum valor.
        Calculadora.soma(num1, num2);

        // Método void e não static.
        // Por não ser static, é necessário criar um objeto da classe
        // Calculadora para poder chamar esse método.
        Calculadora calculadora = new Calculadora();
        calculadora.soma2(num1, num2);

        // Método int e não static.
        // Por não ser static, precisa ser chamado através de um objeto.
        // O método recebe os parâmetros, realiza a operação
        // e retorna um valor do tipo int para o código que o chamou.
        System.out.println(calculadora.soma3(num1, num2));
    }
}
