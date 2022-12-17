
# Configurando JUnit

## Maven

Adicionar no `pom.xml` do projeto a dependência abaixo:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.9.1</version>
    <scope>test</scope>
</dependency>

```
## Gradle

Adicionar ao arquivo `build.gradle`  `testImplementation` no closure `dependencies` e `useJUnitPlatform()` no closure `test`, ficando mais ou menos assim.

```groovy
dependencies {  
	//demais dependências do projeto
  testImplementation group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.9.1'  
}  
  
test {  
  useJUnitPlatform()  
}
```

Observação: A versão escolhida acima, `5.9.1`, escolhida nos exemplos, era a mais recente até o momento deste manual. Verificar versão mais nova em [Maven Repository](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine).
