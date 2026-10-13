package model;


public class TV {

    private String marca;
    private String modelo;
    private int canal = 1;
    private int volume = 10;
    private boolean ligada = false;

    public TV() {
        System.out.println("NOVA TV CRIADA");
        System.out.println("Canal....: " + canal);
        System.out.println("Volume...: " + volume);
    }


    public void mudarCanal(int novoCanal) {
        if (!isLigada()) {
            System.out.println("A TV esta desligada , ligue -a primeiro");

        }else if(novoCanal<1 || novoCanal>99){
            System.out.println("Canal inválido");
        }else{
            canal = novoCanal;
            System.out.println("Canal mudado para "+canal);
        }
    }

    public void aumentarVolume() {
        if (!isLigada()) {
            System.out.println("A TV está desligada , ligue a primeiro");
        } else if (volume >= 100) {
            System.out.println("O volume esta no máximo");
        } else {
            volume += 10;
            System.out.println("Volume aumentado " + this.getVolume());
        }
    }

    public void diminuirVolume() {
        if (!isLigada()) {
            System.out.println("A TV está desligada , ligue a primeiro");
        } else if (volume < 10) {
            System.out.println("O volume esta no máximo");
        } else {
            volume += 10;
            System.out.println("Volume aumentado ");
        }
    }


    public boolean isLigada() {
        return ligada;
    }

    public void ligar() {
        if (!isLigada()) {
            ligada = true;
            System.out.println("A TV foi ligada");
        } else {
            System.out.println("A TV já esta ligada");
        }

    }

    public void desligar() {
        if (isLigada()) {
            ligada = false;
            System.out.println("A TV foi deligada");
        } else {
            System.out.println("A TV já esta desligada");
        }

    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {

        String estado = ligada ? "Ligada" : "Desligada";

        return "TV {" +
                "marca = '" + marca + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", canal = " + canal +
                ", volume = " + volume +
                ", ligada = " + estado +
                '}';
    }

}
