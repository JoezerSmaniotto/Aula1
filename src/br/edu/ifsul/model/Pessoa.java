package br.edu.ifsul.model;

public class Pessoa {
    // Atributo
    public String nome;
    public int idade;
    public String cpf;

    // Construtor

    public Pessoa (){

    }

    // Esse de baixo é sobrecarga com o de vima
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }


    //Metodos

    // ALT + INSERT para CRIAR o OVERRIDE
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
