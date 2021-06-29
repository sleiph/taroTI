package br.fatec.taroTI.entidades;

import java.util.Random;

public class Baralho {
    private Carta[] cartas = {
            new Carta("Tolo", "Vai fundo, cara.", "Tu tá de meninagem!", "maior/00tolo"),
            new Carta("Mago", "O pai tá on!", "Temos um Xerox Rolmes.", "maior/01mago"),
            new Carta("Hierofante", "Embrace tradition.", "Reject modernity.", "maior/05hierofante"),
            new Carta("Os enamorados", "Ai que fofo, gente! O casal!", "Gado d+", "maior/06enamorados"),
            new Carta("O Enforcado", "Abstrai...", "Abstraiu demais.", "maior/12enforcado"),
            new Carta("Morte", "Aí fudeu!", "Aí fudeu...", "maior/13morte"),
            new Carta("Sol", "Vitória da razão.", "É muito Sol na cabeça...", "maior/19sol"),
            new Carta("II de Ouros", "Tá no corre.", "Dá seus pulo, cara.", "ouros/02"),
            new Carta("Às de Paus", "Tá criando várias paradas.", "Relaxa aí ô Artistão.", "paus/01"),
            new Carta("IX de Paus", "Depressão.", "Depressão pra caralho!", "paus/09"),
            new Carta("Às de Copos", "Vai começar o amor.", "Vai começar de cafonice.", "copos/01"),
            new Carta("II de Copos", "Vai achar alguém.", "Vai perder alguém.", "copos/02"),
            new Carta("VII de Copos", "Parece que vai dar tudo certo. Parece...", "Investiu em bitcoin?", "copos/07")
    };

    public Baralho() {

    }

    public Carta getLeitura() {
        int i = new Random().nextInt(cartas.length);
        cartas[i].setDirecao();
        return cartas[i];
    }
}
