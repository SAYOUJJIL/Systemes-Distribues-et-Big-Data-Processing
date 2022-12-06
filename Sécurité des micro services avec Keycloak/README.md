 # Sécurité des micro services avec Keycloak
 ## Objectifs 
 Partie 1 :  Spring Security JWT Oauth2 OICD
 Partie 2 : 
1. Télécharger Keycloak 19
2. Démarrer Keycloak
3. Créer un compte Admin
4. Créer une Realm
5. Créer un client à sécuriser
6. Créer des utilisateurs
7. Créer des rôles
8. Affecter les rôles aux utilisateurs
9. Avec PostMan :
    - Tester l'authentification avec le mot de passe
    - Analyser les contenus des deux JWT Access Token et Refresh Token
    - Tester l'authentification avec le Refresh Token
    - Tester l'authentification avec Client ID et Client Secret
    - Changer les paramètres des Tokens Access Token et Refresh Token

Partie  3 :
   -Sécuriser L'architecture Micro services Du projet Customer-service, Inventory-service et Order-service<BR><BR>
 ### 1. Partie I : Spring Security JWT Oauth OIDC
 #### 1.1. Création d'un projet vide <code>my-ecom-app</code> dans la laquel nous allons mettre des modules 
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205942934-0a6f0987-6b82-4382-af50-7441b86e8606.png">
 
### 1.2. Ajouter les dépendances suivants: 
 
 * Spring DATA JPA  <BR> <BR>
 
         <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
 
  * Oauth2 resource server <BR> <BR>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-oauth2-resource-server</artifactId>
        </dependency>µ
 
  * Spring Web <BR> <BR>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

 * H2 databases
 
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>
 
  * Spring Configuration Processor
 
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
            <optional>true</optional>
        </dependency>
 
  * Lombok

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
