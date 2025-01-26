package br.fatec.taroTI.modelos;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="carta")
public class Carta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 32)
    public String nome;
    @Column
    public Long valor;
    @ManyToOne
    @JoinColumn(name="id_naipe")
    public Naipe naipe;
    @Column(name = "descricao_certa")
    public String descricaoCerta;
    @Column(name = "descricao_torta")
    public String descricaoTorta;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(valor, carta.valor) && id.equals(carta.id) && Objects.equals(nome, carta.nome) && Objects.equals(naipe, carta.naipe) && Objects.equals(descricaoCerta, carta.descricaoCerta) && Objects.equals(descricaoTorta, carta.descricaoTorta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, valor, naipe, descricaoCerta, descricaoTorta);
    }

    @Override
    public String toString() {
        return nome + " de " + naipe.getNome();
    }

}
