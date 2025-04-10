# Spring Core

### Inicialização do projeto em Spring Boot 
Ao Executar o Spring boot em uma IDE não especializada em java é necessario baixar um pacote basico com os as informações pré "settadas".

Download do Pré setup de spring boot > [Spring Initializr](https://start.spring.io/)

## Configuration

Configuração se refere ao processo de configurar o Spring Framework. Estas configurações são das Beans, dependencias, configurações de AOC, entre outros. 

### Configuração de .properties para cada ambiente

- Dev
- Stading
- Producion

Estas properties ficam localizadas no caminho `/src/main/java/resources/`

Estas configurações de aplicação tambem podem ser feitas em `.yml`

### Configuração de dependencias com Gradle é feita no arquivo **build.gradle**

Estas dependencias podem ser baixadas do Maven Central, JCenter ou repositorios locais

## Dependency Injection

Classico injeção de dependencia.

Em Java Spring boot a injeção de dependencia é gerenciada pelo proprio Spring.

Sendo so tipos de injeção:

- Por Construtor;
- Por Setter;
- Por Field;

## Spring IOC

Ao ter utilizar IOC em Spring boot o gerenciamento de depencias é escaneado automaticamente pelo Spring, assim busca por classes annotadas por `@Component`, `@Service`, `@Repository` e `@Controller` no pacote base e registra como Beans no Conteiner IOC

## Spring AOP

Aspect-Oriented Programming é um modulo Spring Framework que permite separar preocupações transversais do codigo principal da aplicação. 

Essas funcinalidades extraidas do codigo principal podendo ser logging, segurança, transações, monitoramento..

Conceitos principais:

- Aspect: Modulo que encapsula preocupação -> contem codigo que será aplicado em codigo principal
- Join point: Localização do codigo onde aspects são aplicados, geralmente modulos em Spring
- Advice: ação que sera executada em um Join point, ele define o aspect fará e quando será executado
    
    Tipos de Advice:
    
    - Before -> Executado antes do metodo  
    - After -> Executado depois do metodo
    - After Retunring -> Executado apos returno de valor
    - After Throing -> Executado caso exceção
    - Around -> Executa antes e depois do metodo

- Pointcut:  Definição de quais Join point seram usados por determinado aspects e quais addvice será aplicado

- Weaving: Aplicação de Aspectos no codigo principal, executado em runtime usando proxies dinamicos.

## Spring MVC

## Annotations

## Spring Bean Scope

Ao Criar componentes em Beans é possivel gerenciar os escopos de acesso utilizado no projeto;

Utilizando os Annotations de `@Scope("")`, essa annotation pode ter os seguintes parametros para definir o escopo da injeção de dependencia;

- `singleton`: -> sendo o padrão utilizando um objeto para todas as requisições dessa classe;
- `prototype`: -> sendo a criação de uma instancia para cada solicitação
- `request`: -> criação de uma instancia por requisição http (web app)
- `session`: -> criação de uma instancia por sessão http (web app não servless)

