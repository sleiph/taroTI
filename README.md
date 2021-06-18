# TaroTI 👁‍🗨

Quando o Spring Web decide ir vender miçangas na praia. Um aplicativo que instancia uma carta de tarot cada vez que é acessado.

![tolo](/src/main/resources/static/img/tolo.png)

`mvnw spring-boot:run`

O projeto usa as dependências Spring Web, Thymeleaf e Spring Boot DevTools e sua verdadeira razão de existir é pra que eu possa estudar a [arquitetura MVC](https://pt.wikipedia.org/wiki/MVC).

`http://localhost:8080`

Comecei o projeto com base [nesse tuturial](https://spring.io/guides/gs/serving-web-content) e meio que estou improvisando desde então.

Desenho das cartas provisoriamente baseado no [tarô de Marselha](https://en.wikipedia.org/wiki/Tarot_of_Marseilles)

## Fazer:
- Projeto
    - botar no ar
- Dados
    - usar um banco de dados (h2?), como uma pessoa normal faria
    - usar json (Jackson?) pra criar os objetos Carta
-Site
    - Estilos
    - Modo noturno
    - Grids
- Leituras
    - leituras mais complexas
    - ler só uma carta por dia
- Cartas
    - desenhar cartas
        - as arcanas maiores
        - espadas
        - copos
        - bastões
        - dinheiros
    - relacionar as ilustrações com programação
