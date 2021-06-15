package br.fatec.taroTI.entidades;

public class Carta {
    private String nome;
    private String descricao;

    Carta() {

    }

    Carta(String n, String d) {
        nome = n;
        descricao = d;
    }

    public void setNome(String n) {
        nome = n;
    }
    public String getNome() {
        return nome;
    }

    public void setDescricao(String d) {
        descricao = d;
    }
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return nome;
    }
}
