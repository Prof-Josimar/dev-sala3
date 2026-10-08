package model;

public class Carro {

    private int ano;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private int velocidadeMaxima = 220;
    private boolean ligado = false;

    private int velocidadeAtual;


    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }


    // Construtor vazio
    public Carro() {
        this.ligado = false;
        this.velocidadeMaxima = 220;
    }

    public boolean ligar() {
        if (this.ligado) {
            System.out.println("Carro já está ligado. Não é possível ligar novamente.");
        } else {
            this.ligado = true;
            System.out.println("O carro foi ligado.");
        }
        return this.ligado;
    }

    public boolean desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("Carro já está desligado. Não é possível desligar novamente.");
        }
        return this.ligado;
    }


    public void acelerar() {

        if (!ligado) {
            System.out.println("⚠ Não é possível acelerar. O carro está desligado.");
            return;
        }

        if (velocidadeAtual >= velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
            System.out.println("⚠ Velocidade máxima atingida: "
                    + velocidadeMaxima + " km/h");
            return;
        }

        velocidadeAtual += 10;

        // Impede que ultrapasse a velocidade máxima
        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }

        System.out.println("🚗 Acelerando... Velocidade atual: "
                + velocidadeAtual + " km/h");
    }


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
                '}' + "\n";
    }


}

