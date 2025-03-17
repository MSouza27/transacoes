# API de Transações Financeiras

## Descrição
Este projeto é uma API REST desenvolvida com **Java + Spring Boot** para o gerenciamento de transações financeiras. A API permite adicionar transações, limpar registros e obter estatísticas como soma, média, mínimo e máximo dos valores transacionados.

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Web
- Jakarta Validation
- API REST

## Funcionalidades
✅ Cadastro de transações financeiras
✅ Exclusão de transações registradas
✅ Cálculo de estatísticas sobre os valores registrados
✅ Validação de dados com Jakarta Validation

## Como Executar o Projeto
1. **Clone o repositório**:
   ```bash
   git clone https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git
   cd SEU-REPOSITORIO
   ```

2. **Execute a aplicação com Maven**:
   ```bash
   mvn spring-boot:run
   ```

3. **A API estará disponível em**: `http://localhost:8080`

## Endpoints
### Criar Transação
`POST /transacao`
```json
{
  "valor": 100.50,
  "dataHora": "2025-03-03T21:20:10.789-03:00"
}
```
**Respostas:**
- `201 Created` se a transação for registrada com sucesso.
- `422 Unprocessable Entity` se o valor for negativo ou a data for no futuro.

### Apagar Transações
`DELETE /transacao`
**Respostas:**
- `200 OK` se todas as transações forem removidas.

### Obter Estatísticas
`GET /estatistica`
**Resposta Exemplo:**
```json
{
  "quantidade": 5,
  "soma": 500.00,
  "media": 100.00,
  "minimo": 50.00,
  "maximo": 150.00
}
```
**Respostas:**
- `200 OK` retorna estatísticas das transações registradas.

## Estrutura do Projeto
```
src/
├── main/
│   ├── java/br/com/desafio/itau/springboot/
│   │   ├── controller/     # Controllers REST
│   │   ├── dto/            # Data Transfer Objects (DTOs)
│   │   ├── model/          # Entidades do sistema
│   │   ├── service/        # Regras de negócio
│   ├── resources/
│       ├── application.properties # Configuração do Spring Boot
```

## Melhorias Futuras
🚀 Implementação de um banco de dados para persistência das transações
🚀 Testes unitários e de integração
🚀 Paginação para listagem de transações

## Contribuição
Sinta-se à vontade para contribuir com melhorias! Basta abrir um **Pull Request** ou relatar um problema na aba **Issues**.

## Autor
👨‍💻 **Magno Souza dos Santos**  
🔗 [LinkedIn](https://www.linkedin.com/in/magno-souza-dos-santos)  
🔗 [GitHub](https://www.github.com/MSouza27)

