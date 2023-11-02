<h1 align="center">DM105 - Rest | Web Client for Spotify</h1>

---

## ❓ Sobre o projeto

Este projeto da disciplina DM105 (Conceituação e projeto de WebServices e interface de serviço em Java: SOAP e REST) tem como objetivo criar um web client para consumir a API do [Spotify](https://developer.spotify.com/documentation/web-api).

Para isso, foi gerado um client em Java com base no Swagger do **[Spotify.yaml](https://github.com/sonallux/spotify-web-api/blob/main/fixed-spotify-open-api.yml)**.

No projeto criado pelo [Editor do Swagger](https://editor.swagger.io/), foi adicionado a classe **[AlbumsApiClient.java](src/main/java/io/swagger/client/AlbumsApiClient.java)** para simular o consumo da API do Spotify.

---

## 💻 Tecnologias

As seguintes tecnologias foram utilizadas na construção do projeto:

- **[Java 8](https://www.java.com/pt-BR/)**
- **[Maven](https://maven.apache.org/)**
- **[Swagger](https://swagger.io/)**

> Para mais detalhes, veja o arquivo  **[pom.xml](pom.xml)**

### Utilitários
- IDE: **[IntelliJ Community](https://www.jetbrains.com/pt-br/idea/download/#section=windows)**

---
## ⚙️ Como executar o projeto

### 💡 Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
**[Git](https://git-scm.com)** e **[Java 8](https://www.java.com/pt-BR/)**;

```bash

# Clone este repositório
$ git clone https://github.com/Brendhon/dm105-rest.git

# Acesse a pasta do projeto

# Limpe o projeto e baixe as dependências
$ mvn clean install

```

É necessário também ter uma conta no **[Spotify](https://developer.spotify.com/dashboard/login)** e criar um projeto para obter o **Client ID** e **Client Secret**.


Apos isso, faça uma requisição **POST** para o endpoint **/api/token** para obter o **access_token**.

```bash
curl -X POST "https://accounts.spotify.com/api/token" -H "Content-Type: application/x-www-form-urlencoded" -d"grant_type=client_credentials&client_id=CLIENT_ID&client_secret=CLIENT_SECRET"
```

Onde **CLIENT_ID** e **CLIENT_SECRET** são os valores obtidos no Spotify.

Com o **access_token** em mãos, atualize o arquivo **[AlbumsApiClient.java](src/main/java/io/swagger/client/AlbumsApiClient.java)** com o valor obtido.

```java
String accessToken = "access_token";
```

O resultado será armazenado no arquivo **[RESULTADO_ALBUNS.json](RESULTADO_ALBUNS.json)**.

---


## 👥 Autor
<h4 align="left">
<img style="border-radius: 5%; margin-right: 30px" src="https://avatars.githubusercontent.com/Brendhon" width="120px;" alt="Avatar"/><br>
Brendhon Moreira
</h4>


[![Linkedin Badge](https://img.shields.io/badge/-Brendhon-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/brendhon-moreira)](https://www.linkedin.com/in/brendhon-moreira)
[![Gmail Badge](https://img.shields.io/badge/-brendhon.e.c.m@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:brendhon.e.c.m@gmail.com)](mailto:brendhon.e.c.m@gmail.com)

---
## 📝 License
[![License](https://img.shields.io/github/license/Brendhon/Pokedex?style=plastic)](http://badges.mit-license.org)

- **[MIT license](https://choosealicense.com/licenses/mit/)**
