
<h1 align="center">Web services SOAP WDSL UDDI Use case avec JAXWS</h1>
<H2>Objectifs</H2>
Dans cette partie du cours nous allons créer un projet qui se base sur le protocol SOAP,WSDL <br>
> Le protocole SOAP : protocol qui permet d'echanger des messages entre les applications 
distribuées sous <b>format XML </b> Avec le protocol http qu'on va transporter ces messages.
<H2>Technologies </H2>
  1. Pour Consulter la documentation : <b>WSDL</B> <br>
  2. pour consommer ce service web nous :<b> JAX-WS </b> qui est un spécification java permettant de développer les web services basés sur SOAP  <br>
  3. Pour faire le test du web service : <b>SoapUI</b>  <br>
<H2>A faire </H2>
1. Créer un Web service qui permet de :  <br>
  • Convertir un montant de l’auro en DH <br>
  • Consulter un Compte <br>
  • Consulter une Liste de comptes <br>
2. Déployer le Web service avec un simple Serveur JaxWS <br>
3. Consulter et analyser le WSDL avec un Browser HTTP <br>
4. Tester les opérations du web service avec un outil comme SoapUI ou Oxygen <br>
5. Créer un Client SOAP Java <br>
8. Déployer le Web Service dans un Projet Spring Boot <br>
<H2>Démarche </H2>
  <img width="698"  alt="image" src="https://user-images.githubusercontent.com/85376207/205513219-bcdcbf65-4e38-42ba-8235-627ee07bf146.png">
<H2>Démonstration </H2>
  1.Dépendances
  <img width="698" alt="image" src="https://user-images.githubusercontent.com/85376207/205513182-db7ecd0d-f186-41db-8711-24a72e8f04d6.png">
  2.créer un service web :
  <img width="698"  alt="image" src="https://user-images.githubusercontent.com/85376207/205512855-759c466d-c592-4491-8bf2-4e3a403d8bf0.png">
  <img width="698"  alt="image" src="https://user-images.githubusercontent.com/85376207/205512866-1f94c395-61b0-4932-9330-ae7182d4e736.png">
  3.créer un serveur web :
  <img width="698"  alt="image" src="https://user-images.githubusercontent.com/85376207/205512906-628c8703-70a1-4a24-bee3-3960232dc015.png">
  4.Client
  <img width="698"  alt="image" src="https://user-images.githubusercontent.com/85376207/205513031-ebd00931-50f6-442b-81d0-4810d5717311.png">
  <img width="698"  alt="image" src="https://user-images.githubusercontent.com/85376207/205513158-dea09845-b305-4a16-98ca-213f3b4ace0d.png">

<img width="698"  alt="image" src="https://user-images.githubusercontent.com/85376207/205512995-82cf3b06-b9e8-4a11-bc53-7919ec42840b.png">
  <img width="698"  alt="image" src="https://user-images.githubusercontent.com/85376207/205513144-aa5b380c-d08a-490a-bf11-dd5e3a6f81db.png">


<H2>Quelques Captures de test</H2>
<img width="443" alt="image" src="https://user-images.githubusercontent.com/85376207/205513629-0e1b5c9d-f009-410d-b832-ae561cf12d5e.png">
<img width="698" alt="image" src="https://user-images.githubusercontent.com/85376207/205513618-a109c5d8-b9ad-4d34-8576-cf71b7b1b30b.png">
<img width="698"  alt="image" src="https://user-images.githubusercontent.com/85376207/205513607-2e14bca6-c368-4069-97bc-2061a1b9181c.png">
<img width="698"  alt="image" src="https://user-images.githubusercontent.com/85376207/205513591-91ee1d72-e29b-4001-ba1e-0e5aec0102cb.png">
<img width="698"  alt="image" src="https://user-images.githubusercontent.com/85376207/205513578-4da18dc9-951d-4bfe-afb2-887d5cd781ea.png">
<img width="698" alt="image" src="https://user-images.githubusercontent.com/85376207/205513708-1a465fc8-9442-456a-9a5c-5724ca7bcac4.png">
