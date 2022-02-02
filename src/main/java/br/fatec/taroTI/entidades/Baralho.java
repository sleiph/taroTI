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
                            """
                                    <h3>Flutter/Dart</h3>
                                    <p>
                                    <a href="https://sannacode.com/blog/advantages-and-disadvantages-using-flutter" >
                                    Vantagens e desvantagens de usar Flutter
                                    </a>.
                                    </p>""",
                            """
                                    <h3>Flutter/Dart</h3>
                                    <p>
                                    <a href="https://sannacode.com/blog/advantages-and-disadvantages-using-flutter" >
                                    Vantagens e desvantagens de usar Flutter
                                    </a>.
                                    </p>"""),
                    new Carta("Lua", 18,
                            """
                                    <h3>Lua</h3>
                                    <p>
                                    Essa foi fácil.\s
                                    <a href="https://www.lua.org" >
                                    É Brasil porra! É Brasil caralho!!1!
                                    </a>.
                                    </p>
                            """,
                            """
                                    <h3>Lua</h3>
                                    <p>
                                    Essa foi fácil.\s
                                    <a href="https://www.lua.org" >
                                    É Brasil porra! É Brasil caralho!!1!
                                    </a>.
                                    </p>
                            """),
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
                                """
                                        <h3>Frontend</h3>
                                        <p>
                                        <a href="https://www.alura.com.br/artigos/do-zero-para-programador-front-end" >Do zero para programador front-end</a>
                                        </p>
                                        """,
                                """
                                        <h3>Frontend</h3>
                                        <p>
                                        <a href="https://ichi.pro/pt/12-erros-cometidos-por-desenvolvedores-da-web-iniciantes-209661946537111" >12 erros cometidos por desenvolvedores da web iniciantes</a>
                                        </p>
                                        """),
                        new Carta("II", 2,
                                """
                                        <h3>Angular: o framework da Orientação a Objetos</h3>
                                        <p>
                                        Pontos positivos:
                                        </p>
                                        <ul>
                                        <li>Várias implementações prontas que facilitam o processo de aprendizado e desenvolvimento;</li>
                                        <li>Usado por grandes empresas. Criado e mantido pela Google que garante bom suporte e comunidade ativa.</li>
                                        </ul>
                                        """,
                                """
                                        <h3>Angular: o framework da Orientação a Objetos</h3>
                                        <p>
                                        Pontos negativos:
                                        </p>
                                        <ul>
                                        <li>Verboso e os pré-requisitos são mais extensos do que as alternativas;</li>
                                        <li>Pouco flexível, como possui uma estrutura sólida, é difícil desviar disso.</li>
                                        </ul>
                                        """),
                        new Carta("III",3,
                                """
                                        <h3>Vue.js: o meio-termo</h3>
                                        <p>
                                        Pontos positivos:
                                        </p>
                                        <ul>
                                        <li>Versátil;</li>
                                        <li>Curva de aprendizado baixa;</li>
                                        <li>Comunidade ativa e interessada, e também aberta a melhorias.</li>
                                        </ul>
                                        """,
                                """
                                        <h3>Vue.js: o meio-termo</h3>
                                        <p>
                                        Pontos negativos:
                                        </p>
                                        <ul>
                                        <li>Sua popularidade é mais recente, e por isso é menos adotado no mercado.</li>
                                        </ul>
                                        """),
                        new Carta("IV", 4,
                                """
                                        <h3>React: a biblioteca entre os frameworks</h3>
                                        <p>
                                        Pontos positivos:
                                        </p>
                                        <ul>
                                        <li>Flexibilidade para criar aplicações pequenas ou grandes;</li>
                                        <li>Liberdade de trabalhar como preferir, inclusive podendo usar JavaScript ou TypeScript;</li>
                                        <li>Comunidade muito ativa e preocupação com iniciantes. Criada e mantida pelo Facebook, usada por plataformas como Twitter e Netflix.</li>
                                        </ul>
                                        """,
                                """
                                        <h3>React: a biblioteca entre os frameworks</h3>
                                        <p>
                                        Pontos negativos:
                                        </p>
                                        <ul>
                                        <li>A flexibilidade pode ser prejudicial pois não ajuda quem desenvolve a manter uma boa organização;</li>
                                        <li>Como evita assumir muitas responsabilidades, o uso de outras bibliotecas é constante e, além de aprender a desenvolver com React, também é importante aprender bibliotecas específicas.</li>
                                        </ul>
                                        """),
                        new Carta("V", 5,
                                """
                                        <h3>Figma</h3>
                                        <p>
                                        "Opa amigo, tem que ficar igualzinho o layout que eu fiz hein?!"
                                        </p>
                                        """,
                                """
                                        <h3>Figma</h3>
                                        <p>
                                        Não tem jeito mais fácil de perder um amigo que dividindo um layout com ele.
                                        </p>
                                        """),
                        new Carta("VI", 6,
                                """
                                        <h3>Bootstrap</h3>
                                        <p>
                                        "CSS? Que é isso?"
                                        </p>
                                        """,
                                """
                                        <h3>Bootstrap</h3>
                                        <p>
                                        "E então o Twitter criou o Bootstrap, e todos os sites foram iguais para todo o sempre. Fim."
                                        </p>
                                        """),
                        new Carta("VII", 7,
                                """
                                        <h3>JQuery</h3>
                                        <p>
                                        Que é rápido, é.
                                        </p>
                                        """,
                                """
                                        <h3>JQuery</h3>
                                        <p>
                                        Muitas pessoas tem preconceito com JQuery, essas pessoas estão certas.
                                        </p>
                                        """),
                        new Carta("VIII", 8,
                                """
                                        <h3>Otimização</h3>
                                        <p>O site tá pronto, agora faz direito.</p>
                                        <p>Tem várias ferramentas de otimização de sites, eu só vou citar uma que tô com preguiça:</p>
                                        <ul>
                                        <li><a href="https://gulpjs.com/" >Gulp</a></li>
                                        </ul>
                                        """,
                                """
                                        <h3>Otimização</h3>
                                        <p>
                                        "Esse .png de 20 megas aqui? Pega nada não."
                                        </p>
                                        """),
                        new Carta("IX",9,
                                """
                                        <h3>CMS: Sistema de gerenciamento de conteúdo</h3>
                                        <p>
                                        Não há satisfação maior que mandar o cara do marketing arrumar, ele mesmo, a data de uma publicação.\s
                                        </p>
                                        """,
                                """
                                        <h3>CMS: Sistema de gerenciamento de conteúdo</h3>
                                        <p>
                                        "Wordpress ainda existe?"
                                        </p>
                                        <p>
                                        "Sei não..."
                                        </p>
                                        """),
                        new Carta("X",10,
                                """
                                        <h3>AJAX: JavaScript assíncrono + XML</h3>
                                        <p>
                                        Sei o que é isso não, só ouvi dizer que é bom.
                                        </p>
                                        """,
                                """
                                        <h3>AJAX: JavaScript assíncrono + XML</h3>
                                        <p>
                                        Sei o que é isso não, só ouvi dizer que é bom.
                                        </p>
                                        """),
                        new Carta("Estagiário", 11,
                                """
                                        <h3>HTML</h3>
                                        <p>
                                        <a href='https://www.smashingmagazine.com/2018/02/comprehensive-website-planning-guide-part1/'>A parte chata primeiro.</a>
                                        </p>
                                        """,
                                """
                                        <h3>HTML</h3>
                                        <p>
                                        <a href='https://www.researchgate.net/publication/227685190_Issues_in_Front-End_Decision_Making_on_Projects'>Tá fazendo certo o projeto?</a>
                                        </p>
                                        """),
                        new Carta("Júnior",12,
                                """
                                        <h3>CSS</h3>
                                        <p>
                                        CSS (Planilhas de estilo em cascata) é usada para estilizar e arranjar páginas web — por exemplo, para alterar a fonte, cor, tamanho e espaçamento do seu conteúdo, separá-lo em multiplas colunas, ou então adicionar animações e outras implementações decorativas. Esse módulo provê um começo sutil em seu caminho pelo domínio do CSS com o básico de como ele funciona, como é a aprência da sintaxe e como você pode começar a utilizá-lo para estilizar seu HTML.
                                        <a href="https://developer.mozilla.org/pt-BR/docs/Learn/CSS/First_steps">¹</a>
                                        </p>
                                        """,
                                """
                                        <h3>CSS</h3>
                                        <p>
                                        Se você aprender a usar Grid Layout vai ser a primeira pessoa na Terra a ter feito tal proeza.
                                        </p>
                                        """),
                        new Carta("Pleno", 13,
                                """
                                        <h3>PHP</h3>
                                        <p>
                                        Não faz essa cara, você tirou PHP, aceite isso!
                                        </p>
                                        """,
                                """
                                        <h3>PHP</h3>
                                        <p>
                                        Não faz essa cara, você tirou PHP, aceite isso!
                                        </p>
                                        """),
                        new Carta("Sênior",14,
                                """
                                        <h3>javaScript</h3>
                                        <p>Qual a linguagem certa pro frontend? A única que existe, dizem os especialistas.</p>
                                        """,
                                """
                                        <h3>javaScript</h3>
                                        <p>1 + 1 = 11</p>
                                        """)
                    }
            ),
            new Naipe(
                    "Devops",
                    "copos/",
                    new Carta[] {
                        new Carta("Às",1,
                                """
                                        <h3>DevOps</h3>
                                        <p>DevOps, é uma pratica da engenharia de software e TI que unifica o desenvolvimento de software(Dev) e  as operações de TI(Ops), tendo característica de defender a automação e monitoramento de todas as fases da construção de um software (desde a integração, teste, liberação para implantação, ao gerenciamento de infraestrutura) auxiliando as empresas no gerenciamento de lançamento de novas versões, deixando o ambiente padronizado em ciclos de desenvolvimento menores, aumentando a frequência de implementação, deixando as liberações mais seguras, em alinhamento próximo com os objetivos de negócio. (<a href="http://ninjadolinux.com.br/devops-desenvolvimento-de-software-e-operacao/">fonte</a>)</p>
                                        """,
                                """
                                        <h3>DevOps</h3>
                                        <p><a href="https://mundodevops.com/blog/8-praticas-que-nao-sao-devops/#:~:text=Uma%20das%20pr%C3%A1ticas%20que%20n%C3%A3o%20s%C3%A3o%20DevOps%20%C3%A9%20a%20n%C3%A3o,risco%20de%20n%C3%A3o%20darem%20certo.">8 Práticas Que Não São DevOps</a></p>
                                        """),
                        new Carta("II",2,
                                """
                                        <h3>Planejamento</h3>
                                        <p>Na fase de planejamento, as equipes de DevOps idealizam, definem e descrevem os recursos e as funcionalidades dos aplicativos e sistemas que estão construindo. (<a href="https://azure.microsoft.com/pt-br/overview/what-is-devops/#devops-overview">fonte</a>)</p>
                                        <p><a href="https://www.jenkins.io/">Jenkins</a></p>
                                        """,
                                """
                                        <h3>Planejamento</h3>
                                        <p>A fase de planejamento do DevOps geralmente é vista como o primeiro estágio de DevOps, mas isso não é muito preciso. Na prática, as equipes de software modernas funcionam em ciclos apertados, em que cada fase informa continuamente os outros por meio de lições aprendidas.(<a href="https://docs.microsoft.com/pt-br/devops/plan/planning-efficient-workloads-with-devops">fonte</a>)</p>
                                        <p><a href="https://www.jenkins.io/">Jenkins</a></p>
                                        """),
                        new Carta("III", 3,
                                """
                                        <h3>Codificação</h3>
                                        <p><a href="https://www.alura.com.br/artigos/o-que-e-git-github">Git e Github: O que são, Como Configurar e Primeiros Passos</a></p>
                                        """,
                                """
                                        <h3>Codificação</h3>
                                        <p><a href="https://tableless.com.br/tudo-que-voce-queria-saber-sobre-git-e-github-mas-tinha-vergonha-de-perguntar/">Tudo que você queria saber sobre Git e GitHub, mas tinha vergonha de perguntar</a></p>
                                        """),
                        new Carta("IV",4,
                                """
                                        <h3>Codificação</h3>
                                        <p><a href="https://blog.csptecnologia.com/por-que-usar-o-jira-software/">Por que usar o Jira Software? Saiba os motivos!</a></p>
                                        """,
                                """
                                        <h3>Codificação</h3>
                                        <p><a href="https://www.youtube.com/watch?v=aTjZxZX99Hw">O que é Jira? Como usar Jira em 2022?</a></p>
                                        """),
                        new Carta("V",5,
                                """
                                        <h3>Codificação</h3>
                                        <p><a href="https://rockcontent.com/br/blog/o-que-e-java/">O que é Java? Conheça as particularidades dessa linguagem de programação</a></p>
                                        """,
                                """
                                        <h3>Codificação</h3>
                                        <p><a href="https://www.zup.com.br/blog/java">Java: tudo o que você precisa saber para começar</a></p>
                                        """),
                        new Carta("VI", 6,
                                """
                                        <h3>Build</h3>
                                        <p><a href="https://www.dio.me/articles/tutorial-completo-do-maven-para-iniciantes">Tutorial completo do Maven para iniciantes</a></p>
                                        """,
                                """
                                        <h3>Build</h3>
                                        <p><a href="https://medium.com/collabcode/come%C3%A7ando-com-o-gradle-4e96fd12d933">Começando com o Gradle</a></p>
                                        """),
                        new Carta("VII",7,
                                """
                                        <h3>Build</h3>
                                        <p><a href="https://medium.com/@renatoluizcarvalho/azure-devops-e-sonarcloud-c31e5edeedb4">Azure DevOps e SonarCloud</a></p>
                                        """,
                                """
                                        <h3>Build</h3>
                                        <p><a href="https://docs.scala-lang.org/getting-started/sbt-track/getting-started-with-scala-and-sbt-on-the-command-line.html">Getting started with Scala and SBT on the command line</a></p>
                                        """),
                        new Carta("VIII", 8,
                                """
                                        <h3>Testes</h3>
                                        <p><a href="https://www.devmedia.com.br/junit-tutorial/1432">JUnit: Implementando testes unitários em Java</a></p>
                                        """,
                                """
                                        <h3>Testes</h3>
                                        <p><a href="http://blog.triadworks.com.br/junit-testando-fluxos-de-excecao-e-erro">jUnit: Testando fluxos de exceção e erro</a></p>
                                        """),
                        new Carta("IX",9,
                                """
                                        <h3>Testes</h3>
                                        <p><a href="https://www.treinaweb.com.br/blog/o-que-e-selenium">O que é Selenium?</a></p>
                                        """,
                                """
                                        <h3>Testes</h3>
                                        <p><a href="https://www.devmedia.com.br/teste-de-performance-com-jmeter/34621">Teste de performance com JMeter</a></p>
                                        """),
                        new Carta("X", 10,
                                """
                                        <h3>Release</h3>
                                        <p>A entrega é o processo de implantação de aplicativos nos ambientes de produção de maneira consistente e confiável. A fase de entrega também inclui a implantação e a configuração da infraestrutura fundamental totalmente governada que compõe esses ambientes.(<a href="https://azure.microsoft.com/pt-br/overview/what-is-devops/#devops-overview">fonte</a>)</p>
                                        """,
                                """
                                        <h3>Release</h3>
                                        <p><a href="https://docs.microsoft.com/pt-br/azure/devops/pipelines/policies/retention?view=azure-devops&tabs=yaml">Definir políticas de retenção para compilações, versões e testes</a></p>
                                        """),
                        new Carta("Estagiário",11,
                                """
                                        <h3>Deploy</h3>
                                        <p><a href="https://www.microserviceit.com.br/en/docker/">Docker: O que é? Como usar? Serve para minha empresa?</a></p>
                                        """,
                                """
                                        <h3>Deploy</h3>
                                        <p><a href="https://www.youtube.com/watch?v=uroAHS9PuNY">Intensivão Docker do Zero</a></p>
                                        """),
                        new Carta("Júnior",12,
                                """
                                        <h3>Operações</h3>
                                        <p><a href="https://www.redhat.com/pt-br/topics/containers/what-is-kubernetes">O que é Kubernetes?</a></p>
                                        """,
                                """
                                        <h3>Operações</h3>
                                        <p><a href="https://www.totvs.com/blog/developers/kubernetes/">Kubernetes: o que é, importância e vantagens de usar</a></p>
                                        """),
                        new Carta("Pleno", 13,
                                """
                                        <h3>Monitoramento</h3>
                                        <p><a href="https://www.datadoghq.com/solutions/devops/">DataDog</a></p>
                                        """,
                                """
                                        <h3>Monitoramento</h3>
                                        <p><a href="https://raygun.com/?utm_source=generic&utm_medium=adwords&utm_campaign=brand&utm_term=raygun&utm_matchtype=e&gclid=Cj0KCQiA9OiPBhCOARIsAI0y71A92uuAzKcgjNtx0y-lTLLA8a0MWZSooMeP-ypV9IVEAcWzwwLVXY4aAuNDEALw_wcB">RayGun</a></p>
                                        """),
                        new Carta("Sênior",14,
                                """
                                        <h3>CI/CD (Integração Contínua e Entrega Contínua)</h3>
                                        <p>O gerenciamento de configuração refere-se ao gerenciamento do estado dos recursos em um sistema, incluindo servidores, máquinas virtuais e bancos de dados. Usando ferramentas de gerenciamento de configuração, as equipes podem implementar alterações de maneira controlada e sistemática, reduzindo os riscos de modificar a configuração do sistema. (<a href="https://azure.microsoft.com/pt-br/overview/what-is-devops/#practices">fonte</a>)</p>
                                        """,
                                """
                                        <h3>CI/CD (Integração Contínua e Entrega Contínua)</h3>
                                        <p><a href="https://gabriel-faraday.medium.com/o-que-%C3%A9-ci-cd-onde-eu-uso-isso-57e9b8ad8c73">O que é CI/CD? Onde eu uso isso?</a></p>
                                        """)
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
