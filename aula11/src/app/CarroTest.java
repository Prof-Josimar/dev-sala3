package app;

import model.Carro;

public class CarroTest {


    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setAno(2011);
        carro1.setMarca("VW");
        carro1.setModelo("Fox");
        carro1.setCor("vermelho");
        carro1.setPlaca("ABC1234");
        System.out.println(carro1);

        Carro carro2 = new Carro();
        carro2.setAno(2015);
        carro2.setMarca("Peugeot");
        carro2.setModelo("Sandero");
        carro2.setCor("Cinza");
        carro2.setPlaca("QWE1234");
        System.out.println(carro2);

        carro1.ligar();
        carro1.ligar();
        carro1.desligar();
        carro1.desligar();

    }


}
