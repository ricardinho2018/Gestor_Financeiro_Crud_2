
# 💰 Gestor Financeiro

Aplicação web de gestão financeira desenvolvida em **Java e Spring Boot**, permitindo gerir receitas e despesas através de uma interface web.

O projeto implementa operações CRUD, persistência de dados e um dashboard financeiro com cálculo do saldo.

## 🚀 Funcionalidades

* 📊 Dashboard financeiro
* 💰 Gestão de receitas
* 💸 Gestão de despesas
* ➕ Criar receitas e despesas
* ✏️ Editar receitas e despesas
* 🗑️ Eliminar receitas e despesas
* 📋 Listar receitas e despesas
* 💾 Persistência de dados
* 🧮 Cálculo do saldo financeiro
* 🌐 Interface web com Thymeleaf

## 🛠️ Tecnologias

* **Java 17**
* **Spring Boot**
* **Spring MVC**
* **Spring Data JPA**
* **Thymeleaf**
* **H2 Database**
* **Maven**
* **HTML / CSS**
* **Bootstrap**
* **Git / GitHub**

## 🏗️ Arquitetura

O projeto segue uma estrutura baseada no padrão **MVC (Model-View-Controller)**:

```text
src/main/java/com/example/gestorfinanceiro/
├── controller/
├── model/
└── repository/
```

As páginas HTML são implementadas com Thymeleaf:

```text
src/main/resources/templates/
├── despesas/
├── receitas/
└── dashboard.html
```

## 📊 Dashboard

O dashboard apresenta um resumo da situação financeira:

* Total de receitas
* Total de despesas
* Saldo

O saldo é calculado através de:

```text
Saldo = Total de Receitas - Total de Despesas
```

## 🗄️ Base de dados

O projeto utiliza **H2 Database**.

A base de dados está configurada para utilizar armazenamento em ficheiro, permitindo manter os dados depois de reiniciar a aplicação.

A base de dados é armazenada localmente em:

```text
data/
```

A pasta da base de dados não é enviada para o GitHub através do `.gitignore`.

## ⚙️ Pré-requisitos

Para executar o projeto é necessário ter instalado:

* Java 17
* Maven
* Git

Não é necessário instalar MySQL para executar a configuração atual do projeto.

## ▶️ Como executar

Clonar o repositório:

```bash
git clone https://github.com/ricardinho2018/Gestor_Financeiro_Crud_2.git
```

Entrar na pasta:

```bash
cd Gestor_Financeiro_Crud_2
```

Executar a aplicação:

```bash
mvn spring-boot:run
```

Também é possível executar a classe principal diretamente através do IntelliJ IDEA:

```text
GestorFinanceiroApplication
```

Depois de iniciar a aplicação, abrir:

```text
http://localhost:8080
```

## 🔮 Melhorias futuras

* [ ] Filtro por mês
* [ ] Filtro por data
* [ ] Gráficos financeiros
* [ ] Categorias de receitas e despesas
* [ ] Validação dos formulários
* [ ] Autenticação de utilizadores
* [ ] Spring Security
* [ ] Exportação de dados
* [ ] Migração para PostgreSQL
* [ ] Deploy em produção

## 👨‍💻 Autor

**Ricardo Peixoto**

Projeto desenvolvido para aprendizagem e prática de desenvolvimento de aplicações web com **Java, Spring Boot, JPA e Thymeleaf**.
