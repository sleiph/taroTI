package br.fatec.taroTI.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "naipe")
public class Naipe {
    @Id
    private String id;

    public String indice;
    public String nome;
    public String caminho;

    public Naipe(String indice, String nome, String caminho) {
        super();
        this.indice = indice;
        this.nome = nome;
        this.caminho = caminho;
    }

    @Override
    public String toString() {
        return nome;
    }
}
