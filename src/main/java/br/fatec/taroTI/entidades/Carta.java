package br.fatec.taroTI.entidades;

public class Carta {
    public String nome;
    public int valor;
    public String descricaoCerta;
    public String descricaoTorta;
    public boolean isTorta;
    public String caminho;

    Carta(String nome, int v, String c, String t) {
        this.nome = nome;
        valor = v;
        descricaoCerta = c;
        descricaoTorta = t;
    }

    public void setDirecao() {
        isTorta = (Math.random() < 0.5);
    }

    @Override
    public String toString() {
        return nome;
    }
}
