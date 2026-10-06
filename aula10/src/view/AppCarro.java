package view;

import model.Carro;

public class AppCarro {

    public static void main(String[] args) {

        Carro carro1 = new Carro(
                1975,
                "VW",
                "polo",
                "vermelho",
                "KXZ9438"
        );

        carro1.ligar();
        carro1.ligar();

        System.out.println(carro1.info());
    }
}
