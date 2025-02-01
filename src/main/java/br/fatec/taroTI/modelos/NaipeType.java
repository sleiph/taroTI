package br.fatec.taroTI.modelos;

import java.util.HashMap;
import java.util.Map;

public enum NaipeType {

    PAUS(1, "Paus", "paus"),
    OUROS(2, "Ouros", "ouros"),
    ESPADAS(3, "Espadas", "espadas"),
    COPAS(4, "Copas", "copos"),
    MAIOR(0, "Arcana Maior", "maior");

    private final int valor;
    private final String nome;
    private final String caminho;

    private static final Map<Integer, NaipeType> mapaNaipes = new HashMap<>();

    static{
        for (NaipeType naipe : values()) {
            mapaNaipes.put(naipe.valor, naipe);
        }
    }

    NaipeType(int valor, String nome, String caminho) {
        this.valor = valor;
        this.nome = nome;
        this.caminho = caminho;
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
