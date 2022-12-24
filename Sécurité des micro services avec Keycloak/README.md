 # Sécurité des micro services avec Keycloak
 ### <code>Objectifs</code>
 <b>Partie 1</b> : 
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

<b>Partie  2</b> :
   Sécuriser L'architecture Micro services Du projet Customer-service, Inventory-service et Order-service<BR>
   
---
## <code>1. Partie I : Keycloack</code>
### 1.1.Qui ce qu'un <code>Keycloak</code>: <bR>
Keycloack est outil , une solution complète permettant de sécuriser les applications.
#### > Origine 
Les entreprises sont très sensibles aux normes de sécurité, c'est pourquoi elles préfèrent généralement utiliser des normes
Parmi les protocoles utilisés : OAUTH2 et OpenID Connect
* OAUTH2 : protocol de délégation des autorisatiosn (un utilisateur dispose d'une ressource dans un serveur pour accéder à cette ressource, l'utilisateur doit s'authentifier pour accéder à cette ressource, l'idée est de permettre à une <code>application tierce</code> d'accéder aux ressources dans le <code>serveur</code> des ressources sans pouvoir lui fournir le mot de passe c'est à dire on va communiquer dans un premier temps avec un <code>serveur d'autorisations</code> c'est lui qui va nous donner à accès ou non )
<img width="100%" alt="image" src="https://user-images.githubusercontent.com/85376207/209430416-61f97255-710b-4b12-ad23-939f4f5869f7.png">

L'objectif de keycloack c'est quand on va lui déléguer toute la partie de la gestion des autorisations il va permettre 
* Gestion des identités (users & roles)
* Authentification ( présenter la preuve que vous tel user => fournir userName + Password)
* Autorisations

### 1.2 Installation et démarrage de Keycloak

* Site Web : https://www.keycloak.org/

> **Note**
> de préference utiliser docker pour installer Keycloak

<img width="100%" alt="image" src="https://user-images.githubusercontent.com/85376207/209432113-921ebd2f-aed1-4448-8f52-6b1c8a2dfceb.png">
<img width="100%" alt="image" src="https://user-images.githubusercontent.com/85376207/209432133-073727c2-0d7a-4dfb-817a-686a896d457f.png">
<img width="100%" alt="image" src="https://user-images.githubusercontent.com/85376207/209432177-0e827089-75ed-461e-b4a1-d8f26b8dc50b.png">

* Exécuter la commande suivante dans votre terminal 

        docker pull quay.io/keycloak/keycloak

* Démarrer Keycloack avec l'une des commandes suivates :


        docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=change_me quay.io/keycloak/keycloak start-dev
        OU
        docker run quay.io/keycloak/keycloak start-dev
 
### 1.3 Console d’administration Keycloak
<img width="100%" alt="image" src="https://user-images.githubusercontent.com/85376207/209433188-00b4c398-6ac9-48d2-92d4-c2d67d7bdc6e.png"> 
<img width="100%" alt="image" src="https://user-images.githubusercontent.com/85376207/209433200-c66977a9-0921-4c7d-9bd1-a0727d373801.png">
<img width="100%" alt="image" src="https://user-images.githubusercontent.com/85376207/209433220-531e9b3e-d95a-47da-93a6-13432212e295.png">
 
