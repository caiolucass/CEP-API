# CEP-API

Um teste aplicado pela startup Wine, afim de que fosse desenvolvido uma API de CEP. Onde nao podem haver cidades com a mesma faixa de Cep de outras cidades.

### Ferramentas utilizdas

> Spring Boot + JPA + MySql que não apenas consulta CEPs mas cadastra e exclui.

É necessário ter o banco MySql instalado bem como a senha definida como "Ca@604365" (sem aspas) para o usuário "root", o usuário da conexão.

### Instruções para o uso da API

> POST: http://localhost:8080/api/cep/cadastrarCep -> Cadastra nova Faixa de CEP

> DELETE: http://localhost:8080/api/cep/{id} -> Delela uma faixa de CEP. Necessario informar o id do CEP desejado!

> GET: http://localhost:8080/api/cep/{id} -> Retorna uma faixa de CEP. Necessario informar o id do CEP desejado!

> GET: http://localhost:8080/api/cep/ceps -> Retorna uma lista de faixas de CEP cdastradas.

### Observação

Todas as requisicoes podem ser testadas via Postman (https://www.postman.com/)
