# FUNCTIONAL PROGRAMING 

### Interfaces funcionais comuns 

O Java fornece várias interfaces funcionais no pacote ```java.util.function```:

- Predicate<T> > avalia uma condição e retorna um boolean.

- Consumer<T> > Executa uma operação de um objeto.

- Supplier<T> > Fornece um valor sem entrada.

- Function<T, R> > Aplica uma função e tem um resultado.

- BiFunction<T, U, R> > Aplica a função de dois Objetos e obtem um resultado.


## High-Order Functions

High-order functions são funções que podem implementar outras funções, utilizando **expreções lambda** e **Streams** é possivel utilizar recursos de programação funcional em java, mesmo java não sendo uma linguagem funcional pura.

## Functional Interface

São interfaces que implementam um unico metodo abstrato, usado usar em lambdas e programação funcional.

Utilizasse a annotation ```@FunctionalInterface``` para garantir que a interface seja funcional.

## Functional Composition

Tratasse da conposição entre funções onde a saida de uma função é adicionada como imput em outra função.

As interfaces funcionais puem metodos como ```andThem``` e ```compose``` para compor a função:


- andThen: executa a função atual e posteriormente a proxima função = f(x) -> g(f(x))

- compose: executa outra função primeiro em seguida executa a função atual = f(x) => f(g(x));

### Predicate composition

É possivel composição com a interface Predicate com metodos ```and```, ```or```, ```negate```.

## Stream API

É uma sequencia de elementos que suporta operações funcionais para processar dados, essas operações podem ser Intermediarias ou terminais.

### Caracteristica da stream API

- Declarativa: permite descrever o que fazer ao invez de como fazer;
- Lazy: As operações intermediarias são avaliadas apenas quando uma operação terminal é chamada;
- Imutavel: Stream não alteram a fonte de dados;
- Paralelas: suporta processamento paralelo com ```parallelStream()```.

### Operações 

- Intermediaria
Uma metodo de uma stream que retorna outra stream durante a execução

- Terminal
Operação termiais são aquelas que consomem uma stream e retornam um resultado.

