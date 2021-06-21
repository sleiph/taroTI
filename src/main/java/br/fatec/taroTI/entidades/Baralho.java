package br.fatec.taroTI.entidades;

import java.util.Random;

public class Baralho {
    private Carta[] cartas = {
            new Carta("Tolo", "Vai fundo, cara", "Tu tá de meninagem", "tolo"),
            new Carta("Mago", "O pai tá on", "Temos um Xerox Rolmes", "mago"),
            new Carta("Hierofante", "Embrace tradition", "Reject modernity", "hierofante"),
            new Carta("Morte", "aí fudeu", "aí fudeu", "morte"),
            new Carta("Sol", "Vitória da razão.", "É muito Sol na cabeça...", "sol"),
            new Carta("Às de Paus", "tá criando várias paradas", "Relaxa aí ô Artistão", "asdepaus"),
            new Carta("IX de Paus", "Depressão", "Depressão pra caralho", "ixdepaus")
    };

    public Baralho() {

    }

    public Carta getLeitura() {
        int i = new Random().nextInt(cartas.length);
        cartas[i].setDirecao();
        return cartas[i];
    }
}
