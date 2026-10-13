package app;

import model.TV;

public class ControleTV {


    public static void main(String[] args) {
        TV minhaTv1 = new TV();






        minhaTv1.setMarca("Samsung");
        minhaTv1.setModelo("SM750-B");

        minhaTv1.ligar();
        minhaTv1.aumentarVolume();

        System.out.println(minhaTv1);

        minhaTv1.desligar();

        System.out.println(minhaTv1);


    }


}
