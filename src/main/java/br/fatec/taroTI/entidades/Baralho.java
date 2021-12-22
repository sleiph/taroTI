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
                        "Funcionar funciona, só não sei como."),
                    new Carta("Papisa", 2,
                        "Aquele comentário no Stack Overflow de quatro anos atrás, que responde todas as dúvidas que você nem sabia que tinha.",
                        "Se nem o Stack Overflow sabe responder... Boa sorte parça!"),
                    new Carta("Imperatriz", 3,
                        "A mãe tá on!",
                        "Tá na hora de aprender a ir no banheiro sozinho."),
                    new Carta("Imperador", 4,
                        "Tá comandando geral.",
                        "Vai com calma aí, Brother."),
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
                        "Que tal um sabático, deusa? Que tal três?",
                        "Chega no trabalho, bota o fone, vai trabalhar. Chega no trabalho, bota..."),
                    new Carta("Roda da Fortuna", 10,
                        "A roda tá girando, playboy.",
                        "Se as coisas estão ruins, fique tranquilo, elas estão prestes a piorar..."),
                    new Carta("Força", 11,
                        "Eles não sabem que você programa em Haskell, você podia ter falado isso ontem, mas se conteve, que cara foda você é.",
                        "Pronto, agora eles sabem que você programa em Haskell, foi difícil entrar nesse assunto naturalmente, mas finalmente você conseguiu contar essa vantagem!"),
                    new Carta("O Enforcado", 12,
                        "Você não sabe realmente quando, mas todo o seu antigo ódio pelo Java hoje em dia é só tristeza.",
                        "Dois meses do projeto parado, esperando você decidir a linguagem, parabéns campeão."),
                    new Carta("Morte", 13,
                        "Aí fudeu!",
                        "Aí fudeu..."),
                    new Carta("Temperança", 14,
                        "Suave, tranquilo, hidratado.",
                        "Caramba cara, esse é o terceiro framework de javaScript essa semana?"),
                    new Carta(
                        "Demônio",
                        15,
                        "O trabalho é só uma desculpa pra happy-hour poder existir.",
                        "Acho q tá na hora de largar o Tibia."
                    ),
                    new Carta("Torre", 16,
                        "A casa caiu.",
                        "Você caiu da casa."),
                    new Carta("Estrela", 17,
                        "Olha pelo lado bom, agora não tem mais pra onde você cair!",
                        "O lado bom de ter cavado sua própria sepultura é que agora ela já está pronta."),
                    new Carta("Lua", 18,
                        "Quando você descobre que não existe rivalidade entre Java e Javascript e você vai ter que aprender os dois.",
                        "Longe de mim sugerir que você largue esse emprego... Mas largue esse emprego!"),
                    new Carta("Sol", 19,
                        "Vitória da razão.",
                        "É muito Sol na cabeça..."),
                    new Carta("Julgamento", 20,
                        "Qual vai ser o seu legado? Provavelmente muito pouco... Bom dia.",
                        "Qual vai ser o seu legado? Provavelmente nenhum! Boa noite."),
                    new Carta("Mundo", 21,
                        "Projeto entregue, o cliente gostou. Não fica melhor que isso, esse trabalho que você escolheu.",
                        "O software só vai ficar pronto quando você desistir dele.")
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
                        "Pede ajuda, cara, ninguém tá te julgando.",
                        "Trabalhar com dados não quer dizer que você não precisa mais escovar os dentes."),
                    new Carta("IV", 4,
                        "Dia 6 cai o pagamento! Dia 6 cai o pagamento! Dia 6 cai o pagamento!",
                        "Comprou o bonequinho por 200 reais né? Nossa, que legal..."),
                    new Carta("V", 5,
                        "Achou que ser analista de dados significava que você ia saber investir em bitcoin né?",
                        "Ao contrário do que a lógica sugeria, parece que aquela moeda de um cachorro realmente vai te trazer um dinheiro."),
                    new Carta("VI", 6,
                        "Não tem vergonha em pedir ajuda.",
                        "Tem que ajudar os outros também, ô vacilaum."),
                    new Carta("VII", 7,
                        "Quando você começa a explorar aquela base de dados que passou tanto tempo limpando.",
                        "Para de tentar tirar leite dessa pedra e vai limpar esses dados."),
                    new Carta("VIII", 8,
                        "Tá na hora de aprender algo novo.",
                        "Tá estagnado, confortável demais, cabou o amor..."),
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
                            "O time tá dividido entre os que querem usar Bootstrap e os que nunca mais querem ouvir esse nome, parece que vai haver morte.",
                            "Decide logo a porra do framework!"),
                        new Carta("VI", 6,
                            "O aplicativo tá no ar, todo mundo te ama, pelo menos por enquanto.",
                            "O aplicativo tá no ar, você fez tudo sozinho, ninguém nunca vai saber."),
                        new Carta("VII", 7,
                            "Ilusão & desilusão.",
                            "Hesitação & Revés."),
                        new Carta("VIII", 8,
                            "Finalmente a firma aceitou implementar aquele framework que você comentou quando entrou na empresa.",
                            "O estagiário entrou querendo mudar tudo, você se sente velho e cansado."),
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
                            "Ultimamente amizade é só networking."),
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
                            "E não é que existe mesmo esse tal de brilho nos olhos? Afe.",
                            "Sabe quem é o boomer da firma? Se não, então provavelmente é você."),
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
                                    "<h3>O salteador</h3>" +
                                            "<p>Tá na hora de aprender aquele framework q os jovens tão usando.</p>",
                                    "<h3>O salteador</h3>" +
                                            "<p>Quantos frameworks de javascript sairam hoje?</p>"),
                            new Carta("II",2,
                                    "<h3>A escolha</h3>" +
                                            "<p>Decisões difíceis.</p>",
                                    "<h3>A escolha</h3>" +
                                            "<p>Decisões impossíveis.</p>"),
                            new Carta("III",3,
                                    "<h3>A ferida</h3>" +
                                            "<p>Solidão, rejeição, fossa ...</p>",
                                    "<h3>A ferida</h3>" +
                                            "<p>Recuperação, aproveita o descanso.</p>"),
                            new Carta("IV", 4,
                                    "<h3>A efígie</h3>\n" +
                                            "<p><a href=\"https://pt.wikipedia.org/wiki/Docker_(software)\" >Docker</a></p>",
                                    "<h3>A efígie</h3>\n" +
                                            "<p>Pra que você foi passar seu número pessoal pro chefe?</p>"),
                            new Carta("V", 5,
                                    "<h3>O traidor</h3>\n" +
                                            "<p>Então esse júnior novo acha que é melhor que você??? Deleta todos os middlewares que você escreveu pro projeto dele!1! Quero ver ele se virar!!!@!</p>",
                                    "<h3>O traidor</h3>\n" +
                                            "<p><a href=\"https://en.wikipedia.org/wiki/Traitor_tracing\">Traitor tracing</a></p>"),
                            new Carta("VI", 6,
                                    "<h3>O barqueiro</h3>\n" +
                                            "<p>Mudança pesada à frente.</p>",
                                    "<h3>O barqueiro</h3>\n" +
                                            "<p>Bagagem pesada pra carregar.</p>"),
                            new Carta("VII", 7,
                                    "<h3>O ladrão</h3>\n" +
                                            "<p>Aquele monolitão que já tava lá quando você chegou vai estar lá quando você for embora.</p>",
                                    "<h3>O ladrão</h3>\n" +
                                            "<p><a href=\"https://www.devmedia.com.br/sql-injection/6102\" >SQL Injection</a></p>"),
                            new Carta("VIII", 8,
                                    "<h3>O prisioneiro</h3>\n" +
                                            "<p>A IDE que você passou tantos anos aprendendo vai ser aposentada.</p>",
                                    "<h3>O prisioneiro</h3>\n" +
                                            "<p>Cobol? Fortran? Do que você tá falando, cara?</p>"),
                            new Carta("IX", 9,
                                    "<h3>O pesadelo</h3>\n" +
                                            "<p>Compilando...</p>",
                                    "<h3>O pesadelo</h3>\n" +
                                            "<p>Erro na compilação.</p>"),
                            new Carta("X", 10,
                                    "<h3>O cadáver</h3>\n" +
                                            "<p>Você já viu um desenvolvedor velho? O que será que acontece com eles? Oque vai acontecer com você???</p>",
                                    "<h3>O cadáver</h3>\n" +
                                            "<p>Mais alguns anos e você tá aposentado... Mais alguns anos e adeus Java, adeus Kubernetes, adeus...</p>"),
                            new Carta("Estagiário", 11,
                                    "<h3>O espião</h3>\n" +
                                            "<p>Vai na fé leske!</p>",
                                    "<h3>O espião</h3>\n" +
                                            "<p>Deixa disso meu jovem mancebo.</p>"),
                            new Carta("Júnior", 12,
                                    "<h3>O berserker</h3>\n" +
                                            "<p>Tá playboy</p>",
                                    "<h3>O berserker</h3>\n" +
                                            "<p>Foco jovem, foco!</p>"),
                            new Carta("Pleno", 13,
                                    "<h3>A viúva</h3>\n" +
                                            "<p>Slay it, quinn.</p>",
                                    "<h3>A viúva</h3>\n" +
                                            "<p>Calma, porra! Calma, caralho!</p>"),
                            new Carta("Sênior", 14,
                                    "<h3>O senhor da guerra</h3>\n" +
                                            "<p>O rei da porra.</p>",
                                    "<h3>O senhor da guerra</h3>\n" +
                                            "<p>Para de pagar de cuzão.</p>")
                    }
            )
        };
    }

}
