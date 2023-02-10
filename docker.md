#  Docker - Guia Rápido

Site oficial:

* https://www.docker.com/

Imagens:

* https://hub.docker.com/


## Principais Comandos


### 1) Verificar instalação:

```bash
docker run helllo-world
```

###  2) Baixar imagens:

```bash
docker pull [nome_imagem]
```

Ex:
* PostgreSQL/pgadmin4
* Redis
* MongoDB
* Neo4j
* Cassandra
* E etc.

###  3) Listar imagens disponíveis:

```bash
docker images
```

###  4) Listar redes

```bash
docker network ls
```

### 5) Exibir informações de uma rede docker:

```bash
docker network inspect [nome_rede]
```

### 6) Iniciar um nome container:

```bash
docker run [nome_imagem]
```

###  7) Listar todos os containers:

```bash
docker container ls
```

### 8) Iniciar um container que estava parado:

```bash
docker start [nome_container]
```
### 9) Parar a execução de um container:

```bash
docker stop [nome_container]
```

### 10) Remover um container:

```bash
docker rm [nome_container]
```