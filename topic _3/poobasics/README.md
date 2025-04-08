## Classes e Objetos
Java é uma linguagem orientada a objetos, assim os comportamentos e estados do codigo seram armazedados em classes e instaciados por meio dos objetos.

Para compilar os arquivos em pacote que utilizam varias classes unidas utilizasse:
```sh
javac poobasics/*.java
```

## Metodos e variaveis

Igual qualquer outra classe

## Modificadores de acesso

O java possue 4 modificadores de acesso:

public, protected, default, private

## Diretiva Static

Adiciona uma variável ou metodo acessivel para todas instancias de uma classe ou objetos, sendo uma unica instancia compartilhada.

Metodos estaticos só podem manipular variaveis estaticas.

## Diretiva Final

É um modificador de classe que faz um metodo ou variavel como constante, impedindo que seja modificado. 

Caso um metodo seja tenha esta diretiva ele é impedido de ser sobrescrito sobre classes filhas

## Classes aninhadas

Estrutura de construção de classes que faz uma classe compor outra classe, assim facilitando a criação de logicas internas com essas composições, também aumentando o acoplamento.

## Pacotes

São agrupamentos de logica e codigo, fornecendo uma estrutura em arvore para organizar o codigo e tambem serve de camada de controle de acesso externa.

