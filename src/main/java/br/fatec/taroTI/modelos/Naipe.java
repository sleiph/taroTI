package br.fatec.taroTI.modelos;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="naipe")
public class Naipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 32)
    public String nome;
    @Column(nullable = false)
    public String caminho;

    public String getNome() {
        return this.nome;
    }
    public String getCaminho() {
        return this.caminho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Naipe naipe = (Naipe) o;
        return Objects.equals(id, naipe.id) && Objects.equals(nome, naipe.nome) && Objects.equals(caminho, naipe.caminho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, caminho);
    }

    @Override
    public String toString() {
        return nome;
    }
}
