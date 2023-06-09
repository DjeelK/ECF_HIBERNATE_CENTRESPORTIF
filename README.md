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

### 4- Création fichier service 
       
       Création fichier nécessaire au lancement de la BDD MySQL : 

     - Création d'un fichier BaseService 
     - Création d'un AdherentService qui héritera de BaseService
     - Création de l'ihm + début d'un menu pour mettre lien entre service et ihm
     - Création d'un nouvel adherentService + lancement du menu pour voir si connexion avec bdd fonctionnelle.

### 5- Création de la BDD sur MySQL

    cf. fichier bdd_MySQL

### 6- Test récupération Adherent 

### 7- Créations des autres services et méthodes dans IHM 

### 8- Test final 
    
    - Phase de test pour s'assurer que tout est fonctionnel. 

### Axes d'améliorations 

    - Faire menu plus court en ayant recours à des méthodes composées de switch qui pourraient être rappelées dans le menu 
      afin de n'avoir que trois choix (gestion des adhérents, gestion des services, gestion des catégories)
    - Faire des restrictions au niveau de l'adhérent : ne pas rendre possible l'ajout d'une même personne, catégorie, activités (éviter les doublons)
    - Restriction au niveau des données (au niveau des entrées utilisateurs comme le téléphone, le mail, récupérer des miniscules ou majuscultes etc.)
    - Réaliser des méthodes qui permettent d'afficher exclusivement les adhérents par saisie de catégorie ou d'activités.
    - Rajouter des options supplémentaires comme par exemple : déterminer un nombre de participants par activités maximum (si nombre dépassé, impossibilité de s'inscrire au cours)
    - Rajouter des options "completed" quand activité réalisées afin de suivre toutes les activités effectuées.
    - Restriction au niveau des ajouts d'activité : ne pas pouvoir avoir plusieurs activités qui ont lieu le même jour à la même date.
    - Revoir les cascades pour éviter que lorsque l'on supprime un élement, cela supprime tout. 

    












