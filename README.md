# TaroTI 👁‍🗨

![Java](https://img.shields.io/static/v1?label=&message=Java&color=007396&logo=Java&logoColor=FFFFFF)
![Spring](https://img.shields.io/static/v1?label=&message=Spring&color=6DB33F&logo=Spring&logoColor=FFFFFF)
![PostgreSQL](https://img.shields.io/static/v1?label=&message=postgresql&color=47A248&logo=postgresql&logoColor=FFFFFF)

*Quando o Spring Web decide ir vender miçangas na praia.*

Um aplicativo que instancia uma carta de tarot cada vez que é acessado.

## Instruções

- Clonar o projeto
- Baixar as dependências
- Executar o Launch.

### Cartas

Desenho das cartas baseado no [tarô de Marselha](https://pt.wikipedia.org/wiki/Tar%C3%B4_de_Marselha)

Pra ver alguma carta específica é só trocar os valores no endereço da leitura:
- O valor do naipe 0 é a arcana maior e de 1 a 4 as menores
- O valor das cartas, espero, vai de 0 a 21 pra arcana maior e de 0 a 14 pras menores, isso quando eu acabar de desenhar tudo.
- O valor do sentido pode ser "cima", pra carta ser exibida de pé, ou qualquer outra coisa que você quiser, pra ser exibida invertida.

### Comandos

```shell
mvnw spring-boot:run
```

Pra rodar o servidor, que fica online na [porta 8080](http://localhost:8080).

## Tecnologias

Spring Web | Spring Data | Maven | PostgreSQL | Thymeleaf

![mago](/src/main/resources/static/img/maior/01.png)

## Fazer:
- Aplicativo
    * usar vários environments
    * fazer as pazes entre Heroku e MongoDB ;-;
    
- Dados
    * juntar tudo em uma tabela só, já que o mongo não é relacional
  
- Negócio
    * leituras mais complexas
    * ler só uma carta por dia

- Projeto
    * Adicionar um logger

- Site
    * Trocar as imagens por svg
    
- Arte
    * criar ilustrações relacionadas a programação

- Testes
    * fazer testes...

## Licença

[![License: Unlicense](https://img.shields.io/badge/license-Unlicense-blue.svg)](http://unlicense.org/)
