# Projet Veto

### Configurer le projet

Dans applications.properties, modifier les variables à sa convenance.
La table db_example doit exister pour lancer le projet.

spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_example
spring.datasource.username=root
spring.datasource.password=

### Lancer le projet

`mvnw clean spring-boot:run`

Et ensuite tout est accessible directement sur localhost:8080

### Groupe

Branly Sébastien
Réville Louis
Grouazel Thomas
Maugin Guillaume
Drouin Kiara
