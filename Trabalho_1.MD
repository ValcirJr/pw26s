## TRABALHO 1

1) Criar um projeto simples, como fizemos na aula de SOLID, com um service que crie um receituário médico, passando para um método uma lista de doenças, cada doença deve listar os cuidados mínimos (ex: beber bastante água) e uma lista de médicamentos.
O Receituário deve possuír também o nome do paciente, e dias de atestado. Deve-se calcular quando será o dia do fim do atestado.

- Deve possuir pelo menos 3 camadas: model, repository e service
- Deve salvar cada receituário no banco h2. Caso precise da configuração pode copiar desse projeto no application.properties
- Usar o JPA para tratar as entidades
- Salvar o projeto no git e me enviar o link por e-mail
- Criar uma simulação de uso do service na classe main do projeto ou uma classe de teste para o mesmo!


Ideia geral do projeto será avaliar o nível em que cada se encontra de programação, levando em conta o que aprendemos até agora.
Pois quero saber como vou estruturar as aulas de service que entraremos na próxima semana.

<b>Valor: 1 pt.</b>

* Entrega: até dia 27/10 23:59

## TRABALHO 2

SERVIDOR - CRUD.
-	Criar a camada model. Deve possuir: uma correlação ManyToMany (Receituario, Doecna, ReceituarioDoenca ou ManyToMany  Spring)), 3 tipo de objeto
-	Criar camada repository com JPA
-	Criar a camada service
-	Criar camada controller
-	Fazer CORS config
-	Fazer securiy. (em aberto)

OBS: Testar com postman

Entrega 19/11/2021 23:59
valor: 2pt