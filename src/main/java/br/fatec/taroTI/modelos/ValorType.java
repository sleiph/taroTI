package br.fatec.taroTI.modelos;

import com.google.common.collect.Table;
import com.google.common.collect.TreeBasedTable;

public enum ValorType {

    AS(1, "Ás", false),
    DOIS(2, "Dois", false),
    TRES(3, "Três", false),
    QUATRO(4, "Quatro", false),
    CINCO(5, "Cinco", false),
    SEIS(6, "Seis", false),
    SETE(7, "Sete", false),
    OITO(8, "Oito", false),
    NOVE(9, "Nove", false),
    DEZ(10, "Dez", false),
    VALETE(11, "Valete", false),
    CAVALEIRO(12, "Cavaleiro", false),
    RAINHA(13, "Rainha", false),
    REI(14, "Rei", false),
    TOLO(0, "O Tolo", true),
    MAGO(1, "O Mago", true),
    SACERDOTISA(2, "A Sacerdotisa", true),
    IMPERATRIZ(3, "A Imperatriz", true),
    IMPERADOR(4, "O Imperador", true),
    PAPA(5, "O Sumo Sacerdote", true),
    ENAMORADOS(6, "Os Amantes", true),
    CARRO(7, "O Carro de guerra", true),
    JUSTICA(8, "A Justiça", true),
    EREMITA(9, "O Eremita", true),
    FORTUNA(10, "A Roda da Fortuna", true),
    FORCA(11, "A Força", true),
    ENFORCADO(12, "O Enforcado", true),
    MORTE(13, "A Morte", true),
    TEMPERANCA(14, "A Temperança", true),
    DIABO(15, "O Diabo", true),
    TORRE(16, "A Torre", true),
    ESTRELA(17, "A Estrela", true),
    LUA(18, "A Lua", true),
    SOL(19, "O Sol", true),
    JULGAMENTO(20, "O Julgamento", true),
    MUNDO(21, "Mundo", true);

    private final Integer valor;
    private final String nome;
    private final boolean isMaior;

    private static final Table<Boolean, Integer, ValorType> tableValores = TreeBasedTable.create();

    static{
        for (ValorType valor : values()) {
            tableValores.put(valor.isMaior, valor.valor, valor);
        }
    }

    ValorType(Integer valor, String nome, boolean isMaior) {
        this.valor = valor;
        this.nome = nome;
        this.isMaior = isMaior;
    }

    public Integer getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public static ValorType getByNaipeAndValor(NaipeType naipe, Integer valor) {
        boolean isMaior = naipe == NaipeType.MAIOR;
        return tableValores.get(isMaior, valor);
    }

}
