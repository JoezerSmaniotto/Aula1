package br.edu.ifsul.model;

public class Porta {
    // Atributos
    private float altura;
    private float largura;
    private boolean janela;

    // Metodos

    public void abriPorta(){
        System.out.println("Porta Aberta");
    }

    public void fecharPorta(){
        System.out.println("Porta Cerrada");
    }

    @Override
    public String toString() {
        return "Porta{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", janela=" + janela +
                '}';
    }


    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public boolean isJanela() {
        return janela;
    }

    public void setJanela(boolean janela) {
        this.janela = janela;
    }
}



