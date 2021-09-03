# TaroTI 👁‍🗨

*Quando o Spring Web decide ir vender miçangas na praia.*

Um aplicativo que instancia uma carta de tarot cada vez que é acessado.

![tolo](/static/img/maior/00.png)

Contra todas as espectativas o app está online e já pode ser testado [nesse endereço](https://taroti.herokuapp.com).

`mvnw spring-boot:run`

O projeto usa as dependências Spring Web, Thymeleaf e Spring Boot DevTools e sua verdadeira razão de existir é pra que eu possa estudar a [arquitetura MVC](https://pt.wikipedia.org/wiki/MVC).

`http://localhost:8080`

Comecei o projeto com base [nesse tuturial](https://spring.io/guides/gs/serving-web-content) e meio que estou improvisando desde então.

Desenho das cartas provisoriamente baseado no [tarô de Marselha](https://pt.wikipedia.org/wiki/Tar%C3%B4_de_Marselha)

## Fazer:
- Projeto
    - botar no ar
- Dados
    - usar um banco de dados ([h2?](https://www.baeldung.com/spring-boot-h2-database)), como uma pessoa normal faria
    - usar json ([Jackson?](https://www.baeldung.com/jackson-object-mapper-tutorial)) pra criar os objetos Carta
- Site
    - Estilos
    - Modo noturno
    - Grids
- Leituras
    - leituras mais complexas
    - ler só uma carta por dia
- Cartas
    - classes diferentes pra arcanas maiores e menores
    - nome automático pras cartas dependendo do valor
    - desenhar cartas
        - as arcanas maiores
        - espadas
        - copos
        - bastões
        - dinheiros
    - relacionar as ilustrações com programação
