 # Sécurité des micro services avec Keycloak
 ## Objectifs 
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
 ### <code>1. Partie I : Keycloack</code>
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


   





 
 
