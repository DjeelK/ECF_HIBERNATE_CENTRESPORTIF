# ECF_HIBERNATE_CENTRESPORTIF

### **SUJET**

"Créez une application de console Java qui permet à un utilisateur d'interargir avec le système de gestion d'un centre sportif"

**Fonctionnalités utilisées**

MySQL, Hibernate

### **ETAPES CREATION APPLICATION**

### 1- Etablir les entités dont je vais avoir besoin pour mon application : 

   -> Entité adhérent

   -> Classe adresse

   -> Entité catégorie

   -> Entité activité

### 2- Etablir les relations que les classes entretiendront entre elles : 

<u> Entre adhérent et activités </u>

**Relation OneToMany** : un adhérent peut avoir plusieurs activités, plusieurs activités peuvent être reliées à un adhérent.

Relation bi-directionnelle : Il est possible de récupérer un adhérent grâce à ses activités et de récupérer les adhérents via les activités.

<u> Entre catégorie et activités </u>

**Relation OneToOne** : Une catégorie ne peut posséder qu'une activité et une activité ne peut être associé qu'à une catégorie.

Relation bi-directionnelle : Il est possible de récupérer une catégorie grâce aux activités et une activité grâce à sa catégorie. 

### 3- Création des entités avec attributs et mise en relation 

### 4- Création de la BDD sur MySQL 




