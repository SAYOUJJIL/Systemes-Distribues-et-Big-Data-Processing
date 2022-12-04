<H1 align="center">Architectures Micro services avec (Spring Cloud Config, Consul Discovery, Consul Config,Vault)</H1>
<H2><code>Objectifs</code></H2>
Créer une application de e-commerce basée sur les micro services :

1. Consul Discovery

3. Spring Cloud Config

5. Spring Cloud Gateway

7. Customer-service

9. Inventory Service

11. Order Service

13. Consul Config (Billing Service)

15. Vault (Billing Service)


17. Frontend Web avec Angular


<H2>Architecture</H2>

<img width="686"  alt="image" src="https://user-images.githubusercontent.com/85376207/205517216-534dc9ad-0633-4792-8573-8197de74d217.png">

<H2><code>Consul Discovery</code></H2>
Dans ce projet nous allons utiliser <code>Consul</code> 

- Pour démarer consul : 

  consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=192.168.0.128 

- Accéder à l'interface graphique de consul 
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205518578-41b5fbd6-8574-4b7a-8e39-a61e9322c746.png">

<img width="686"  alt="image" src="https://user-images.githubusercontent.com/85376207/205517329-3c289539-f015-4c13-8a19-eb0a2d8d258f.png">
<H2><code>Spring Cloud Config</code></H2>
<h3>1. Dépendances </h3>
  * Config Server<BR>
  * Spring Actuator<BR>
  * Consul Discovery<BR>
<h3>2. ConfigServiceApplication </h3>
 - Pour créer un service de configuration nous aurons besoins de :
 
  1. Activer le service de configuration à l'aide de l'annotation :
   
  ${\color{yellow}@EnableConfigServer}$

  2. L'enregistrer dans consul :
 
 ${\color{yellow}@EnableDiscoveryClient}$
 
<img  width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205517853-18d0b905-42d8-4abd-8f00-399762a29eaa.png">
<h3>3. Configuration </h3>
<img width="686"  alt="image" src="https://user-images.githubusercontent.com/85376207/205517885-8348bd85-e006-42d1-bbb8-49e9f3409839.png">

<H2><code>Customer-service</code></H2>
<h3>1. Dépendances </h3>
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205518087-fb7212c8-e5aa-4793-ba2b-33e41275b1f9.png">
<h3>2. Couche DAO </h3>
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205520759-b769942d-2d13-44b3-9df2-9db8be8df3e7.png">
<img  width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205520783-28e31af3-d149-44ed-9c13-a9e83e4c310d.png">
<img  width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205520843-469a24a5-fdb4-42c1-be4f-defbf0ad3ab9.png">

 <h3>3. Web</h3>
 <img  width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205520874-507941cc-974f-41c2-88b8-5535d1f33dd3.png">
 <h3>4.Configuration</h3>
 <img  width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205520985-9ffd7062-dd55-40be-b38a-b70f89117d36.png">
 <h3>3. Captures de tests</h3>
 Avant changement :
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205521192-7887f638-905a-4517-b5f3-99642e616d89.png">
 Après changement :
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205521165-65fd0547-bdd7-438e-b389-43654a2f5869.png">
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205521084-9a48b6a4-0ebf-4bb0-886b-23474b8ad6e1.png">
 ->Tools -> HTTP client -> Create request 
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205521117-bd7c8973-3e5a-4d52-90ad-92647ee0d51b.png">
 H2 DATABASE : <BR>
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205521581-36af20d3-a513-446e-a32e-b73d1a4c3eb5.png">
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205521649-d7c149fc-9f8f-4a71-9458-ab8572a15e53.png">
<img width="686"  alt="image" src="https://user-images.githubusercontent.com/85376207/205521900-424fe88f-e61f-4e29-a326-a8884fe0064c.png">

<H2><code>Billing-service</code></H2>
<h3>1. Dépendances </h3>
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205518087-fb7212c8-e5aa-4793-ba2b-33e41275b1f9.png">
<h3>2. Couche DAO </h3>
<h3>3. Web</h3>
<h3>4.Configuration</h3>
<h3>3. Captures de tests</h3>


<H2><code>Inventory-service</code></H2>
<h3>1. Dépendances </h3>
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205518087-fb7212c8-e5aa-4793-ba2b-33e41275b1f9.png">
<h3>2. Couche DAO </h3>
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205522408-828dd945-761b-47e3-9946-cbd613473cf3.png">
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205522425-cd9d08ce-d80c-4bb3-9d3a-6db1b5211f47.png">
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205522448-7abc0c75-23a7-427e-991b-a4351d6e3f08.png">

<h3>3. Application</h3>
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205522482-22c86628-c743-4431-9abc-6799f231813a.png">

<h3>4.Configuration</h3>
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205522537-99f8ea23-41c2-4c33-807e-971b89103487.png">

<h3>3. Captures de tests</h3>
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205522591-235856de-d244-4a03-9e37-bc96da01e12e.png">

 
<H2><code>Order-service</code></H2>
<h3>1. Dépendances </h3>
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205518087-fb7212c8-e5aa-4793-ba2b-33e41275b1f9.png">
<h3>2. Couche DAO </h3>
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523072-60ba399c-53f4-4a46-bccd-50ef27533f9c.png">
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523086-90e1b863-0135-4bcf-b624-adf613cc9573.png">
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523115-d97d0bf4-c55c-45e3-94a4-d603d0cd9835.png">
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523124-e04fa734-326d-493f-a43b-e39b10145716.png">
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523134-d4a606ae-f925-47da-bbda-e84af9a38caa.png">
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523180-fa5a7764-e6e7-4162-b1ee-4395ec50e002.png">
<h3>3. Models</h3>
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523249-3da523fd-7ad4-48e1-a6c1-fb0fd3fea31d.png">
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523257-0a77b562-c65c-4f9d-b6e7-7382596a50e4.png">

<h3>4. Services</h3>
 Pour recuprer les données depuis un autre service, il faut ajouter la dépendance 
          
         <dependency>
             <groupId>org.springframework.cloud</groupId>
             <artifactId>spring-cloud-starter-openfeign</artifactId>
         </dependency>
 
<img width=width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523274-86966cea-8130-430a-b35b-57a64b7c0f2e.png">
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523292-3a0298a1-7dd5-4b15-ae6c-baa2c60610b3.png">

<h3>5. Web</h3>
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523323-3c7bceaf-1b3d-4ed6-b4c7-fd9d91c7a1a9.png">

<h3>6.Configuration</h3>
<h3>7. Captures de tests</h3>
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523548-c1bc3983-b598-426a-b0bf-ba215a6c2b60.png">
 <img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205523663-32b5e8ad-dbe4-4ecc-9de3-eff2bf7f0b1e.png">

<H2><code>GateWay-service</code></H2>
<h3>1. Dépendances </h3>
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205518289-2d9cb919-80db-43b3-8243-305588b57a4f.png">
 <h3>2. Configuration dynamique des routes </h3>
 
       @Bean
       DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp){
             return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);
        }
 <h3>3. Fichier de configuration </h3>
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205521796-d4594c7d-dfec-4ddf-a2c8-31e47e54075b.png">
