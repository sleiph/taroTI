package br.fatec.taroTI.entidades;

public class Carta {
    public String nome;
    public int valor;
    public String descricaoCerta;
    public String descricaoTorta;

    Carta(String nome, int v, String c, String t) {
        this.nome = nome;
        valor = v;
        descricaoCerta = c;
        descricaoTorta = t;
    }

    @Override
    public String toString() {
        return nome;
    }
}
