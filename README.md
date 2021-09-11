# Técnicas de Programação Avançada - PUC Minas Barreiro

Integrantes do Grupo:
 - Rodolfo Soares 
 - Neemias Souza
 - 

Essa é uma demonstração prática 

## Pré Requisitos

- Docker instalado e configurado; 

---
### How to

- Abra o terminal na pasta ```local``` do projeto
- Execute o comando ````start_resources.sh````
- O comando irá subir uma imagem docker do RabbitMQ, que ficará exposta na porta 15672
- Acesse http://localhost:15672
- Faça o login com ````guest```` na senha e username.
- Acesse a aba ````Queues```` -> Add a new queue
- Cole no campo name o seguinte : ````filaDeEventos````
- Clique em ````Add queue````
- Execute a aplicação com este comando: ```mvn spring-boot:run```

---
###Aplicação

A aplicação publica eventos que são processados por meio do RabbitMQ, um framework de mensageria.
Ao abrirmos a fila, é possível ver os gráficos sendo atualizados em tempo real, que indicam a atuaçao da fila.
No terminal em que rodou a aplicação, o console irá criar um log toda vez que um evento or criado ou processado e, de tempos em tempos, quantos eventos foram processados no total.



