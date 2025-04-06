# Utils

## Cryptography 

O java possui duas ferarmentas de cryptografia nativa Java Cryptography Architeture (JCA) e Java Cryptography Extention (JCE)

### Tipos de Criptografia:

- Simétrica: utiliza a mesma chave para criptografar e descriptografar. Algoritmons: AES, DES, 3DES.

- Assimetrica: utiliza chave publica e privada para descriptografar. Algoritmos: RSA, Elliptic Curve.
Assinaturas digitais utilizam esse padrão de chave assimetrica

- Hashing: Gera valor fixo a partir de dados de entrada sem a possibilidade para reversão de dados. Algoritmos comuns: Sha-256, Sha-512, MD5.

## Data e horas.

Java possui uma lib extença para trabalhar com horas o pacote que gerencia as classes de datetime é ```java.time```.

## Networking

São a implementação de recursos para comunicaçõa entre recursos web por meio de internet. Os as classes estão no pacote ```java.net```

### Principais pacotes

- Socket > Implementa comunicaçõa cliente em uma rede baseada em TCP
- ServerSocket > Usado para implementar servidores que aceitem conexões TCP
- DatagramSocket > Usada para comunicação baseada em UDP
- InetAddres > Representa endereço IP
- URL > Usada para acessar recursos na internet (http, ftp)
- HttpURLConnection > Utilizado para envio e recebimento de comunicação HTTP

## Expressoes Regulares

O java possui uma lib com a implementação de Regex implementada no ```java.util.regex```, utilizada para validade, buscar e manipular padões de texto.