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

## Modules

## Optionals

## Dependency Injection

## I/O Operations

## File Operations