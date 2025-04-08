## Ciclo de vida de Objetos
As etapas do ciclo de vida de um objeto em java segue os seguintes passos:

```textplane
Declaração > Instanciação > Inicialização > Uso > Finalizado uso > destruição 
```

Seguindo esses processos: O objeto é declarado e não possui referencia de memória, assim ao chamar a diretiva ```new``` o objeto é instanciado e começa a ser inicializados os Atributos do objeto, para posteriormente seu uso, após o uso, seu objeto não tem mais referencia de memória, porém essa referencia não é descartada de imediato, sendo guardada até o **garbage colector** destruir essa referencia de memória.

### Garbage colector: 
Responsavel por limpar os objetos de memoria, a memoria é limpa quando objetos não tem mais referencia de uso. É possivel sugerir ao garbage colector limpar a memoria, mas não garante que será executado no mesmo instante.

## Herança
Possibilidade de uma classa extender dados de outra classe Pai.

A classe pai é referenciada como ```super``` dentro de seu filho.

## Abstraction
Processo de não especificar onde os detalhes de implementação.


É feita por meio de Classe Abstrata e Interface.

Uma classe pode estender apenas de uma classe abstarata mas pode extender de varias interfaces.

## Metodos encadeados

Criação de estrutura para executar uma sequencia de metodos dentro do mesmo objeto, feito por meio de seus metodos retornarem seu proprio objeto assim podendo executar outros comandos.

## Encapsulamento

Controlar acesso a dados para protege-los de uso alheio. Feito por meio de metodos o acesos dos atributos da classe.

## Interfaces
Abstração que não possui nenhum detalhes de implementação, mas podem conter metodos abstratos, metodos padrão e metodos estaticos.

## Enumeraveis
Objetos em lista que em java são tratados como constantes.

## Gravação (Record)

Recording funciona como um Atributo ```Final``` em uma classe, deixando imutavel ao instanciar o objeto daquela classe.

A Record pode possuir metodos estaticos.

## Sobrescrita de metodo

Sobrescrita normal de POO, feita por meio de @Attribute acima do meto sobrescrito da classe pai.

## Bloco de inicialização

Bloco de inicialização é um bloco de codigo que executa instruções de carregamento de uma Classe / Objeto fora do contrutor ou metodos.

É utilizado para criar estruturas complexas de codigo gerais para a classe, que ficilizaria e a execução de construtor para dados especificos.

Possui o bloco estatico e de instancia, o bloco estatico carrega uma vez junto ao carregamento da propria classe, já o bloco de instancia executa durante a criação de um objeto.

## Bind Estatico e Dinamico

Associação de um metodo das classes em chamando o codigo em runtime ou tempo de compilação.

**Bind estatico (early bind)** é feito ao utilizar metodos static, privados ou final, que são associados em tempo de compilação.

Já o **bind dinamico (late bind)** os metodos que podem possuir polimorfismo e são gerados em tempo de execução, sendo decidido pela JVM.


## Passando valores e referencias

Sistema de utilização de ponteiros de memoria na passagem de parametros em um metodo.

Caso um parametro seja um tipo basico é gerado uma copia em memoria dos dados deixando o valor inicial imutavel.

Caso sejam passados valores em Objetos o ponteiro de memoria é passado, assim podendo alterar atributos do objeto. 





