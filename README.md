
# API de Armazenamento de Produtos – Spring Boot  

Esta API foi desenvolvida com **Spring Boot** para gerenciar um CRUD de produtos, permitindo operações de criação, leitura, atualização e exclusão.  

## 🛠️ Tecnologias Utilizadas  
- **Java 17+** – Linguagem de programação  
- **Spring Boot** – Framework para desenvolvimento da API  
- **Spring Data JPA** – Gerenciamento de persistência  
- **PostgreSQL** – Banco de dados relacional  
- **Swagger/OpenAPI** – Documentação da API  
- **Docker** – Containerização da aplicação  

##  Funcionalidades  
✅ **Criar produtos** – Adicionar novos produtos ao estoque  
✅ **Listar produtos** – Retornar todos os produtos cadastrados  
✅ **Buscar produto por ID** – Obter informações detalhadas de um produto  
✅ **Atualizar produto** – Modificar dados de um produto existente  
✅ **Excluir produto** – Remover produtos do sistema  

##  Estrutura do Projeto  
```
src/
│── main/
│   ├── java/com/seuprojeto/api/
│   │   ├── controller/       # Controladores da API  
│   │   ├── service/          # Lógica de negócio  
│   │   ├── repository/       # Camada de persistência  
│   │   ├── model/            # Modelos das entidades  
│   │   ├── config/           # Configurações do Spring Boot  
│   ├── resources/
│   │   ├── application.properties  # Configurações da aplicação  
│── test/                     # Testes unitários e de integração  
```

##  Como Rodar a API  

### Clone o repositório  
```bash
git clone https://github.com/phedrohenrick/spring-crud-produtos.git
cd spring-crud-produtos
```

### Configure o PostgreSQL  
Edite o arquivo `application.properties` para ajustar a configuração do banco:  
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seubanco
spring.datasource.username=seuusuario
spring.datasource.password=suasenha
spring.jpa.hibernate.ddl-auto=update
```

### Execute o projeto  
```bash
mvn spring-boot:run
```

### Teste a API com Swagger  
Após rodar a aplicação, acesse a documentação no navegador:  
 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)  

## 🛠 Endpoints da API  

| Método | Endpoint       | Descrição                     |
|--------|--------------|-----------------------------|
| **POST**   | `/produtos` | Cadastrar um novo produto  |
| **GET**    | `/produtos` | Listar todos os produtos  |
| **GET**    | `/produtos/{id}` | Buscar produto por ID |
| **PUT**    | `/produtos/{id}` | Atualizar um produto  |
| **DELETE** | `/produtos/{id}` | Excluir um produto    |

##  Docker (Opcional)  
Para rodar com Docker, utilize:  
```bash
docker-compose up -d
```

## Contato  
 Email: pherohenrickdasilva@gmail.com
 GitHub: [phedrohenrick](https://github.com/phedrohenrick)  
 LinkedIn: [Seu Perfil]([https://linkedin.com/in/phedrohenrick](https://www.linkedin.com/in/phedro-henrick-da-silva-le%C3%A3o-b13b96234/)  

---

Esse README melhora a apresentação e facilita o uso da sua API. Precisa de alguma personalização extra? 🚀
