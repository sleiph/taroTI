package br.fatec.taroTI.dto;

import java.util.Objects;

public class Leitura {

    private final int naipe;

    private final int valor;

    private final String sentido;

    public Leitura(int naipe, int valor, String sentido) {
        this.naipe = naipe;
        this.valor = valor;
        this.sentido = sentido;
    }

    public int getNaipe() {
        return naipe;
    }

    public int getValor() {
        return valor;
    }

    public String getSentido() {
        return sentido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leitura leitura = (Leitura) o;
        return naipe == leitura.naipe && valor == leitura.valor && Objects.equals(sentido, leitura.sentido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naipe, valor, sentido);
    }

}
