package br.fatec.taroTI.modelos;

import java.util.HashMap;
import java.util.Map;

public enum NaipeType {

    PAUS(1, "Paus", "paus", "Fogo"),
    OUROS(2, "Ouros", "ouros", "Terra"),
    ESPADAS(3, "Espadas", "espadas", "Ar"),
    COPAS(4, "Copas", "copos", "Água"),
    MAIOR(0, "Arcana Maior", "maior", null);

    private final int valor;
    private final String nome;
    private final String caminho;
    private final String elemento;

    private static final Map<Integer, NaipeType> mapaNaipes = new HashMap<>();

    NaipeType(int valor, String nome, String caminho, String elemento) {
        this.valor = valor;
        this.nome = nome;
        this.caminho = caminho;
        this.elemento = elemento;
    }

    static{
        for (NaipeType naipe : values()) {
            mapaNaipes.put(naipe.valor, naipe);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public static NaipeType getNaipePorValor(Integer valor) {
        return mapaNaipes.get(valor);
    }

}
