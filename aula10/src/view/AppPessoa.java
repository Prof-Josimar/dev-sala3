package view;

import model.Pessoa;

public class AppPessoa {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.id = 500;
        pessoa1.nome = "Maria da Silva";
        pessoa1.email = "mariasilva@oi.com.br";

        pessoa2.id = 501;
        pessoa2.nome = "Ana Rocha";
        pessoa2.email = "anarocha@oi.com.br";

        System.out.println(pessoa1);
        System.out.println(pessoa2);
    }
}
