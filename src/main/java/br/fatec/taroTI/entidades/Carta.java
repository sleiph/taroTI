package br.fatec.taroTI.entidades;

import java.util.Random;

public class Carta {
    private String nome;
    private String descricaoCerta;
    private String descricaoTorta;
    private String imagem;
    private boolean isTorta;

    Carta(String n, String c, String t, String img) {
        nome = n;
        descricaoCerta = c;
        descricaoTorta = t;
        imagem = img;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricaoCerta() {
        return descricaoCerta;
    }
    public String getDescricaoTorta() {
        return descricaoTorta;
    }

    public String getImagem() {
        return imagem;
    }

    public void setDirecao() {
        isTorta = (Math.random() < 0.5);
    }
    public boolean getDirecao() {
        return isTorta;
    }

    @Override
    public String toString() {
        return nome;
    }
}
