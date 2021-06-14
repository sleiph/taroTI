package br.fatec.taroTI;

import java.util.Random;

public class Baralho {
    private Carta[] cartas = {
            new Carta("tolo", "tu tá de meninagem"),
            new Carta("mago", "o pai tá on")
    };

    Baralho() {

    }

    public Carta getCarta() {
        int i = new Random().nextInt(cartas.length);
        return cartas[i];
    }
}
