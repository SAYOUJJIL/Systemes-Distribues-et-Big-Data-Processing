<H1>Mise en oeuvre d'une architecture micro-services</H2>
<h2>Description du projet </h2>
Dans cette parties nous allons réaliser les taches suivantes : 
  - Couches DAO, Service, Web, DTOs  <BR>
  - Utilisation de MapStruct pour le mapping entre les objet Entities et DTO  <BR>
  - Génération des API-DOCS en utilisant SWAGGER3 (Open API)  <BR>
  - Communication entre micro-services en utilisant OpenFeign  <BR>
  - Spring Cloud Gateway  <BR>
  - Eureka Discovery Service <BR>
 <h2>A Savoir </h2>
 <b>Pour utiliser MapStruct il faut </b> <br>
 1- Ajouter la dépendance suivante 
 <img width="576" alt="image" src="https://user-images.githubusercontent.com/85376207/205509028-e9e6ea1f-10db-4179-8189-2cf67dc54aac.png">
 2- Ajouter la dépendance le code suivant à pom.xml<br>
 <img width="641" alt="image" src="https://user-images.githubusercontent.com/85376207/205509092-9bc02f7b-e9d8-4603-8d26-9a4ddbf81cb8.png">
 <b>Pour Consulter la documentation Swagger il faut ajouter la dépendance suivante : </b> <br>
<img width="563" alt="image" src="https://user-images.githubusercontent.com/85376207/205509148-f4e9251d-8f2c-4b8e-bc4e-59519b4a6499.png">

<h2>customer-service</h2>
<h3>Les dépendances</h3>
les dépendes que nous aurons besoins dans ce projets sont : 
• Spring Web : créez des applications Web, y compris RESTful, à l'aide de MVC du printemps. Utilise Apache Tomcat comme conteneur intégré par défaut. <br>
• Spring Data JPA : conserver les données dans les magasins SQL avec Java Persistence API utilisant Spring Data et Hibernate. <br>
• Base de données H2 : Fournit une base de données en mémoire rapide qui prend en charge JDBC Accès API et R2DBC, avec une petite empreinte (2 Mo). Les soutiens
modes embarqué et serveur ainsi qu'une console basée sur un navigateur application. <br>
• Rest Repositories : exposer les référentiels Spring Data sur REST via Ressort de données REST. <br>
• Lombok : bibliothèque d'annotations Java qui aide à réduire le passe-partout code. <br>
• Spring Boot DevTools : Fournit des redémarrages rapides des applications, LiveReload et configurations pour une expérience de développement améliorée. <br>
• Eureka Discovery Client : un service basé sur REST pour localiser services à des fins d'équilibrage de charge et de basculement de middle-serveurs de niveau. <br>

• Spring Boot Actuator : prend en charge les points de terminaison intégrés (ou personnalisés) qui vous permettent de surveiller et de gérer votre application - telle que l'application santé, métriques, sessions, etc. <br>
<h3>Couche DAO</h3>
<img width="643" alt="image" src="https://user-images.githubusercontent.com/85376207/205509158-a355bdc2-8d16-4b60-ad0e-f696b2e3cdba.png">
<img width="913" alt="image" src="https://user-images.githubusercontent.com/85376207/205509527-5d5312b9-2a2d-4139-9e39-f8e097630510.png">
<h3>Couche DTO</h3>
<img width="931" alt="image" src="https://user-images.githubusercontent.com/85376207/205509548-f292f155-18b9-4eda-8e2e-d1de75fc2a78.png">
<img width="931" alt="image" src="https://user-images.githubusercontent.com/85376207/205509560-3910098d-65cb-4ea6-9d4d-fe06442fb3a3.png">
<h3>Couche Mapper</h3>
<img width="938" alt="image" src="https://user-images.githubusercontent.com/85376207/205509584-fb9d2a1b-f10b-485d-9f46-e44da3c0c77a.png">
<h3>Couche Service</h3>
<img width="926" alt="image" src="https://user-images.githubusercontent.com/85376207/205509599-57ce57f9-d8c2-4121-a484-ddc3edf67370.png">
<img width="937" alt="image" src="https://user-images.githubusercontent.com/85376207/205509617-9a1dffd6-4eca-4896-a302-95b7bfc1dcf1.png">
<h3>Couche Web</h3>
<img width="925" alt="image" src="https://user-images.githubusercontent.com/85376207/205509638-0a46b328-e884-48ef-b821-411a20ee42bf.png">
<h3>Configurations</h3>
<img width="922" alt="image" src="https://user-images.githubusercontent.com/85376207/205509665-f8d45f75-a2e6-4b12-8819-6c8fd94daf39.png"> <BR> <BR>
<h2>billing-service</h2>
<img width="938" alt="image" src="https://user-images.githubusercontent.com/85376207/205509688-82540e0e-51c8-4d30-a232-cd1cf97d7673.png">
<h3>Couche DAO</h3>
<h3>Les dépendances</h3>
les dépendes que nous aurons besoins dans ce projets sont : 
• Spring Web : créez des applications Web, y compris RESTful, à l'aide de MVC du printemps. Utilise Apache Tomcat comme conteneur intégré par défaut. <br>
• Spring Data JPA : conserver les données dans les magasins SQL avec Java Persistence API utilisant Spring Data et Hibernate. <br>
• Base de données H2 : Fournit une base de données en mémoire rapide qui prend en charge JDBC Accès API et R2DBC, avec une petite empreinte (2 Mo). Les soutiens
modes embarqué et serveur ainsi qu'une console basée sur un navigateur application. <br>
• Rest Repositories : exposer les référentiels Spring Data sur REST via Ressort de données REST. <br>
• Lombok : bibliothèque d'annotations Java qui aide à réduire le passe-partout code. <br>
• Spring Boot DevTools : Fournit des redémarrages rapides des applications, LiveReload et configurations pour une expérience de développement améliorée. <br>
• Eureka Discovery Client : un service basé sur REST pour localiser services à des fins d'équilibrage de charge et de basculement de middle-serveurs de niveau. <br>

