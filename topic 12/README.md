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

Padão de aplicação Model View Controller dentro do java.

Divisão:

- Model: Objetos Java pojo's ou entidades JPA
- View: Paginas HTML, JSP, Thymeleaf, ou outro mecanismo de view
- Controller: Interfaces anotadas com `@Controller` ou `@RestController`

### Estrutura base 

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── demo/
│   │               ├── DemoApplication.java
│   │               ├── controller/
│   │               │   └── HomeController.java
│   │               ├── model/
│   │               │   └── User.java
│   │               └── service/
│   │                   └── UserService.java
│   └── resources/
│       ├── application.properties
│       ├── static/
│       │   └── css/
│       │       └── styles.css
│       └── templates/
│           └── home.html
```

## Annotations

Tipos diferentes de anotação:

- **Configuração**:
    - `@SpringBootApplication`: combinação de anotações que marca classe principal da aplicação.
    - `@Configuration`: Classe contem definição de Beans e configurações.
    - `@EnableAutoConfiguration`: Configuração automatica do Spring Boot.
    - `@ComponentScan`: Anotação que habilita escaneamento de anotações de **component**, **service** e **repository**.

- **Component**:
    - `@Component`: Classe Bean gerenciada pelo Spring.
    - `@Service`: Bean especializada em logica de negocio.
    - `@Repository`: Bean especializada em acesso a dados.
    - `@Controller`: Bean especializada em requisições http que retornam views.
    - `@RestController`: Combinação entre anotação de **@Controller** e **@ResponseBody** para retorno de dados.

- **Dependency Injection**: 
    - `@Autowired`: Injeta automaticamente dependencia ao campo, Construtor ou Método.
    - `@Qualifier`: Especifica qual Bean deve ser injetado na dependencia (casos de interfaces)
    - `@Primary`: Especificada na Bean para selecionar como bean principal para ser injetada como dependencia.

- **Web e MVC**:
    - `@RequestMapping()`: Mapeia classe ou metodo para algum path
    - @ Get/Post/Put/Delete/Patch + Mapping: mapeamento de Tipo de requisição
    - `@RequestParam`: Injeta parametro de requisição no metodo.
    - `@RequestBody`: Injeta corpo de requisição no metodo.
    - `@PathVariable`: Injeta variavel de caminho no metodo.
    - `@ResponseBody`: Indica que o retorno do metodo deve ser escrito diretamente no corpo da resposta http.

- **Validação**:
    - `@Valid`: Valida Objetos no corpo da requisição
    - `@NotNull`, `@Size`, `@Min`, `@Max`: anotações de validação de campo, localizado em classes.

- **Testes**:
    - `@SpringBootTest`: Configura ambiente de testes para aplicações spring boot.
    - `@MockBean`: Cria mock de uma Bean para testes.

- **Trasacinal**:
    Não vou abordar isso agora.

Há tambem outras anotações avançadas que eu não quero abordar agora, como scheduling.

## Spring Bean Scope

Ao Criar componentes em Beans é possivel gerenciar os escopos de acesso utilizado no projeto;

Utilizando os Annotations de `@Scope("")`, essa annotation pode ter os seguintes parametros para definir o escopo da injeção de dependencia;

- `singleton`: -> sendo o padrão utilizando um objeto para todas as requisições dessa classe;
- `prototype`: -> sendo a criação de uma instancia para cada solicitação
- `request`: -> criação de uma instancia por requisição http (web app)
- `session`: -> criação de uma instancia por sessão http (web app não servless)