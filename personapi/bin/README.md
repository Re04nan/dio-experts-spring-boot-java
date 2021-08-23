<h1>Digital Innovation One - Bootcamp GFT</h1>

API para gerenciamento de pessoas.

<h3>Para executar o projeto no terminal, digite:</h3>

```shell script
mvn spring-boot:run 
```

<h3>Após executar o comando acima, acessar o endereço para visualizar o projeto:</h3>

```
http://localhost:8080/api/v1/people
```
<h3>Caminho específico: </h3>

```
http://localhost:8080/api/v1/people/{id}
```
<h2>Métodos:</h2>

```
  POST - para inserir registro, não é necessário o campo id
  
  GET - para buscar um registro específico passar o id
  
  PUT - atualizar um registro passando o id
  
  DELETE - necessário informar o id
```

Propriedades:

``` json
  {
    "id" : ,
    "firstName" : "Renan",
    "lastName" : "Marques",
    "cpf" : "286.769.800-63",
    "birthDate" : "04-05-1996",
    "phones" : [
        {
            "id" : ,
            "type" : "MOBILE",
            "number" : "5511901010001"
        }
    ]
}
```

- Regras para cada campo:
  - firstName min = 3 | max = 100 caracteres e não pode ser vazio.
  - lastName min = 3 | max = 100 caracteres e não pode ser vazio.
  - cpf não pode ser vazio e deve seguir um padrão real de cpf.
  - birthDate deve ser uma data com dia, mês e ano.
  - phones:
    - type deve seguir o padrão informado nessa doc "Types para phones".
    - number min = 13 | max = 14 caracteres númericos e não pode ser vazio.

Types para phones:

```
  HOME
  MOBILE
  COMMERCIAL
```

<h3>Link da API hospedada em nuvem:</h3>
https://personapi-practice.herokuapp.com/api/v1/people/

<h3>Versões e ferramentas utilizadas:</h3>

- Java 11 ou superior
- Postman
- Heroku para hospedagem
