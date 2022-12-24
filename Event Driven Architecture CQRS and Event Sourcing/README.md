## 1. Code Source 
### -> [Code Source ](https://github.com/SAYOUJJIL/Event-Driven-Architecture-CQRS-and-Event-Sourcing.git)
## 2. Objectifs 
Créer une application qui permet de gérer des comptes respectant les patterns CQRS et Event Sourcing avec les Framework AXON et Spring Boot
## A savoir 
CQRS : design pattern qui permet de séparer la partie lecture de la partie d'ecriture d'une application <br>
Eevent Sourcing : design pattern permettant de capturer tous les changements de l'état d'une application comme séquences d'évenements
## 3. Travail à faire 
### 3.1. Créer un nouveau projet nomé : <code>compte-cqrs-es</code>
#### Dépendances 
 > Spring JPA
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
   <br>
 > Spring Web

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
   <br>
 > Mysql
       
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
    </dependency>
   <br>
   > Lombok
    
    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <optional>true</optional>
    </dependency>
   <br>
   > OpenApi
    
    <dependency>
      <groupId>org.springdoc</groupId>
      <artifactId>springdoc-openapi-ui</artifactId>
      <version>1.5.2</version>
    </dependency>
   <br>
     > MapStruct
  
    <dependency>
      <groupId>org.mapstruct</groupId>
      <artifactId>mapstruct</artifactId>
      <version>1.4.2.Final</version>
    </dependency>
   <br>
   > AXON
  
    <dependency>
      <groupId>org.axonframework</groupId>
      <artifactId>axon-spring-boot-starter</artifactId>
      <version>4.4.3</version>
      <exclusions>
      <exclusion>
      <groupId>org.axonframework</groupId>
      <artifactId>axon-server-connector</artifactId>
      </exclusion>
      </exclusions>
    </dependency>
   <br>
      
    
