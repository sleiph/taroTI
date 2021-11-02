package br.fatec.taroTI.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "carta")
public class Carta {
    @Id
    private String id;

    public String nome;
    public int valor;
    public String naipe;
    public String descricaoCerta;
    public String descricaoTorta;

    public Carta(String id, String nome, int valor, String naipe, String descricaoCerta, String descricaoTorta) {
        super();
        this.nome = nome;
        this.valor = valor;
        this.naipe = naipe;
        this.descricaoCerta = descricaoCerta;
        this.descricaoTorta = descricaoTorta;
    }

    @Override
    public String toString() {
        return nome;
    }

}
