## Endpoints
1. Listar Clientes
   
URL: /clientes

Método: GET

Descrição: Retorna a lista de todos os clientes cadastrados.

Exemplo de Resposta:
```
[
  {
    "id": 1,
    "nome": "João Silva",
    "email": "joao.silva@itau.com"
  },
  {
    "id": 2,
    "nome": "Maria Oliveira",
    "email": "maria.oliveira@itau.com"
  }
]
```

2. Cadastrar Cliente

URL: /clientes

Método: POST

Descrição: Cadastra um novo cliente.

Body (JSON):
```
{
  "nome": "Carlos Souza",
  "email": "carlos.souza@itau.com"
}
```

Exemplo de Resposta:
```
{
  "id": 3,
  "nome": "Carlos Souza"
}
```