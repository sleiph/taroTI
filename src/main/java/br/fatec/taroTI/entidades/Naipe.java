package br.fatec.taroTI.entidades;

public class Naipe {
    public String nome;
    public String caminho;
    public Carta[] cartas;

    Naipe (String n, String c, Carta[] cts) {
        nome = n;
        caminho = c;
        cartas = cts;
    }

    @Override
    public String toString() {
        return nome;
    }
}
