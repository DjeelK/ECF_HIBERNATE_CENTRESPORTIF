# ECF_HIBERNATE_CENTRESPORTIF

### **SUJET**

"Créez une application de console Java qui permet à un utilisateur d'interargir avec le système de gestion d'un centre sportif"

**Fonctionnalités utilisées**

MySQL, Hibernate

### **ETAPES CREATION APPLICATION**

### 1- Etablir les classes dont je vais avoir besoin pour mon application : 

   -> Classe adhérent 

   -> Classe catégorie

   -> Classe activité 

### 2- Etablir les relations que les classes entretiendront entre elles : 

<u> Entre utilisateur et activités </u>

**Relation OneToMany** : un utilisateur peut avoir plusieurs activités, plusieurs activités peuvent être reliées à un utilisateur.

Relation bi-directionnelle : Il est possible de récupérer un utilisateur grâce à ses activités et de récupérer les adhérents via les activités.

<u> Entre catégorie et activités </u>

**Relation OneToOne** : Une catégorie ne peut posséder qu'une activité et une activité ne peut être associé qu'à une catégorie.

Relation bi-directionnelle : Il est possibible de récupérer une catégorie grâce aux activités et une activité grâce à sa catégorie. 