### 1.3 Créer un  realm
 un realm : le téritoire à sécuriser (concerne un ensemble d'apps à sercuriser)
 <img width="958" alt="image" src="https://user-images.githubusercontent.com/85376207/209433428-a86d57a3-bad7-413c-8273-abd1c7b91f28.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433455-7fe42bc0-8eda-4dc0-bb02-197f94ad9923.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433463-20b0bcbd-0023-4215-8b12-c3473f84c08a.png">
 
### 1.4 Créer un client à sécuriser
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433502-da4ec0e7-5efb-4cec-9976-55f9a55c14f7.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433542-0cea6161-5839-454b-a586-cab99fcf74bd.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433672-bcfa8050-450d-4b94-9ef2-9b51e626f3b3.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433687-57a9fc77-13cd-440d-9215-ec79c0d1e9e6.png">

### 1.5 Créer des utilisateurs
 * User 1 : 
 <img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433717-885883b5-1589-49c1-8f80-f05f6b948815.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433774-9950d5b7-371c-4913-84a6-0647ac718927.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433793-ab72bb3b-ec32-4672-b4cb-be0fb54a9751.png">
<img width="959" alt="image" src="https://user-images.githubusercontent.com/85376207/209433799-cf76441c-8381-43d7-87de-b8e3b52e8745.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433845-69148be1-c605-47f4-b087-32214325ca4f.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433850-8910d4cc-78a2-4ce6-a1e5-77b56a9f84c2.png">
 
  * User 2 : 
 <img width="959" alt="image" src="https://user-images.githubusercontent.com/85376207/209433874-18c9124b-5259-45df-9204-21aae200a471.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433887-167784aa-0476-4bd8-bf8f-f5025f5ffbfa.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433891-f4deee2a-9b90-42a6-8e72-c59935c2f7cf.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209433938-418ffc0d-9450-409b-9f2d-a4435c2c19cd.png">
 <img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209434102-f8ed5d36-7d60-4e18-a99f-35969ac57174.png">

 
 ### 1.6 Créer des roles
 <img width="958" alt="image" src="https://user-images.githubusercontent.com/85376207/209434028-7e66d32f-c776-4f43-a2a8-2f9e949e2185.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209434050-68a2bb88-e03e-4175-9a75-6f0bcc5b5b6c.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209434075-85b8ad14-22b8-489c-82ee-968246058c81.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209434086-cef535f7-e091-4b56-afc0-aa6160e65324.png">

 
 ### 1.7 Affecter les rôles aux utilisateurs
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209434148-93a9eb9e-a86c-41ac-9400-c473a79f290e.png">

 > Assign Role
 <img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209434168-f23f4dcd-8f4f-416e-b1f3-a9ed507afd0e.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209434176-7ea9e0e8-94e9-441a-9465-0aed8f2b7d24.png">

 ### 1.8 Avec PostMan :
Il y a trois manières de s'authentifier via mot de passe , refresh Token (précisez le token) et l'authentification avec Client ID et Client Secret
 - Tester l'authentification avec le mot de passe
 <img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209434453-18155b54-711a-4d03-996f-107b2c61c2dc.png">
 <img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209434522-2b85ab1a-fcbf-4add-b268-5b0817e49e88.png">
 Renvoir du ID Token : 
 <img width="958" alt="image" src="https://user-images.githubusercontent.com/85376207/209434598-58cfc498-8960-42cd-8a6d-45cbe942689f.png">

 - Analyser les contenus des deux JWT Access Token et Refresh Token
  Savoir que JWt Contient :
  <img width="959" alt="image" src="https://user-images.githubusercontent.com/85376207/209434799-15076cdf-2fce-4ed5-8192-a44c5f6da42c.png">
 - Tester l'authentification avec le Refresh Token
 <img width="823" alt="image" src="https://user-images.githubusercontent.com/85376207/209435044-44aada01-d16f-4412-b7f6-c52dcaf2bda9.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209434944-c086848d-be73-4f1d-a31e-fd5f169dcad6.png">
 <img width="958" alt="image" src="https://user-images.githubusercontent.com/85376207/209435101-10f1b3c3-f919-4055-9a08-ed9b493420ef.png">

 - Tester l'authentification avec Client ID et Client Secret
 <img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209435222-8a013f99-13dd-4502-ad09-6a1b862f9fe6.png">
> wallet-client
<img width="958" alt="image" src="https://user-images.githubusercontent.com/85376207/209435232-7b48f9f0-f965-43e4-8760-ae924b608924.png">
> Activer Client authentication : je dois authentifier l'app qui m'envoie l'auth
 <img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209435257-4f1b6f73-49a0-45ee-a76e-ef1a76a3c6df.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209435309-9d5a81ab-2315-4b93-a589-fd4f4d887564.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209435325-2e93015f-355c-42b8-9475-3ae36dc06b00.png">
> Copier Client secret
 <img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209435628-efa77f69-4923-46bf-b08b-b219b94888d2.png">

 - Changer les paramètres des Tokens Access Token et Refresh Token
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209435802-6112e74e-5a0b-47c8-acd5-a8a92b5b2865.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/85376207/209435809-fab5965e-7dc3-4280-bdb7-195f7cfd6d66.png">
 
## <code>2. Partie  2 : Sécuriser L'architecture Micro services </code>
<a href="https://github.com/SAYOUJJIL/Systemes-Distribues-et-Big-Data-Processing/tree/main/Architectures%20Micro%20services%20avec%20(Spring%20Cloud%20Config%2C%20Consul%20Discovery%2C%20Consul%20Config%2CVault)">Code Source</a>





 
 
