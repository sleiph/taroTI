package br.fatec.taroTI.entidades;

import java.util.Random;

public class Carta {
    public String nome;
    public String descricaoCerta;
    public String descricaoTorta;
    public String imagem;
    public boolean isTorta;

    Carta(String n, String c, String t, String img) {
        nome = n;
        descricaoCerta = c;
        descricaoTorta = t;
        imagem = img;
    }

    public void setDirecao() {
        isTorta = (Math.random() < 0.5);
    }

    @Override
    public String toString() {
        return nome;
    }
}
