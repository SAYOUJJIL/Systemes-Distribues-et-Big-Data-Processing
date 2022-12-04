<H1>Mise en oeuvre d'une architecture micro-services</H2>
<h2>Description du projet </h2>
Dans cette parties nous allons réaliser les taches suivantes : 
  - Couches DAO, Service, Web, DTOs
  - Utilisation de MapStruct pour le mapping entre les objet Entities et DTO
  - Génération des API-DOCS en utilisant SWAGGER3 (Open API)
  - Communication entre micro-services en utilisant OpenFeign
  - Spring Cloud Gateway
  - Eureka Discovery Service
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

• Spring Boot Actuator : prend en charge les points de terminaison intégrés (ou personnalisés) qui vous permettent de surveiller et de gérer votre application - telle que l'application
santé, métriques, sessions, etc. <br>
<h3>Couche DAO</h3>

<h2>billing-service</h2>
<h2eureka-service</h2>
<h2>geteway-service</h2>