• Spring Boot Actuator : prend en charge les points de terminaison intégrés (ou personnalisés) qui vous permettent de surveiller et de gérer votre application - telle que l'application santé, métriques, sessions, etc. <br>

<img width="929" alt="image" src="https://user-images.githubusercontent.com/85376207/205509737-b06a7d79-8e1d-4d4f-9bb8-db5a0ed21bc6.png">
<img width="939" alt="image" src="https://user-images.githubusercontent.com/85376207/205509751-41c8899e-779a-4fd5-800b-831cd65a8c62.png">
<h3>Couche DTO</h3>
<img width="938" alt="image" src="https://user-images.githubusercontent.com/85376207/205509767-1b1f3d50-b7b7-4696-94d3-dffc2a7e5d8e.png">
<img width="934" alt="image" src="https://user-images.githubusercontent.com/85376207/205509780-8ef7203a-abc1-453c-b243-25eb11057a8a.png">
<h3>Couche Mapper</h3>
<img width="926" alt="image" src="https://user-images.githubusercontent.com/85376207/205509790-027577a2-0f9d-4f0f-9750-5ee94a37cf79.png">
<h3>Couche Service</h3>
<img width="935" alt="image" src="https://user-images.githubusercontent.com/85376207/205509804-562cea07-bdc0-4ae6-a8f5-512f56b06cff.png">
<img width="935" alt="image" src="https://user-images.githubusercontent.com/85376207/205509818-5ad46a0f-2876-4710-b992-f2013d5b2327.png">
<h3>Couche Web</h3>
<img width="936" alt="image" src="https://user-images.githubusercontent.com/85376207/205509833-a59c61d9-3eb7-4883-9191-8f7fa6af2db4.png">
<h3>Couche Model</h3>
<img width="941" alt="image" src="https://user-images.githubusercontent.com/85376207/205509850-8b08441f-4e73-4ad2-9a2e-3f17cc78bea3.png">
<h3>Intervenir CUSTOMER-SERVICE</h3>
<img width="924" alt="image" src="https://user-images.githubusercontent.com/85376207/205509879-cb4e2ded-5647-4534-96c3-b66056f5540f.png">
<h3>Configurations</h3>
<img width="924" alt="image" src="https://user-images.githubusercontent.com/85376207/205509956-45f7902d-1e53-4f04-85da-735f4597d26d.png">
<h2>eureka-service</h2>
<img width="927" alt="image" src="https://user-images.githubusercontent.com/85376207/205510107-5c7ca901-ee5a-4033-977d-c6d2fcf6465b.png">
<img width="938" alt="image" src="https://user-images.githubusercontent.com/85376207/205510126-08791ffa-8d08-4589-9a4e-6d072cd32471.png">

<h2>geteway-service</h2>
<h3>Les dépendances</h3>
les dépendes que nous aurons besoins dans ce projets sont : 
* Spring Boot DevTools : Fournit des redémarrages rapides des applications, LiveReload et configurations pour une expérience de développement améliorée. <br>
* Eureka Discovery Client : un service basé sur REST pour localiser services à des fins d'équilibrage de charge et de basculement de middle-serveurs de niveau. <br>
* Spring Boot Actuator : prend en charge les points de terminaison intégrés (ou personnalisés) qui vous permettent de surveiller et de gérer votre application - telle que l'application santé, métriques, sessions, etc. <br>
* Gateway
<img width="920" alt="image" src="https://user-images.githubusercontent.com/85376207/205510073-0f26c78a-4221-4923-81d5-cf31fcd6d00b.png">
<img width="914" alt="image" src="https://user-images.githubusercontent.com/85376207/205510088-ced28a66-9b92-468f-ac88-eca25e39c4a5.png">

