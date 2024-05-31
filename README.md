# Projet Veto

### Configurer le projet

Dans applications.properties, modifier les variables à sa convenance.
La table db_example doit absolument exister pour lancer le projet.

spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_example
spring.datasource.username=root
spring.datasource.password=

### Lancer le projet

Pour lancer l'entièreté du projet (Front & Back) :

`mvnw clean spring-boot:run`

Et ensuite tout est accessible :

-   Front : localhost:8080
-   API : localhost:8080/api/

### Groupe

Branly Sébastien
Réville Louis
Grouazel Thomas
Maugin Guillaume
Drouin Kiara
