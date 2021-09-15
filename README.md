# TaroTI 👁‍🗨

*Quando o Spring Web decide ir vender miçangas na praia.*

Um aplicativo que instancia uma carta de tarot cada vez que é acessado.

Contra todas as espectativas o app está online e já pode ser testado [nesse endereço](https://taroti.herokuapp.com).

O projeto usa as dependências Spring Web, Thymeleaf e Spring Boot DevTools e sua verdadeira razão de existir é pra eu poder estudar a [arquitetura MVC](https://pt.wikipedia.org/wiki/MVC).

Comecei o projeto com base [nesse tuturial](https://spring.io/guides/gs/serving-web-content) e meio que estou improvisando desde então.

## Comandos

```shell
mvnw spring-boot:run
```

Pra rodar o servidor, que fica online na [porta 8080](http://localhost:8080).

## Cartas

Desenho das cartas provisoriamente baseado no [tarô de Marselha](https://pt.wikipedia.org/wiki/Tar%C3%B4_de_Marselha)

![mago](/src/main/resources/static/img/maior/01.png)

## Fazer:
- Dados
    - usar um banco de dados ([h2?](https://www.baeldung.com/spring-boot-h2-database)), como uma pessoa normal faria
    - usar json ([Jackson?](https://www.baeldung.com/jackson-object-mapper-tutorial)) pra criar os objetos Carta
    - rotear cada carta pra um endereço, como um backend de verdade faria
- Site
    - Modo noturno
    - Grids
    - Trocar as imagens por um svg
- Leituras
    - leituras mais complexas
    - ler só uma carta por dia
- Cartas
    - classes diferentes pra arcanas maiores e menores
    - nome automático pras cartas dependendo do valor
- Arte
    - desenhar cartas
        - as arcanas maiores
        - espadas
        - copos
        - bastões
        - dinheiros
    - relacionar as ilustrações com programação
