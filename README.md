## Github Repository

Clone: https://github.com/paullohdiniz/insurance-system.git

## Tecnologias utilizadas

- Java OpenJDK 24 
- Maven 
- Spring Boot 3.5.0

## Build/Run

mvn clean install -U

###  - Terminal para Run / Ou use o docker para criar container
mvn spring-boot:run

## Banco de dados

Uso do H2 para efeito de validação da arquitetura de regra de negócio

Link: http://localhost:8080/h2-console
User: root
Pass: root

## Doc Swagger

Link: http://localhost:8080/swagger-ui/index.html

## Detalhe Swagger

- POST
- 
Exemplo de JSON:
```json  

{
	"nome": "Fulano de tal",
	"cpf": "270.264.820-76",
	"telefone": "(11) 99999-9999",
	"rua": "Rua do Lazer",
	"numero":"161",
	"cep": "01211-000"
}

```
- GET: todos os clientes cadastrados: "http://localhost:8080/api/clientes"

- GET: um cliente pelo CPF: "http://localhost:8080/api/clientes/{cpf}"

- DELETE: deleta um cliente pelo CPF: "http://localhost:8080/api/clientes/{cpf}"

- PUT: altera um cliente pelo CPF: "http://localhost:8080/api/clientes/{cpf}"

Exemplo de JSON:
```json  

{
  "nome": "Fulano de tal",
  "cpf": "270.264.820-76",
  "telefone": "(11) 11111-1111",
  "rua": "Rua do Lazer",
  "numero":"161",
  "cep": "01211-000"
}

```
- POST Cadastra um emprestimo para um cliente (Obrigatorio passar um CPF de um cliente já cadastrado como parametro e atributo relacionamento só permite valor de "Ouro", "Prata" e "Bronze"): "http://localhost:8080/api/v1/empresa/clientes/:cliente/emprestimos"

Exemplo de JSON:
```json  

{
	"valorInicial": "10",
	"relacionamento": "Ouro",
	"dataInicial": "2022-01-23",
	"dataFinal":"2022-02-15"
}

```

- GET Retorna todos os emprestimos de um cliente pelo CPF (Obrigatorio passar um CPF de um cliente já cadastrado como parametro): "http://localhost:8080/api/v1/empresa/clientes/:cpf/emprestimos"

- GET Retorna um emprestimo especifico para um cliente pelo CPF e ID (Obrigatorio passar um CPF de um cliente já cadastrado e um Id de algum emprestimo relacionado ao cliete como parametros):"http://localhost:8080/api/v1/empresa/clientes/:cpf/emprestimos/:id"




