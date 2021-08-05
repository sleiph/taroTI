package br.fatec.taroTI.entidades;

import java.util.Random;

public class Baralho {
    private final Carta[] cartas = {
            new Carta("Tolo", "Vai fundo, cara.", "Tu tá de meninagem!", "maior/00tolo"),
            new Carta("Mago", "O pai tá on!", "Temos um Xerox Rolmes.", "maior/01mago"),
            new Carta("Imperatriz",
                    "A mãe tá on!",
                    "Tá na hora de aprender a ir no banheiro sozinho.",
                    "maior/03imperatriz"),
            new Carta("Hierofante",
                    "Embrace tradition.",
                    "Reject modernity.",
                    "maior/05hierofante"),
            new Carta("Os enamorados",
                    "Ai que fofo, gente! O casal!",
                    "Gado d+",
                    "maior/06enamorados"),
            new Carta("O Enforcado", "Abstrai...", "Abstraiu demais.", "maior/12enforcado"),
            new Carta("Morte", "Aí fudeu!", "Aí fudeu...", "maior/13morte"),
            new Carta("Sol", "Vitória da razão.", "É muito Sol na cabeça...", "maior/19sol"),

            new Carta("II de Ouros", "Tá no corre.", "Dá seus pulo, cara.", "ouros/02"),
            new Carta("VI de Ouros",
                    "Não tem vergonha em pedir ajuda.",
                    "Tem que ajudar os outros também, ô vacilaum.",
                    "ouros/06"),
            new Carta("VIII de Ouros",
                    "Tá na hora de aprender algo novo.",
                    "Tá estagnado, confortável demais, cabou o tesão...",
                    "ouros/08"),
            new Carta("X de Ouros",
                    "Já pode aposentar.",
                    "Vô mentir pra vc não, velho. Tú tá é fudido, falido, mal pago...",
                    "ouros/10"),
            new Carta("Valete de Ouros",
                    "Tá fazendo meninagem com o seu dinheiro! Continue.",
                    "Tá fazendo meninagem com o seu dinheiro! Pare.",
                    "ouros/11"),

            new Carta("Às de Paus",
                    "Tá criando várias paradas.",
                    "Relaxa aí ô Artistão.",
                    "paus/01"),
            new Carta("IX de Paus", "Depressão.", "Depressão pra caralho!", "paus/09"),
            new Carta("X de Paus",
                    "Pode delegar q tá tranquilo.",
                    "Deixa os outros fazerem também, ô fominha.",
                    "paus/10"),

            new Carta("Às de Copos", "Vai começar o amor.", "Vai começar de cafonice.", "copos/01"),
            new Carta("II de Copos", "Vai achar alguém.", "Vai perder alguém.", "copos/02"),
            new Carta("VII de Copos",
                    "Parece que vai dar tudo certo. Parece...",
                    "Investiu em bitcoin?",
                    "copos/07"),
            new Carta("Valete de Copos",
                    "Olha que cristalzinho puro.",
                    "Deixa de ser criança, criança.",
                    "copos/11"),
            new Carta("Rei de Copos",
                    "Manja das emoções.",
                    "Tá viajando demais nas emoções.",
                    "copos/14"),

            new Carta("III de Espadas",
                    "Solidão, rejeição, fossa ...",
                    "Recuperação, aproveita o descanso.",
                    "espadas/03"),
            new Carta("VII de Espadas",
                    "Tem que manter isso aí!",
                    "Vai perder tudo que ganhou.",
                    "espadas/07"),
            new Carta("Cavaleiro de Espadas",
                    "Tá playboy",
                    "Foco jovem, foco!",
                    "espadas/12"),
            new Carta("Rainha de Espadas",
                    "Slay it, quinn",
                    "Calma, porra! Calma, caralho!",
                    "espadas/13")
    };

    public Baralho() {

    }

    public Carta getLeitura() {
        int i = new Random().nextInt(cartas.length);
        Carta temp = cartas[i];
        temp.setDirecao();
        return temp;
    }
}
