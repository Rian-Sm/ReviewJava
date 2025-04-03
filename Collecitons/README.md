# Collections

## Array vs  ArraysList

Arrays são  coleções de dados do mesmo tipo, sendo que há duas maneiras de criar essa estrutura:

- Arrays
    Sendo uma estrutura com tamanho fixo instanciando na sua criação com acesso por meio de index.

- ArrayList
    Tamanho dinamico, como uma lista dinamica de C, armazena apenas objetos, possui metodos utilitários 

## Set

Set é um Array list que não possui replica de dados, e possui varias implementações e não permite busca por indice e permite operações de conjunto por padrão.

Implementações comuns: ```HashSet```, ```LinkedHashSet``` e ```TreeSet```.

TreeSet é o unico metodo que garante a ordenação dos elementos.

## Map

HashMap é uma estrutura baseada em chave valor e possui tres implementações ```hashmap```, ```linkedHashMap``` e ```TreeMap```.

TreeMap é a unica estrutura que garante ordenação dos elementos.

## Queue

Estrutura de fila com FIFO first in / first out, possuindo tres implementações ```LinkedList```, ```PriorityQueue``` e ```ArrayDeque```

## Stack

Estrutura de pilha LIFO Last in / First out, Baseada em Vector, podendo ser sinconizada.


## Dequeue - Double-ended Queue

Implementa as duas estrutras, de fila e pilha.

## Iteractor

Forma de varrer elementos de maneira sequencial sem conhecer sua estrutura exata, podendo remover recursos dessa lista durante a execução do Interactor

## Generic Collections

Forma de implementa um dos tipos de elementos filtrando o tipo de elemento possivel na lista, assim retornando exception em tempo de compilação tambem elimando casting e dando segurança aos tipo usandos.