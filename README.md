# 🚀 Desafio de Projeto DIO – Infraestrutura na Nuvem com Azure + Java

Este repositório contém a entrega prática do desafio proposto na DIO (Digital Innovation One), aplicando os conhecimentos adquiridos em **computação em nuvem com Azure**, **banco de dados na nuvem** e **desenvolvimento back-end com Java + Spring Boot**.

---

## 📌 Objetivo do Desafio

> Demonstrar, por meio de um projeto prático, a capacidade de utilizar serviços de infraestrutura em nuvem, configurar uma instância de banco de dados na Azure, e desenvolver uma aplicação funcional que se conecte a esse ambiente.

---

## 🧩 Tecnologias e Conceitos Utilizados

- ☁️ **Microsoft Azure**
  - Azure SQL Database
  - (Opcional: Azure App Service ou Azure VM para deploy da aplicação)

- 🔧 **Spring Boot**
  - API RESTful com endpoints de cadastro e listagem de usuários
  - Estrutura organizada por camadas (Controller, Repository, Model)

- 🗃️ **Banco de Dados na Nuvem**
  - SQL Server criado e configurado na Azure
  - Tabela `users` com campos `id`, `name`, `email`

- 🧱 **Maven**
  - Gerenciador de dependências do projeto Java

- ☕ **Java 17**

---

## 📂 Estrutura do Projeto

desafio-infra-azure/
├── README.md
├── app/
│ └── src/main/java/com/dio/azureproject/
│ ├── AzureProjectApplication.java
│ ├── controller/UserController.java
│ ├── model/User.java
│ └── repository/UserRepository.java
│
│ └── resources/
│ └── application.properties
│
├── database/
│ └── schema.sql
└── pom.xml



---

## 💡 Funcionalidades da API

| Método | Endpoint       | Ação                        |
|--------|----------------|-----------------------------|
| GET    | `/users`       | Lista todos os usuários     |
| POST   | `/users`       | Adiciona um novo usuário    |

---

## 🧪 Testando a API

### Requisição `POST /users`

```json
{
  "name": "João da Silva",
  "email": "joao@email.com"
}


Resposta esperada:
Copiar
Editar
Usuário adicionado!

 Como Executar o Projeto Localmente
1. Clone o repositório:
bash
Copiar
Editar
git clone https://github.com/seu-usuario/desafio-infra-azure.git
cd desafio-infra-azure/app
2. Configure o banco de dados:
Crie um banco de dados SQL Server no Portal Azure

Acesse o painel do banco e permita seu IP no firewall

Copie o nome do servidor e as credenciais

3. Configure o application.properties
No caminho src/main/resources/, insira os dados do banco:

properties
Copiar
Editar
spring.datasource.url=jdbc:sqlserver://<SEU_SERVIDOR>.database.windows.net:1433;database=desafio-db;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;
spring.datasource.username=sqladmin
spring.datasource.password=SuaSenha123!
spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
4. Compile e execute:
bash
Copiar
Editar
mvn clean install
mvn spring-boot:run
## 🧱 SQL: Criação da Tabela
Arquivo: database/schema.sql

sql
Copiar
Editar
CREATE TABLE users (
    id INT PRIMARY KEY IDENTITY(1,1),
    name NVARCHAR(100) NOT NULL,
    email NVARCHAR(100) NOT NULL
);
## ✅ Como esse projeto atende ao desafio da DIO
Requisito DIO	Implementação
Computação em nuvem	Uso do Azure SQL e possibilidade de deploy no App Service
Instância de banco na nuvem	Banco SQL Server criado e integrado com a aplicação
Conhecimento técnico em nuvem e backend	Projeto Java completo com conexão à nuvem
Estrutura profissional	Código organizado, camadas separadas, README explicativo
GitHub como portfólio	Repositório público com documentação e instruções claras

## 🔗 Links úteis
Portal Microsoft Azure

Documentação Spring Boot

Guia para Azure SQL Database

## ✨ Contribuição
Este projeto foi desenvolvido como parte da minha jornada na DIO para aprender e aplicar conceitos modernos de cloud computing com Java e Azure.

##🧑‍💻 Autor

Marcus Vinicius