package br.fatec.taroTI.entidades;

public class Baralho {
    public Naipe[] naipes;

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
                    new Carta("Papisa", 2,
                        "Aquele comentário no Stack Overflow de quatro anos atrás, que responde todas as dúvidas que você nem sabia que tinha.",
                        "Se nem o Stack Overflow sabe responder... Boa sorte parça!"),
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
                        "Vai porra, continua caralho, vai!",
                        "Andando você tá, mas pra onde?"),
                    new Carta("Justiça", 8,
                        "Tá certinho mano, vai na tua q tá tranquilo.",
                        "Não tenho provas, mas tenho convicção."),
                    new Carta("Eremita", 9,
                        "",
                        ""),
                    new Carta("Roda da Fortuna", 10,
                        "A roda tá girando, playboy.",
                        "Se as coisas estão ruins, fique tranquilo, elas estão prestes a piorar."),
                    new Carta("Força", 11,
                        "",
                        ""),
                    new Carta("O Enforcado", 12,
                        "Abstrai...",
                        "Abstraiu demais."),
                    new Carta("Morte", 13,
                        "Aí fudeu!",
                        "Aí fudeu..."),
                    new Carta("Temperança", 14,
                        "Suave.",
                        "Esquece esse negócio de terceira via..."),
                    new Carta(
                        "Demônio",
                        15,
                        "O trabalho é só uma desculpa pra happy-hour poder existir.",
                        "Acho q tá na hora de largar o Tibia."
                    ),
                    new Carta("Torre", 16,
                        "",
                        ""),
                    new Carta("Estrela", 17,
                        "Olha pelo lado bom, agora não tem mais pra onde você cair!",
                        "O lado bom de ter cavado sua própria sepultura é que agora ela já está pronta."),
                    new Carta("Lua", 18,
                        "",
                        ""),
                    new Carta("Sol", 19,
                        "Vitória da razão.",
                        "É muito Sol na cabeça..."),
                    new Carta("Julgamento", 20,
                        "Qual vai ser o seu legado? Provavelmente muito pouco... Bom dia.",
                        "Qual vai ser o seu legado? Provavelmente nenhum! Boa noite."),
                    new Carta("Mundo", 21,
                        "",
                        "")
                }
            ),
            new Naipe(
                "Dados",
                "ouros/",
                new Carta[] {
                    new Carta("Ás", 1,
                        "Sabe o que é melhor que o seu salário atual? Um salário maior.",
                        "Sabe o que justifica um aumento de salário? Mais dor de cabeça."),
                    new Carta("II", 2,
                        "Tá no corre.",
                        "Dá seus pulo, cara."),
                    new Carta("III", 3,
                        "",
                        ""),
                    new Carta("IV", 4,
                        "",
                        ""),
                    new Carta("V", 5,
                        "",
                        ""),
                    new Carta("VI", 6,
                        "Não tem vergonha em pedir ajuda.",
                        "Tem que ajudar os outros também, ô vacilaum."),
                    new Carta("VII", 7,
                        "",
                        ""),
                    new Carta("VIII", 8,
                        "Tá na hora de aprender algo novo.",
                        "Tá estagnado, confortável demais, cabou o tesão..."),
                    new Carta("IX", 9,
                        "Tá na hora da colheita.",
                        "Perdeu a hora da colheita."),
                    new Carta("X", 10,
                        "Já pode aposentar.",
                        "Vô mentir pra vc não, velho. Tú tá é fudido, falido, mal pago..."),
                    new Carta("Estagiário", 11,
                        "UPDATE empresa_TODA_DB SET coluna_importante = '';",
                        "DELETE * FROM empresa_TODA_DB;"),
                    new Carta("Júnior", 12,
                        "Vai carpir um pasto q você ganha mais.",
                        "Se cair de quatro não levanta mais."),
                    new Carta("Pleno", 13,
                        "Rainha do home-office.",
                        "O trabalho tá feito, mas a louça tá lavada?"),
                    new Carta("Sênior", 14,
                        "Todo dia nasce um otário, você tá aqui pra provar isso.",
                        "Relaxa cara, nem todo mundo quer te enganar, no máximo a maioria.")
                }
            ),
            new Naipe(
                    "Frontend",
                    "paus/",
                    new Carta[] {
                        new Carta("Às", 1,
                            "Tá criando várias paradas.",
                            "Relaxa aí ô Artistão."),
                        new Carta("II", 2,
                            "<a href='https://www.smashingmagazine.com/2018/02/comprehensive-website-planning-guide-part1/'>A parte chata primeiro.</a>",
                            "<a href='https://www.researchgate.net/publication/227685190_Issues_in_Front-End_Decision_Making_on_Projects'>Tá fazendo certo o projeto?</a>"),
                        new Carta("III",3,
                            "O início de um sonho.",
                            "Deu tudo errado."),
                        new Carta("IV", 4,
                            "Sextou!",
                            "Essa festa virou enterro..."),
                        new Carta("V", 5,
                            "",
                            ""),
                        new Carta("VI", 6,
                            "",
                            ""),
                        new Carta("VII", 7,
                            "Ilusão & desilusão.",
                            "Hesitação & Revés."),
                        new Carta("VIII", 8,
                            "",
                            ""),
                        new Carta("IX",9,
                            "Depressão.",
                            "Depressão pra caralho!"),
                        new Carta("X",10,
                            "Pode delegar q tá tranquilo.",
                            "Deixa os outros fazerem também, ô fominha."),
                        new Carta("Estagiário", 11,
                            "Imaginação/Contemplação.",
                            "Potencial desperdiçado."),
                        new Carta("Júnior",12,
                            "Lembra daquela ideia que vc teve pra uma startup? Gênio!",
                            "Lembra daquela ideia que vc teve pra uma startup? Jênio..."),
                        new Carta("Pleno", 13,
                            "Zé povinho.",
                            "Talarico."),
                        new Carta("Sênior",14,
                            "Steve Jobs.",
                            "Bill Gates.")
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
                        new Carta("III", 3,
                            "Sextou na festa da firma.",
                            "Não é amizade, é networking..."),
                        new Carta("IV",4,
                            "0 novas mensagens.",
                            "Refreshe seu e-mail."),
                        new Carta("V",5,
                            "Perda.",
                            "Aceitação."),
                        new Carta("VI", 6,
                            "No tempo do jQuery é que era bom...",
                            "Lembra do DreamWeaver? Hein? Lembra???"),
                        new Carta("VII",7,
                            "Parece que vai dar tudo certo. Parece...",
                            "Investiu em bitcoin?"),
                        new Carta("VIII", 8,
                            "Pesquise no google: 'What happens when a sprint fails?'",
                            "Deve ter um jeito de explicar que esse sprint foi culpa de todo mundo menos sua."),
                        new Carta("IX",9,
                            "<a href='endeavor.org.br/estrategia-e-gestao/como-transformar-objetivo-okr-meta'>Pergunte à sua mãe sobre OKRs</a>",
                            "<a href='https://gtmhub.com/blog/why-okrs-fail'>OKR de Ku é Rola.</a>"),
                        new Carta("X", 10,
                            "",
                            ""),
                        new Carta("Estagiário",11,
                            "Os devs não te escutam.",
                            "Os ops não te entendem."),
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
                    "Backend",
                    "espadas/",
                    new Carta[] {
                            new Carta("I",1,
                                    "Tá na hora de aprender aquele framework q os jovens tão usando.",
                                    "Quantos frameworks de javascript sairam hoje?"),
                            new Carta("II",2,
                                    "Decisões difíceis.",
                                    "Decisões impossíveis."),
                            new Carta("III",3,
                                    "Solidão, rejeição, fossa ...",
                                    "Recuperação, aproveita o descanso."),
                            new Carta("IV", 4,
                                    "",
                                    ""),
                            new Carta("V", 5,
                                    "",
                                    ""),
                            new Carta("VI", 6,
                                    "Mudança pesada à frente.",
                                    "Babagem pesada pra carregar."),
                            new Carta("VII", 7,
                                    "Tem que manter isso aí!",
                                    "Vai perder tudo que ganhou."),
                            new Carta("VIII", 8,
                                    "",
                                    ""),
                            new Carta("IX", 9,
                                    "",
                                    ""),
                            new Carta("X", 10,
                                    "",
                                    ""),
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

}
