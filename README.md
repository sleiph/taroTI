# TaroTI 👁‍🗨

![Java](https://img.shields.io/static/v1?label=&message=java&color=ED8B00&logo=openjdk&logoColor=FFFFFF)
![Spring](https://img.shields.io/static/v1?label=&message=Spring&color=6DB33F&logo=Spring&logoColor=FFFFFF)
![PostgreSQL](https://img.shields.io/static/v1?label=&message=postgres&color=0064A5&logo=postgresql&logoColor=FFFFFF)

*Quando o Spring Web decide ir vender miçangas na praia.*

Um aplicativo que instancia uma carta de tarot cada vez que o endpoint é chamado.

![mago](/src/main/resources/static/img/maior/01.png)

### Cartas

Desenho das cartas baseado no [tarô de Marselha](https://pt.wikipedia.org/wiki/Tar%C3%B4_de_Marselha)

Pra ver alguma carta específica é só bater no endpoint `/carta?carta=1&naipe=1&sentido=cima` os valores no endereço da carta:
- O valor do naipe 0 é a arcana maior e de 1 a 4 as menores
- O valor das cartas, espero, vai de 0 a 21 pra arcana maior e de 0 a 14 pras menores, isso quando eu acabar de desenhar tudo.
- O valor do sentido pode ser "cima", pra carta ser exibida de pé, ou qualquer outra coisa que você quiser, pra ser exibida invertida.

Enquanto eu atualizo tudo aqui, copiei as leituras das cartas do site [Tarotfarm](https://tarotfarm.com.br/significados-das-78-cartas-do-tarot/).

## Instruções

- Clonar o projeto
- Baixar as dependências
- Executar a config 'Launch'.

O servidor fica online na [porta 8090](http://localhost:8090), mas pode ser mudado nas properties.

## Tecnologias

Spring Web | Spring Data | Maven | PostgreSQL | Thymeleaf

## Fazer:
- Negócio
    * leituras mais complexas
    * ler só uma carta por dia

- Site
    * Trocar as imagens por svg
    * Popular as páginas
    
- Arte
    * criar ilustrações relacionadas a programação

- Testes
    * criar testes...

## Licença

[![License: Unlicense](https://img.shields.io/badge/license-Unlicense-blue.svg)](http://unlicense.org/)
