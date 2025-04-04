
# Threds

As threads permitem executar tarefas simuntameamente dentro de um programa, usado para programação concorrente, executando varias tarefas ao mesmo tempo.

## Funcionalidade

Thread é um a menor unidade de execução de um programa, sendo que em java ha uma thraead principal.

## Implemenação

 Há duas implementações padão de threads em java:

 - Entendendo da classe Thread

 - Implemenbtando a interface Runnable: Classe que implementa runnable é instanciada encima de uma classe Thread

 ### Metodos impostantes em Threas

 Start() -> Inicia a execução em thread

 Run() -> implementação do que será executado

 sleep(long millis) -> Pausa a execução da thread

 join() -> Faz com a thread principal espere o fim da execução da thread iniciada - para evitar condições de corrida em recursos compartilhados

 isAlive() -> Retorna bool em relação a execução da thread

 setPriority(int p) -> define prioridade da thread de 1 a 10

 getPriority() -> returna prioriadade

 getName() -> retorna nome da thread

 setName(String name) -> nomeia a thread 


## Threads Virtuais

Otimização de recursos de threads para lidar com operaçõesde I/O, sendo threads gerenciadsas pela JVM sem ter vinculo direto com threads do processador.

Permite criação e execução de milhares de threads simuntaneas, sem sobrecarga de recursos.

Pode ser configurado para usar ExecutorService para melhro gerenciamento de tarefas concorrentes.

Sendo uma feature decente tem algumas problemas em relação, podendo ser modificado em versoes futuras, não ideal para tarefas com grande consumo de CPU e não possui boa integração com codigo nativo.

## Java Memory Model (JMM)

Define padões que as threads integagem com a memoria em java, fornecendo informações de como os dados são lidos, escritos na memoria compartilhada e como as alterações feitas por uma thread é lida por outra thread.

A execução de um programa multi thread cada processamento pode ter cache e registradores com copias da informação compartilhada em paralelo, a JMM garante que esta operações tenha concistencia e um mesmo ambiente concorrente definindo regras de visibilidade, ordenação e sincronização.

Alguns conceitos que podem ocorrer durante a execução de uma thread são visibilidade dos recursos, ordem de execução dos recursos e a atomissidade das operações.

Assim, há como modular algumas regras de sincronização e volatilidade;

Utilizando a diretiva ```synchronized``` em algum metodo garante que as alterações sejam feitas e visiveis para outras threads.

Utilizando a diretiva ```volatile``` é utilizada para modificar o acessor de visibilidade, escrevendo a variavel na memoria principal, evitando problemas de visibulidade.

Ciclo de vida da Thread (Happens-before Relationship)

A ordem das operações entre as threads são Sincronização, Volatile, Inicio da thread e fim da thread

### Problemas comuns

- **Condição de corrida**: Resolvidos com synchronized ou com classes thread-safe como Atomicinteger;

- **DeadLock**: Solucionado evitando  bloqueios circulares e use timeout;

- **Problema de visibilidade**: Resolvido usando volatile out sincronização explicita;

# Execução

## Compilação

```sh

javac -d . BasicThread.java

java ThreadsJava.BasicThread
```

