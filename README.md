# API webservice - Back-End da Plataforma
Projeto desenvolvido em Spring Boot com JPA/Hibernate com implantação na Plataforma Heroku.

Esta plataforma disponibiliza a aplicação seguindo o modelo mais atual de conteinerização fornecendo alta capacidade de escalabilidade conforme a necessidade.

A aplicação pode ser testada diretamente no endereço web em https://webservice-spring-jpa-heroku.herokuapp.com/users onde será listado no formato ```JSON``` uma listagem dos usuários cadastrados.
## Get Started
Para testar esta API é necessário rodar o projeto através do [STS - Spring Tools Suíte](https://spring.io/tools) que é um Eclipse adaptado para desenvolvimento no Spring Boot.
Também é recomendado a utilização do [Postman](https://www.postman.com/downloads/) para execução da nossa plataforma, assim você não precisará configurar seu ambiente.
### Rodando a API com Postman
- Primeiramente instale o Postman em sua máquina conforme as recomendações do site oficial.
- Clone este repositório na sua máquina.
- Através do STS importe o projeto e logo após, abra o projeto.
- No pacote ```com.heliohdd.webservice``` acionar o comando ```Run as``` escolhendo a opção ```Spring Boot App```.
Após a execução do comando a API deve estar disponível em:
```http://localhost:8080```
### Swagger
A API utiliza a documentação do [Swagger](https://swagger.io/).
Com o projeto rodando, a documentação da API deve estar disponível em:
```http://localhost:8080/swagger-ui.html```
