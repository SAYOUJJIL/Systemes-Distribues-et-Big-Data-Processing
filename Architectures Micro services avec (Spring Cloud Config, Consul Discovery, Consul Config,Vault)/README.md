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
<img width="686"  alt="image" src="https://user-images.githubusercontent.com/85376207/205517329-3c289539-f015-4c13-8a19-eb0a2d8d258f.png">
<H2><code>Spring Cloud Config</code></H2>
<h3>1. Dépendances </h3>
  * Config Server<BR>
  * Spring Actuator<BR>
  * Consul Discovery<BR>
<h3>2. ConfigServiceApplication </h3>
<img width="686" alt="image" src="https://user-images.githubusercontent.com/85376207/205517853-18d0b905-42d8-4abd-8f00-399762a29eaa.png">
<h3>3. Configuration </h3>
<img width="686"  alt="image" src="https://user-images.githubusercontent.com/85376207/205517885-8348bd85-e006-42d1-bbb8-49e9f3409839.png">

<H2><code>Customer-service</code></H2>
<h3>1. Dépendances </h3>
<img width="595" alt="image" src="https://user-images.githubusercontent.com/85376207/205518087-fb7212c8-e5aa-4793-ba2b-33e41275b1f9.png">

<H2><code>Billing-service</code></H2>
<h3>1. Dépendances </h3>
<img width="595" alt="image" src="https://user-images.githubusercontent.com/85376207/205518087-fb7212c8-e5aa-4793-ba2b-33e41275b1f9.png">

<H2><code>Inventory-service</code></H2>
<h3>1. Dépendances </h3>
<img width="595" alt="image" src="https://user-images.githubusercontent.com/85376207/205518087-fb7212c8-e5aa-4793-ba2b-33e41275b1f9.png">

<H2><code>Order-service</code></H2>
<h3>1. Dépendances </h3>
<img width="595" alt="image" src="https://user-images.githubusercontent.com/85376207/205518087-fb7212c8-e5aa-4793-ba2b-33e41275b1f9.png">

<H2><code>GateWay-service</code></H2>
<h3>1. Dépendances </h3>
<img width="473" alt="image" src="https://user-images.githubusercontent.com/85376207/205518289-2d9cb919-80db-43b3-8243-305588b57a4f.png">
