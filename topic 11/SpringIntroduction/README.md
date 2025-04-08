# Spring

## Terminologia

### Spring Framework

Framework java que fornece suporte para o desenvolvimento de aplicações.

### Spring Boot

Framework construido em cima do Spring Framework simplificando a configuração e desenvolvimento, fornecendo:

- Configuração automatica
- Servidor embutido
- Dependencias pré configuradas

### Beans

Objeto gerenciado pelo container do Spring, que define metadados da aplicação, sendo configurado com XML, Java annotations, ou codigo em java.

### IOC - Inversion of Controll

Principio de inversão de controles, assim a aplicação spring container gerencia o ciclo de vida das Beans e injeta as dependencias.

### Dependency injections

São as dependencias em si que são gerenciadas e injetadas pelo Spring Container entre as beans.

### Container

Parte principal do Spring Framwork que gerencia cada bean e suas dependencias.

### ApplicationContext

Implementação do container carregando e gerenciando as beans.

### AOP - Aspect-Oriented Programming 

Topico sobre separação preocupações com cross-cutting concerns do codigo principal.

### Events

Spring permite a comunicação entre as beans por meio de events, diminuindo acoplamento entre as beans

### Application Event and Listener

Modelo de publish subscrable e event handle provido pelo Spring, ApplicationEvent define os objetos e o ApplicationListerner implementa as interfaces que definem o comportamento do evento e tomada de ação.

### Data Access 

Spring disponibiliza diversos frameworks integrados de dados e acesos de dados como JDBC e Hibernate

### Transactions 

Suporte a gerenciamento de transactions, assim como no data access, com diferentes frameworks.

### Task Execution e Scheduling
Spring prove taskExecutor e taskScheduler para executar as tasks.


## Architeture

A arquitetura do spring boot é em camadas, cada uma se comunicando com a camada inferior, sendo formado de quatro camadas.

- **Camada de Apresentação**: gerencia as requisions HTTP, Transações em json para parametros em objeto, authentica as requisições e envia para camada de negocios (Business Layer).

- **Camada de negocio**: Gerencia todas as logicas de negocio do projeto. Concistindo em servicos de classes e serviços utilitarios para a camada de dados, tambem performando autenticação e autorização.

- **Camada de percistencia**: Contem a logica de armazenamento, convertendo os objetos de negocio para o tipo de dado a ser armazenado.

- **Camada de banco de dados**: Executa as operações de armazenamento CRUD.ç=


## Explicação da utilização de Spring Boot

A utilização de spring tem base em suas features que faz seu desenvolvimento ser facilitado ao criar uma aplicação "spring-based application", sendo estas funcionalidades:

- Embedded Application Server
- Automatic Configuration
- Pre-configuration Starter
- Ease of Packaging and Dsitribuition
- Ease to monitoring through build-in halth chen end points and constumes that managment