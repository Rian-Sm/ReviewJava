## Sintax basica do programa:
- **Declaração de classe principal**: Programas em java possuem apenas uma classe, no qual seu nome concide com o nome do arquivo.

- **Método main**: ``` public static void main(String[] args) ``` é o método de entrada da runtime.

- **Fim de comando**: Fim de comando é dado com ponto e virgola ```;```

- **Sensível a Maiusculas**: Java é case-sensitive

- **Brackets em blocos de código**: Blocos de código são escritos com ```{}```

## Ciclo de vida de um programa:

- **Desenvolvimento**: Criação dos código-fonte, em java é utilizado arquivos  ```.java``` como extenção de arquivo.

- **Compilação**: Código fonte é compilado pelo ```javac``` que converte o codigo em bitecode, bitecodes em Java estão no armazenados em arquivos com extenção ```.class```.


- **Carregamento**: O java possui um gerenciador do carregamnto (**Class Loader**) dos bytecodes que carrga e verifica s todas as dendencias estão disponives.

- **Verificação**: O java possui um verificador dos bytecodes (**Bytecode verifier**) que garante que os bytecodes estão seguindo as regras para serem executados na **JVM**.

- **Interpretação / Execução**: Virtual Machine do Java (**JVM**) que converte as intruções do bytecode em instruções de maquina para o sistema operacional e os executa.

- **Encerramento**: Após a execução, a JVM libera os recursos utilizados e finaliza a execução.

## Datatypes

- ### **Tipos Primitivos**:

``byte`` | size 1 byte | para pequenos inteiros.

``Short`` | size 2 byte | para inteiros.

``int`` | size 4 byte | para inteiros.

``long`` | size 8 byte | para inteiros longos.

``float`` | size 4 byte | para valores decimais (precisão simples).

``double`` | size 8 byte | para valores decimais.

``char`` | size 2 byte | para caracteres unicos.

``boolean`` | size 1 bit | para boleanos.

- ### **Tipos Não Primitivos**:

``String`` | Conjunto de caracteres.

``Array`` | Multiplos valores do mesmo tipo.

``Class`` | Modelo de objetos complexos.

``Interface`` | Modelo de padronização de classes.

### Conversão de tipos:

Há dois tipo de conversão de tipos no java: **Implicito** e **Explicito**;

- Implicito (Widenig): Valor automaticamente convertido para o tipo requisitado

- Explicito (Narrowing): É necessário indicar o casting do tipo na frente do valor enviado.
```java
//ex
double d = 10.5;
int d = (int) c;
``` 

### Wrapped classes

Cada tipo primitivo tem seu correspondente tipo em classe.

Esssa diferenciação dos tipos trazem seus traidoff de performasse e usabilidade.

## Variáveis e Escopo:

- São os "ponteiros" do recurso utilizado na memória. Podendo ser Variaveis locais, de instancia, ou de classes (Estaticas).

- Escopos de variaveis definem o acesso desta variavel. Podendo ser escopo de bloco, de metodo, de classe ou escopo global. 

- Outro conceito importante neste topico são os modificadores de acesso. Sendo eles: public, private, protect e default.

```java
public class Exemplo {
    public int publico;    // Acessível de qualquer lugar
    private int privado;   // Acessível apenas dentro da classe
    protected int protegido; // Acessível no mesmo pacote ou subclasses
    int padrao;            // Acessível no mesmo pacote
}
```

