package br.fatec.taroTI.modelos;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="carta")
public class Carta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.ORDINAL)
    private ValorType valor;
    @Enumerated(EnumType.STRING)
    private NaipeType naipe;
    @Column(name = "descricao_certa")
    private String descricaoCerta;
    @Column(name = "descricao_torta")
    private String descricaoTorta;

    public ValorType getValor() {
        return valor;
    }

    public NaipeType getNaipe() {
        return naipe;
    }

    public String getDescricaoCerta() {
        return descricaoCerta;
    }

    public String getDescricaoTorta() {
        return descricaoTorta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(id, carta.id) && valor == carta.valor && naipe == carta.naipe && Objects.equals(descricaoCerta, carta.descricaoCerta) && Objects.equals(descricaoTorta, carta.descricaoTorta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valor, naipe, descricaoCerta, descricaoTorta);
    }

    @Override
    public String toString() {
        if (this.naipe==NaipeType.MAIOR)
            return valor.getNome();
        return valor.getNome() + " de " + naipe.getNome();
    }

}
