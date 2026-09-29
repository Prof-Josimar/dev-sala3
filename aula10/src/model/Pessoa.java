package model;

public class Pessoa {

    public int id;
    public String nome;
    public String email;

    @Override
    public String toString() {
        return "Pessoa{" +
                "id = " + id +
                ", nome  = '" + nome + '\'' +
                ", email = '" + email + '\'' +
                '}';
    }
}
