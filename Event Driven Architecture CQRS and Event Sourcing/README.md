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
   ### 3.2. Captures
![C1](https://user-images.githubusercontent.com/85376207/209465927-b3da8416-ee74-409c-8f20-385411bfa106.jpg)
![C2](https://user-images.githubusercontent.com/85376207/209465926-ba840f51-f3b0-4eca-8ce4-138694bf6af3.jpg)
![C3](https://user-images.githubusercontent.com/85376207/209465928-f1b49270-4c2c-4b97-9782-90bb43c1fd4a.jpg)
![C4](https://user-images.githubusercontent.com/85376207/209465933-63ce9ad6-ff04-40d2-b963-a8c7722063bf.jpg)

      
    
