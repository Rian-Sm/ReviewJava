# Build tools

## Maven

Referencia principal [aqui](https://maven.apache.org/guides/getting-started/index.html)

Referencia de como criar uma web app spring em maven [aqui](https://www.baeldung.com/spring-with-maven)

### install (linux)

```sh

sudo apt install maven

```

### create basic project 

```sh
mvn archetype:generate -DgroupId=com.rsm.app -DartifactId=app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -Dint
eractiveMode=false
```

### compilation project 

```sh

mvn compile
```

### test project

Testes por padrão feito em JUNIT

```sh

mvn test
```

### package project

```sh
mvn package
```

### Clean project

```sh
mvn clean
```

### run project

```sh
mvn exec:java -Dexec.mainClass="com.rsm.app.App"
```

## Gradle



