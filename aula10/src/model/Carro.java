package model;

public class Carro {

    private int ano;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private int velocidadeMaxima = 220;
    private boolean ligado = false;

    // Construtor vazio
    public Carro() {
        this.ligado = false;
        this.velocidadeMaxima = 220;
    }

    // Construtor com parâmetros
    public Carro(int ano, String marca, String modelo, String cor, String placa) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    public boolean ligar() {
        if (this.ligado) {
            System.out.println("Carro já está ligado. Não é possível ligar novamente.");
        } else {
            System.out.println("O carro foi ligado.");
            this.ligado = true;
        }

        return this.ligado;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1970) {
            System.out.println("Ano inválido.");
            this.ano = 0;
        } else {
            this.ano = ano;
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
        this.modelo = modelo.toUpperCase();
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor.toLowerCase();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa.length() > 7) {
            System.out.println("Placa inválida.");
            this.placa = "ERRADA";
        } else {
            this.placa = placa;
        }
    }

    public int getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String info() {
        String msgLigado;
        if (this.ligado) {
            msgLigado = "SIM";
        } else {
            msgLigado = "NÃO";
        }

        return "\nano........: " + ano +
                "\nmarca......: " + marca +
                "\nmodelo.....: " + modelo +
                "\ncor........: " + cor +
                "\nplaca......: " + placa +
                "\nVel Max....: " + velocidadeMaxima +
                "\nligado.....: " + msgLigado;
    }
}
