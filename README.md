<h1 align="center">
 API User registration
</h1>

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Tfonseca200/API_user-registration/blob/main/LISENSE) 

<br>

## Sobre o Projeto

Este projeto é uma aplicação de gerenciamento de usuários que oferece as principais operações CRUD (Create, Read, Update, Delete) para gerenciar informações de usuários. Desenvolvido em Java com Spring Boot, o projeto utiliza Docker Compose para configurar o MySQL e Bean Validation para validar os dados de entrada.

A aplicação fornece uma API RESTful para as seguintes funcionalidades:

- **Create User**: Adiciona um novo usuário ao sistema.
- **Get One User**: Recupera as informações de um usuário específico.
- **Get All Users**: Obtém uma lista de todos os usuários cadastrados.
- **Update User**: Atualiza as informações de um usuário existente.
- **Delete User**: Remove um usuário do sistema.

<br>

## Tecnologias Utilizadas🌐

### Back-end

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Web**
- **Bean Validation**

### Banco de Dados

- **MySQL**
- **Docker Compose**

<br>

## Como Executar a API

Para executar a API do projeto de gerenciamento de usuários, siga os passos abaixo:

### 1. Clone o Repositório

Clone o repositório do projeto para sua máquina local:

```bash
git clone <URL_DO_REPOSITORIO>
cd <NOME_DO_REPOSITORIO>
```

### 2. Configure o Docker e MySQL

Certifique-se de que o Docker e o Docker Compose estão instalados na sua máquina. Se ainda não estiverem instalados, você pode baixá-los e instalá-los a partir dos seguintes links:

- [Docker](https://www.docker.com/products/docker-desktop/)

- [Docker-compose](https://docs.docker.com/compose/install/)

Depois de instalar o Docker e o Docker Compose, execute o Docker Compose para iniciar o contêiner MySQL:

### 3. Execute a Aplicação Spring Boot

Com o Docker e o MySQL em execução, você pode iniciar a aplicação Spring Boot. Para isso você precisar está localizado na pasta do projeto e executar o comando abaixo:

```bash
./mvnw spring-boot:run
```

Este comando usa o Maven Wrapper para construir e executar a aplicação. Se você já tem o Maven instalado, pode usar:

```bash
mvn spring-boot:run
```

### 4. Acesse a API

   Após iniciar a aplicação, a API estará disponível em http://localhost:8080. Você pode utilizar ferramentas como Postman ou cURL para interagir com os endpoints da API.

<br>

# Autor

Thiago Fonseca Claudino

Linkedin: https://www.linkedin.com/in/thiago-fonseca-tech/
