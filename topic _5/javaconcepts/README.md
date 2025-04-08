## Exeception Handling
Mecanismo de tratamento de exceções como em outras linguagens.

Usado para interromper o fluxo normal da aplicação, sendo usando para identificar condições anormais ou ou erros.

As exceções herdam da classe ```throwable```;

### Categorias de exceções

- **Checked Exceptions**: Exceções verificadas em tempo de execução, sendo obrigatiorio bloco try-catch.

- **Unchecked Exceptions**: São verificadas em tempo de execução, não sendo obrigatiorio tratamento.

### Try with Resources

É um block try-catch, que utiliza recursos IO com arquivos e conexões, garantindo que sejam fechados no fim do bloco.

## Lambda Expressions

Lambda Expression em Java são a implementação de função sem nome, permitiondo tratar funções como objetos.

Para implementar uma interface funcional é necessario um metodo abstrato como ```Runnable``` ou ```Comparator```, ou interface com anotação ```@FunctionalInterface```

### Interfaces funcionais comuns

O Java fornece várias interfaces funcionais no pacote ```java.util.function```:

- Predicate<T> > avalia uma condição e retorna um boolean.

- Consumer<T> > Executa uma operação de um objeto.

- Supplier<T> > Fornece um valor sem entrada.

- Function<T, R> > Aplica uma função e tem um resultado.

- BiFunction<T, U, R> > Aplica a função de dois Objetos e obtem um resultado.

## Annotations
Em java, annotations são metadados que adicionam informações adicionais para o compilador, JVM ou Framework. Sendo usadas para configurar comportamentos, validar codigo ou gerar automaticamente.

Podem ser aplicados em classes, metodos, variaveis, parametros...

podem ser usadas pelo compulados, jvm ou por frameworks para comportamentos especificos.

Existem 3 tipos de Annotations:
- Annotations Padrao > Fornecidas pelo proprio java.
- Annotations Personalidadas > Criadas pelos devs do projeto.
- Annotations de Framework > Criada por frameworks

### Annotations Personalizadas

As annotations personalizadas podem ser usadas para criação de metadados nos recursos citados acima, mas tambem podem ser usadas de meta-annotatios, que configuram o comportamento de outras annotations.

## Modules
Utilizado no Java Plataform Module System (JPMS), para organizar oos modulos do projeto em unidades modulares, melhorando manutenção.

Modulos são o conjunbto de packotes e recursos que podem ser encapsulados e exportados seletivamente.
Define acesso de pacotes e acesso dos modulos e dependencias necessarias.

Modulo definido em arquivo ```module-info.java```

## Optionals

Classe de java para representar valores nulos ou ausentes.

## Dependency Injection

Padrao de desacoplamento de classe para fornecer dependencia externa à classe utilizada.

Padroes de injeção de dependencia são feitos por meio de construtor, setters e field (framework spring ou outro)

## I/O Operations

São operações de leitura e escrita em diferentes fontes como teclado, arquivos ou a rede, utilizando normalmente os pacotes ```java.io``` e ```java.nio```

## File Operations

As operações padrão das duas biblitecas de I/O para arquivo são read, write, create e delete.

Alem de possuir algumas funcionalidade de manipulação de diretorios que são importantes na utilização de diretios, como listagem de diretorios ou criação de pastas.