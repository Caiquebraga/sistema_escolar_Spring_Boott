# Sistema Escolar com Microserviços usando Java Spring Boot

Este é um projeto de um **Sistema Escolar** desenvolvido em **Java Spring Boot**, com uma arquitetura baseada em **microserviços**. O objetivo do sistema é gerenciar informações escolares, como alunos, turmas, professores e notas, de forma eficiente e escalável. Além disso, o projeto utiliza **Kafka** para comunicação assíncrona entre os serviços.

## 🎯 Objetivos do Projeto

- Construir um sistema escolar modular e escalável.
- Adotar arquitetura de microserviços para permitir a separação de responsabilidades.
- Implementar comunicação entre serviços usando **Apache Kafka**.
- Garantir que o sistema seja seguro e eficiente para usuários finais.

---

## 🛠️ Tecnologias Utilizadas

As principais tecnologias e ferramentas utilizadas neste projeto são:

### **Back-end**
- **Java**: Linguagem de programação principal do projeto.
- **Spring Boot**: Framework para simplificar a criação de APIs REST e microserviços.
- **Spring Data JPA**: Para gerenciar operações de banco de dados.
- **Hibernate**: Implementação ORM para interagir com o banco de dados.
- **Spring Security**: Para autenticação e autorização.
- **Apache Kafka**: Para comunicação assíncrona entre microserviços.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **MySQL**: Banco de dados principal em produção.

### **DevOps e Integração Contínua**
- **Docker**: Para containerização dos microserviços.
- **Kubernetes**: Para orquestração de contêineres em produção.
- **Jenkins**: Para automação de CI/CD.
- **Swagger/OpenAPI**: Documentação automática das APIs REST.

### **Outras Ferramentas**
- **Postman**: Para testes das APIs.
- **IntelliJ IDEA**: IDE para desenvolvimento.
- **Git**: Controle de versão.

---

## 📚 Estrutura do Projeto

O sistema está dividido em múltiplos microserviços, cada um responsável por uma funcionalidade específica:

- **Serviço de Alunos**:
  - Cadastro, edição e remoção de alunos.
  - Consultas por nome, ID ou turma.

- **Serviço de Turmas**:
  - Gerenciamento de turmas.
  - Atribuição de alunos a turmas.

- **Serviço de Professores**:
  - Cadastro e gerenciamento de professores.
  - Alocação de professores às turmas.

- **Serviço de Comunicação**:
  - Envio de notificações e mensagens entre usuários.
  - Utiliza **Kafka** para troca de mensagens.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

Certifique-se de ter instalado:

- **Java 17** ou superior
- **Maven** (para gerenciamento de dependências)
- **Docker** (para execução dos contêineres)
- **Kafka** (servidor Kafka configurado)

### Passo a passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/Caiquebraga/sistema_escolar_Spring_Boott.git
   cd sistema_escolar_Spring_Boott
