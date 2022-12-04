<h2>Objectifs </h2>
Créer le micro service bank-account-service  qui utilise API GraphQl 
<h2>Decription du projet </h2>
dans cette partie du cours nous allons suivre toutes les étapes de création de ce micro service <br>
* Création Couche DAO<br>
* Création Couche DTO      <br>
* Création Couche Mapper<br>
* Création Couche Service<br>
* Couche Web <br>
* Utilisation de la communication REST API (RESTCONTROLLER ou Spring DATA REST)
* Utilisation de la communication de GraphQ <br>
<h2>prérequis</h2>
  Les API REST traditionnelles fonctionnent avec le concept de ressources gérées par le serveur. Nous pouvons manipuler ces ressources de manière standard, en suivant les différents verbes HTTP. Cela fonctionne très bien tant que notre API correspond au concept de ressource, mais s'effondre rapidement lorsque nous devons nous en écarter.<br>
  Cela souffre également lorsque le client a besoin de données provenant de plusieurs ressources simultanément, comme la demande d'un article de blog et de commentaires. En règle générale, ce problème est résolu en demandant au client de faire plusieurs requêtes ou en demandant au serveur de fournir des données supplémentaires qui ne sont pas toujours nécessaires, ce qui entraîne des tailles de réponse plus importantes.<br>
  GraphQL offre une solution à ces deux problèmes . Il permet au client de spécifier exactement les données qu'il souhaite, y compris la navigation dans les ressources enfants dans une seule requête et permet plusieurs requêtes dans une seule requête.<br>
  Pour utiliser graphQl <br>
  1-Configurer le service<br>
  Tout ce dont nous avons besoin pour que cela fonctionne, ce sont les bonnes dépendances : <br>
  <img width="629" alt="image" src="https://user-images.githubusercontent.com/85376207/205506472-7a535e9a-3d23-4955-bcbb-a004456fd7f5.png">
  <br>
  2-Ecrire le schéma<br>
  Le démarreur GraphQL Boot fonctionne en traitant les fichiers de schéma GraphQL pour créer la structure correcte, puis câble des beans spéciaux à cette structure. Le démarreur Spring Boot GraphQL trouve automatiquement ces fichiers de schéma . <br>

Nous devons enregistrer ces fichiers de schéma " .graphqls " ou " .gqls " sous l'emplacement src/main/resources/graphql/** , et Spring Boot les récupérera automatiquement. Comme d'habitude, nous pouvons personnaliser les emplacements avec spring.graphql.schema.locations et les extensions de fichier avec les propriétés de configuration spring.graphql.schema.file-extensions .<br>
<h2>Création des differentes couches de l'application </h2>  
<ol>
  <h3><li>Création d'un projet spring</li></h3>
<img width="471" alt="image" src="https://user-images.githubusercontent.com/85376207/205504210-da4eeb2b-2094-4f78-93e6-d14c0ecb7e7a.png">
<img width="471" alt="image" src="https://user-images.githubusercontent.com/85376207/205504175-2b18e347-a878-4663-a488-819a50c1c691.png">
  <h3><li>Couche DAO</li></h3>
  <BR><b>==> Entities</b> <br>  <BR>
  <img width="644" alt="image" src="https://user-images.githubusercontent.com/85376207/205504589-182488f8-c32c-4d48-b797-cd54ea6942e9.png">
  <img width="646" alt="image" src="https://user-images.githubusercontent.com/85376207/205504605-b0ef8593-d124-4ffc-b8d8-e4222fbd25a8.png">
  <img width="644" alt="image" src="https://user-images.githubusercontent.com/85376207/205507006-eba81895-1d09-4978-a50b-c8db49bee676.png">
  <BR> <br>==> Enums</b> <br>  <BR>
  <img width="645" alt="image" src="https://user-images.githubusercontent.com/85376207/205505218-a7f846cd-4e5a-40fa-ba87-cc7d800781de.png">
 <br><b>==> Repositories </b> <br>  <BR>
 <img width="641" alt="image" src="https://user-images.githubusercontent.com/85376207/205504687-ea233e50-fc32-4071-bdd0-c1ee322b2fc0.png">
 <img width="640" alt="image" src="https://user-images.githubusercontent.com/85376207/205504693-ba435281-7ac1-4d4f-bea1-0afea025013b.png">
  <h3><li>Couche DTO</li></h3>
  <img width="644" alt="image" src="https://user-images.githubusercontent.com/85376207/205505303-86e41af8-c802-4c13-8484-aa6ee397092a.png">
  <img width="644" alt="image" src="https://user-images.githubusercontent.com/85376207/205505316-d31806a8-1fc1-4b2b-ae40-703aeff8198e.png">
  <img width="644" alt="image" src="https://user-images.githubusercontent.com/85376207/205505328-f02c63f7-e74f-4ba2-8584-2771382bc47b.png">
  <h3><li>Couche Mapper</li></h3>
    <img width="644" alt="image" src="https://user-images.githubusercontent.com/85376207/205505618-d45668c9-6049-46a5-8ec9-49e5fe359da5.png">
    <img width="652" alt="image" src="https://user-images.githubusercontent.com/85376207/205505627-89954c5f-37e8-4eda-a516-dd48f6ca1dbc.png">
  <h3><li>Couche Service</li></h3>
    <img width="650" alt="image" src="https://user-images.githubusercontent.com/85376207/205505641-ff8a03a4-8370-4be5-aefc-8dd5791bfbe1.png">
<img width="643" alt="image" src="https://user-images.githubusercontent.com/85376207/205505664-5c4b47d2-e89f-4953-a5d8-206ac61bc006.png">
<img width="651" alt="image" src="https://user-images.githubusercontent.com/85376207/205505676-ed32248f-4381-4838-9711-cf39365e070f.png">
<img width="643" alt="image" src="https://user-images.githubusercontent.com/85376207/205505691-830c2716-126a-4956-8bfc-7b11b87fa5e3.png">
<img width="646" alt="image" src="https://user-images.githubusercontent.com/85376207/205505697-dd325c2b-9836-44b1-9cce-348cb58a5f33.png">
  <h3><li>Couche Web</li></h3>
     <br><b>==> Cas communication REST </b> <br>  <BR>
    <img width="646" alt="image" src="https://user-images.githubusercontent.com/85376207/205505725-763e37e0-f930-4ff2-aa1e-98e17646b5a4.png">
     <br><b>==> Cas communication QraphQl </b> <br>  <BR>
    <img width="650" alt="image" src="https://user-images.githubusercontent.com/85376207/205506720-5d604e79-b135-41cb-983c-eb8a0311579b.png">
</ol>
<h2>Schema QraohQl </h2>  
    <img width="641" alt="image" src="https://user-images.githubusercontent.com/85376207/205507033-f749f242-1b51-4996-b4d7-37b61a245cfe.png">
    <img width="644" alt="image" src="https://user-images.githubusercontent.com/85376207/205507053-9eefaef0-dabf-4723-b4ee-83e4262153d8.png">


