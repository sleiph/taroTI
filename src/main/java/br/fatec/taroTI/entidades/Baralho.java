package br.fatec.taroTI.entidades;

import java.util.Random;

public class Baralho {
    private Naipe[] naipes;

    public Baralho() {
        naipes = new Naipe[] {
            new Naipe(
                "Fullstack",
                "maior/",
                new Carta[] {
                    new Carta("Tolo", 0,
                        "Vai fundo, cara.",
                        "Tu tá de meninagem!"),
                    new Carta("Mago", 1,
                        "O pai tá on!",
                        "Temos um Xerox Rolmes."),
                    new Carta("Imperatriz", 3,
                        "A mãe tá on!",
                        "Tá na hora de aprender a ir no banheiro sozinho."),
                    new Carta("Imperador", 4,
                        "Tá comandando geral.",
                        "Vai com calma aí, Stalin."),
                    new Carta("Hierofante", 5,
                        "Embrace tradition.",
                        "Reject modernity."),
                    new Carta("Os enamorados", 6,
                        "Ai que fofo, gente! O casal!",
                        "Gado d+"),
                    new Carta("O carro", 7,
                        "Vai porra, continua, caralho, vai!",
                        "Andando você tá, mas pra onde?"),
                    new Carta("Justiça", 8,
                        "Tá certinho mano, vai na tua q tá tranquilo.",
                        "Não tenho provas, mas tenho convicção."),
                    new Carta("O Enforcado", 12,
                        "Abstrai...",
                        "Abstraiu demais."),
                    new Carta("Morte", 13,
                        "Aí fudeu!",
                        "Aí fudeu..."),
                    new Carta("Temperança", 14,
                        "Suave.",
                        "Esquece esse negócio de terceira via..."),
                    new Carta("Sol", 19,
                        "Vitória da razão.",
                        "É muito Sol na cabeça...")
                }
            ),
            new Naipe(
                "Backend",
                "ouros/",
                new Carta[] {
                    new Carta("II", 2,
                        "Tá no corre.",
                        "Dá seus pulo, cara."),
                    new Carta("VI", 6,
                        "Não tem vergonha em pedir ajuda.",
                        "Tem que ajudar os outros também, ô vacilaum."),
                    new Carta("VIII", 8,
                        "Tá na hora de aprender algo novo.",
                        "Tá estagnado, confortável demais, cabou o tesão..."),
                    new Carta("X", 10,
                        "Já pode aposentar.",
                        "Vô mentir pra vc não, velho. Tú tá é fudido, falido, mal pago..."),
                    new Carta("Estagiário", 11,
                        "Tá fazendo meninagem com o seu dinheiro! Continue.",
                        "Tá fazendo meninagem com o seu dinheiro! Pare."),
                    new Carta("Júnior", 12,
                        "Vai carpir um pasto q você ganha mais.",
                        "Se cair de quatro não levanta mais.")
                }
            ),
            new Naipe(
                    "Frontend",
                    "paus/",
                    new Carta[] {
                        new Carta("Às", 1,
                            "Tá criando várias paradas.",
                            "Relaxa aí ô Artistão."),
                        new Carta("III",3,
                            "O início de um sonho.",
                            "Deu tudo errado."),
                        new Carta("IV", 4,
                            "Sextou!",
                            "Essa festa virou enterro..."),
                        new Carta("VII", 7,
                            "Ilusão & desilusão.",
                            "Hesitação & Revés."),
                        new Carta("IX",9,
                            "Depressão.",
                            "Depressão pra caralho!"),
                        new Carta("X",10,
                            "Pode delegar q tá tranquilo.",
                            "Deixa os outros fazerem também, ô fominha.")
                    }
            ),
            new Naipe(
                    "Devops",
                    "copos/",
                    new Carta[] {
                        new Carta("Às",1,
                            "Vai começar o amor.",
                            "Vai começar de cafonice."),
                        new Carta("II",2,
                            "Vai achar alguém.",
                            "Vai perder alguém."),
                        new Carta("V",5,
                            "Perda",
                            "Aceitação"),
                        new Carta("VII",7,
                            "Parece que vai dar tudo certo. Parece...",
                            "Investiu em bitcoin?"),
                        new Carta("IX",9,
                            "Tá mimado d+.",
                            "Ué, mas não eram dez copos?"),
                        new Carta("Estagiário",11,
                            "Olha que cristalzinho puro.",
                            "Deixa de ser criança, criança."),
                        new Carta("Júnior",12,
                            "Quase um príncipe encantado.",
                            "Deixa de ser diva, flor."),
                        new Carta("Pleno", 13,
                            "Emoções são demais!",
                            "São emoções demais..."),
                        new Carta("Sênior",14,
                            "Manja das emoções.",
                            "Tá viajando demais nas emoções.")
                    }
            ),
            new Naipe(
                    "Data Science",
                    "espadas/",
                    new Carta[] {
                            new Carta("III",3,
                                    "Solidão, rejeição, fossa ...",
                                    "Recuperação, aproveita o descanso."),
                            new Carta("VI", 6,
                                    "Mudança pesada à frente.",
                                    "Babagem pesada pra carregar."),
                            new Carta("VII", 7,
                                    "Tem que manter isso aí!",
                                    "Vai perder tudo que ganhou."),
                            new Carta("Estagiário", 11,
                                    "Vai na fé leske!",
                                    "Deixa disso meu jovem mancebo."),
                            new Carta("Júnior", 12,
                                    "Tá playboy",
                                    "Foco jovem, foco!"),
                            new Carta("Pleno", 13,
                                    "Slay it, quinn.",
                                    "Calma, porra! Calma, caralho!"),
                            new Carta("Sênior", 14,
                                    "O rei da porra.",
                                    "Para de pagar de cuzão.")
                    }
            )
        };
    }

    public Carta getLeitura() {
        Naipe n = naipes[new Random().nextInt(naipes.length)];
        Carta temp = n.cartas[new Random().nextInt(n.cartas.length)];
        temp.nome = temp.nome + " de " + n;
        temp.caminho = n.caminho + String.format("%02d", temp.valor);
        temp.setDirecao();
        return temp;
    }
}
