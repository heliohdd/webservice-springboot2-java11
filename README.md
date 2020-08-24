<h3>
    <a href=https://webservice-spring-jpa-heroku.herokuapp.com/users>Demonstração</a>
</h3>


# Índice
- [Sobre](#-sobre)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Estrutura das Entidades](#-estrutura-das-entidades)
- [Como conferir o projeto na internet](#-como-conferir-o-projeto-na-internet)
<!-- [Como testar o projeto no Postman](#-como-usar-o-projeto-no-postman)-->
- [Como baixar o projeto](#-como-baixar-o-projeto)




## 🔖 Sobre

O projeto **WebService** é a implementação de uma **API RESTful** na Plataforma Heroku que é um PaaS, ou seja, uma plataforma como serviço que oferece recursos de alta **escalabilidade** seguindo o moderno modelo de **containers** que permitem alta **disponibilidade** da aplicação.

Essa é uma versão demonstrativa que disponibiliza recursos  contendo as entidades ```Clientes```, ```Pedidos```, ```Produtos``` e ```Categorias``` para o desenvolvimento de projeto **Front-End**. Maiores informações sobre a estrutura das entidades estão na seção [Estrutura das Entidades](#-estrutura-das-entidades).

Esta aplicação se enquadra na categoria e-commerce, pois contém a estrutura que atende à finalidade de ```Cadastro``` de clientes, e ```Registro``` de pedidos contendo informações relacionadas ao histórico de compras e pagamentos bem como  dos produtos adquiridos.

Este é um projeto demonstrativo que mostra na prática a implementação de um modelo conceitual sobre o paradigma orientado a objetos, usando boas práticas de desenvolvimento e padrões de mercado.

---

## 🚀 Tecnologias Utilizadas

O projeto foi  desenvolvido utilizando as seguintes tecnologias.
<!--
<h3>
    <img src=Pictures/spring-boot.png>
</h3>
-->

- [Spring Boot](https://spring.io/)
- [Apache Tomcat](http://tomcat.apache.org/)
- [Maven](https://maven.apache.org/)
- [Postman](https://www.postman.com/)
- [H2](https://www.h2database.com/html/main.html)


---

## 🧮 Estrutura das Entidades

Estão disponiveis  as entidades ```Clientes```, ```Pedidos```, ```Produtos``` e ```Categorias```  sendo estruturadas como exemplos abaixo:

### Clientes
```json
{
    "id": 1,
    "name": "Hélio Dourado",
    "email": "heliohdd@yahoo.com.br",
    "phone": "99886633",
    "password": "123456"
}
```
### Pedidos
```json
{
    "id": 1,
    "moment": "2020-08-22T12:40:07Z",
    "orderStatus": "PAID",
    "client": "O nome do cliente",
    "items": [{"relação de itens comprados"}],
    "payment": {"Forma de pagamento"},
    "total": "Valor total da compra"
}
```
### Produtos
```json
{
    "id": 1,
    "name": "Livro java 8 prático",
    "description": "Lambdas, streams e os novos recursos da linguagem.",
    "price": 39.9,
    "imgurl": null,
    "categories": ["Livros"]
}
```
### Categorias
```json
{
    "id": 3,
    "name": "Livros"
}
```

## 📂 Como conferir o projeto na internet

O projeto se encontra no endereço https://webservice-spring-jpa-heroku.herokuapp.com/users.

Como este projeto está desenvolvido no **Back-End**, a página retornará o conteudo no formato **JSON**, o qual é destinado a ser consumido por requisições do **Front-End**, que irá cuidar do aspecto visual e a formatação adequada com que a informação será apresentada.

Os links abaixo direcionam para o endpoint correspondente a cada entidade disponível.

- [Clientes](https://webservice-spring-jpa-heroku.herokuapp.com/users)
- [Pedidos](https://webservice-spring-jpa-heroku.herokuapp.com/orders)
- [Produtos](https://webservice-spring-jpa-heroku.herokuapp.com/products)
- [Categorias](https://webservice-spring-jpa-heroku.herokuapp.com/categories)

---

<!--## 📂Como testar o projeto no Postman

Esta **API** pode ter toda sua funcionalidade testada através do aplicativo [Postman](https://www.postman.com/) conforme exemplos abaixo.



---
-->

## 📂 Como baixar o projeto

```bash
# Clonar o repositório
$ git clone https://github.com/heliohdd/webservice-springboot2-java11.git

# Entrar no diretório
$ cd webservice-springboot2-java11

# Importar projeto através do STS 4

# Iniciar o projeto clicando com o botão direito no arquivo "WebserviceApplication.java" acionando as opção "Run as" e "Spring Boot App".

```
---

Desenvolvido por Hélio Dourado


<!--# API webservice - Back-End da Plataforma
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
```http://localhost:8080/swagger-ui.html``` -->
