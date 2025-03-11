# Sistema de Gerenciamento de Inventário

Este é um projeto de gerenciamento de inventário desenvolvido em **Spring Boot**. O sistema permite gerenciar categorias, produtos, fornecedores, transações e usuários. Atualmente, estamos na fase de criação das entidades e repositórios.

## Funcionalidades

- **Categoria**: Gerencia categorias de produtos.
- **Produto**: Gerencia produtos, incluindo nome, preço, quantidade e categoria.
- **Fornecedor**: Gerencia fornecedores de produtos.
- **Transação**: Registra transações de entrada e saída de produtos.
- **Usuário**: Gerencia usuários do sistema, com diferentes papéis (roles).

## Tecnologias Utilizadas

- **Spring Boot**: Framework principal para desenvolvimento da aplicação.
- **Spring Data JPA**: Para persistência de dados e repositórios.
- **H2 Database** (ou outro banco de dados): Para armazenamento de dados durante o desenvolvimento.
- **Maven**: Para gerenciamento de dependências.
- **Java 17**: Linguagem de programação utilizada.

## Entidades

### 1. Categoria (`Category`)
- **Descrição**: Representa uma categoria de produtos.
- **Atributos**:
  - `id`: Identificador único.
  - `name`: Nome da categoria.
  - `products`: Lista de produtos associados a esta categoria (relacionamento `OneToMany`).

### 2. Produto (`Product`)
- **Descrição**: Representa um produto no inventário.
- **Atributos**:
  - `id`: Identificador único.
  - `name`: Nome do produto.
  - `price`: Preço do produto.
  - `quantity`: Quantidade em estoque.
  - `category`: Categoria do produto (relacionamento `ManyToOne`).
  - `supplier`: Fornecedor do produto (relacionamento `ManyToOne`).
  - `createdAt`: Data de criação do produto (automática).

### 3. Fornecedor (`Supplier`)
- **Descrição**: Representa um fornecedor de produtos.
- **Atributos**:
  - `id`: Identificador único.
  - `name`: Nome do fornecedor.
  - `contactInfo`: Informações de contato.
  - `products`: Lista de produtos fornecidos (relacionamento `OneToMany`).

### 4. Transação (`Transaction`)
- **Descrição**: Registra transações de entrada e saída de produtos.
- **Atributos**:
  - `id`: Identificador único.
  - `product`: Produto relacionado (relacionamento `ManyToOne`).
  - `quantity`: Quantidade movimentada.
  - `transactionType`: Tipo de transação (ENTRADA ou SAÍDA).
  - `transactionDate`: Data da transação (automática).

### 5. Usuário (`User`)
- **Descrição**: Representa um usuário do sistema.
- **Atributos**:
  - `id`: Identificador único.
  - `username`: Nome de usuário.
  - `password`: Senha do usuário.
  - `role`: Papel do usuário (ADMIN, USER, etc.) usando um `enum`.

## Repositórios

- **`CategoryRepository`**: Repositório para a entidade `Category`.
- **`ProductRepository`**: Repositório para a entidade `Product`.
- **`SupplierRepository`**: Repositório para a entidade `Supplier`.
- **`TransactionRepository`**: Repositório para a entidade `Transaction`.
- **`UserRepository`**: Repositório para a entidade `User`.

## Como Executar o Projeto

### Pré-requisitos
- Java 17 instalado.
- Maven instalado.
- IDE de sua preferência (IntelliJ, Eclipse, etc.).

### Passos para Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/inventory-management.git
   
2. Navegue até o diretório do projeto:
   ```
   cd inventory-management
   
4. Compile o projeto com Maven:
   ```
   mvn clean install
   
6. Execute o projeto:
   ```
   mvn spring-boot:run

8. Acesse a aplicação:
   ```
   Abra o navegador e acesse http://localhost:8080.

      
