package view;

import model.Carro;

public class AppCarro {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setAno(1965);
        carro1.setMarca("VW");
        carro1.setModelo("Polo");
        carro1.setCor("Vermelho");
        carro1.setPlaca("KXZ9438");
        carro1.setVelocidadeMaxima(240);
        carro1.setLigado(false);
        // salvei dos dados

        // agora vou consultar meu carro
        System.out.println(carro1.info());





    }

}
