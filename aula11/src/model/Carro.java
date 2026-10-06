package model;

public class Carro {

    private int ano;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private int velocidadeMaxima = 220;
    private boolean ligado = false;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
        return "Carro{" +
                " ano = " + ano +
                " marca = '" + marca + '\'' +
                " modelo = '" + modelo + '\'' +
                " cor =  '" + cor + '\'' +
                "\nplaca = '" + placa + '\'' +
                " velocidadeMaxima = " + velocidadeMaxima +
                " ligado = " + ligado +
                '}'+"\n";
    }
}

