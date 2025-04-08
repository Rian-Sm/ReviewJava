## Strings e Metodos:

Em Java strings são objetos que representam sequencias de caracteres.

Existem duas formas de instanciar strings:

- **Literal**: Instancia a string colocando ela em **string pool** sendo reutilizada na memória.
```java
String ex = "string de exemplo";
```

- **Construtor**: Utilizando contrutor a string é armazenada fora do string pool dentro do seu proprio objeto. 


Ao instanciar uma string ela se torna imutavel, assim ao fazer uma operação de modificação ela criará outra instancia em memória.


Algumas manipulações de string estão no diretório ```ExemploManipulacaoString```

## Operadores Matematicos:

O java possui os operadores aritmeticos padrão e tambem operadores de atribuição.

## Arrays:

Arrays em java possuem as mesmas propriedades de um array padrão, possuindo declaração de Array ou inicialização com valores.


## Condicionais:

Condicionais são semelhantes a outras linguagems. Possuindo os classicos if else, switch case, operadores ternarios e operadores logicos. 

Ao fazer comparação de String é necessario usar metodo ```.equals()``` devido se tratar de um Objeto as strings.

## Loops:

As execuções de loop são semelhantes da linguagem C, sendo:

- for padrao: 
```java
for(inicialização; condição; incremento/decremento){}

``` 

- while padão:

```java
while (condição) {
    // Código a ser executado
}
``` 

- do while padrão
```java
do {
} while (condição)
``` 

- **foreach diferente**:
```java
int[] lista = {10, 20}; 
for (int valor : lista){}
``` 


## Basico de POO (Estudo mais aprofundado posteriormente):

### Resumo
- Classe: Define o modelo para objetos.
- Objeto: Instância de uma classe.
- Encapsulamento: Protege os dados e controla o acesso.
- Herança: Reutiliza código de outra classe.
- Polimorfismo: Permite métodos com comportamentos diferentes.
- Abstração: Oculta detalhes e expõe funcionalidades essenciais.