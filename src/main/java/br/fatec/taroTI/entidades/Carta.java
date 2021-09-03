package br.fatec.taroTI.entidades;

import java.util.Random;

public class Carta {
    public String nome;
    public int valor;
    public Naipe naipe;
    public String descricaoCerta;
    public String descricaoTorta;
    public boolean isTorta;

    Carta(String nome, int v, int n, String c, String t) {
        this.nome = nome;
        valor = v;
        naipe = new Naipe(n);
        descricaoCerta = c;
        descricaoTorta = t;
    }

    public void setDirecao() {
        isTorta = (Math.random() < 0.5);
    }

    @Override
    public String toString() {
        return nome + " de " + naipe;
    }
}
