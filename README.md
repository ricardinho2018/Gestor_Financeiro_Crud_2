# 💰 Gestor Financeiro

Aplicação web para gestão de receitas e despesas, desenvolvida em Java com Spring Boot.

O projeto permite registar, consultar, editar e eliminar receitas e despesas, apresentando também um dashboard com o resumo financeiro.

## 🚀 Funcionalidades

- 📊 Dashboard financeiro
- 💰 Gestão de receitas
- 💸 Gestão de despesas
- ➕ Criar receitas e despesas
- ✏️ Editar receitas e despesas
- 🗑️ Eliminar receitas e despesas
- 📋 Listagem de receitas e despesas
- 💾 Persistência de dados
- 🌐 Interface web com Thymeleaf
- 📈 Cálculo do saldo financeiro

## 🛠️ Tecnologias

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- H2 Database
- Maven
- HTML
- CSS
- Bootstrap
- Git
- GitHub

## 🏗️ Estrutura do projeto

```text
src/
└── main/
    ├── java/
    │   └── com/example/gestorfinanceiro/
    │       ├── controller/
    │       ├── model/
    │       └── repository/
    │
    └── resources/
        ├── templates/
        │   ├── despesas/
        │   ├── receitas/
        │   └── dashboard.html
        │
        └── application.properties
