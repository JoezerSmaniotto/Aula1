package br.edu.ifsul.control;

import br.edu.ifsul.model.Pessoa; // Liga os arquivos  ALT + ENTER Para importar os arquivos porem tenho que fazer iso em cima da classe
import br.edu.ifsul.model.Porta;  // Liga os arquivos o import

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(); // Estancia o obj
        pessoa.cpf="032.564.123-56";
        pessoa.idade=26;
        pessoa.nome="Joezer";
        // Printo o obj, porém sem conteúdo
        System.out.println(pessoa);

        Pessoa pessoa1 = new Pessoa("jonas",31,"t0.222.333.99");
        System.out.println(pessoa1);

        // Segundo Obj Porta

        Porta porta = new Porta();
        porta.setAltura(2.5f);
        porta.setLargura(0.9f);
        porta.setJanela(true);

        System.out.println(porta);
        porta.abriPorta();


        Porta  porta1 = new Porta();
        porta1.setAltura(3.5f);
        porta1.setLargura(1.0f);
        porta1.setJanela(false);

        System.out.println(porta1);
        porta1.fecharPorta();

    }

}
