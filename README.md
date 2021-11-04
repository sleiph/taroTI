# TaroTI 👁‍🗨

![Java](https://img.shields.io/static/v1?label=&message=Java&color=007396&logo=Java&logoColor=FFFFFF)
![Spring](https://img.shields.io/static/v1?label=&message=Spring&color=6DB33F&logo=Spring&logoColor=FFFFFF)
![MongoDB](https://img.shields.io/static/v1?label=&message=MongoDB&color=47A248&logo=MongoDB&logoColor=FFFFFF)

*Quando o Spring Web decide ir vender miçangas na praia.*

Um aplicativo que instancia uma carta de tarot cada vez que é acessado. O projeto usa Spring Web, Spring Data, MongoDB e Thymeleaf. Sua verdadeira razão de existir é pra eu poder estudar a [arquitetura MVC](https://pt.wikipedia.org/wiki/MVC) e, quem sabe um dia, arquitetura REST.

Contra todas as espectativas o app está online e já pode ser testado [nesse endereço](https://taroti.herokuapp.com).

Comecei com base [nesse tuturial](https://spring.io/guides/gs/serving-web-content) e meio que tô improvisando desde então.

## Cartas

Desenho das cartas provisoriamente baseado no [tarô de Marselha](https://pt.wikipedia.org/wiki/Tar%C3%B4_de_Marselha)

Pra ver alguma carta específica é só trocar os valores no endereço da leitura:
- O valor do naipe 0 é a arcana maior e de 1 a 4 as menores
- O valor das cartas, espero, vai de 0 a 21 pra arcana maior e de 0 a 14 pras menores, isso quando eu acabar de desenhar tudo.
- O valor do sentido pode ser "cima", pra carta ser exibida de pé, ou qualquer outra coisa que você quiser, pra ser exibida invertida.

![mago](/src/main/resources/static/img/maior/01.png)

## Comandos

```shell
mvnw spring-boot:run
```

Pra rodar o servidor, que fica online na [porta 8080](http://localhost:8080).

## Fazer:
- Aplicativo
    - usar vários environments
    
- Dados
    - criar uma API, REST de preferência
    - juntar tudo em uma tabela só, já que o mongo não é relacional
    - tabela pra arcanas maiores e menores
    - arrumar o valor dos naipes pros nomes deles e não números
    - fazer as pazes entre Heroku e MongoDB ;-;

- Negócio
    - leituras mais complexas
    - ler só uma carta por dia
    
- Testes
    - fazer testes...

- Site
    - associar elementos html com as cartas, não só strings
    - criar uma página 404 e deixar indices errados irem pra lá
    - Modo noturno
    - Trocar as imagens por svg
    
- Arte
    - desenhar cartas pixelart
    - relacionar as ilustrações com programação

## Licença

[![License: Unlicense](https://img.shields.io/badge/license-Unlicense-blue.svg)](http://unlicense.org/)
