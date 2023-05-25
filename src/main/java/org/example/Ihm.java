package org.example;

import org.example.entities.Activite;
import org.example.entities.Adherent;
import org.example.entities.Categorie;
import org.example.services.ActiviteService;
import org.example.services.AdherentService;
import org.example.services.CategorieService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Ihm {
    private AdherentService adherentService;
    private ActiviteService activiteService;
    private CategorieService categorieService;
    private Scanner scanner;

    public Ihm() {
        adherentService = new AdherentService();
        activiteService = new ActiviteService();
        categorieService = new CategorieService();

        scanner = new Scanner(System.in);
    }

    public void start(){
        String choix;
        do {
            menu();
            choix = scanner.nextLine();
            switch (choix) {
                case "1":
                    addAdherent();
                    break;
                case "2":
                    updateAdherent();
                    break;
                case "3":
                    deleteAdherent();
                    break;
                case "4":
                    addActivite();
                    break;
                case "5":
                    deleteActivite();
                    break;
                case "6":
                    addCategorie();
                    break;
                case "7":
                    deleteCategorie();
                    break;
                case "8":
                    AddAdherentToActivite();
                    break;
                case "9":
                    AddActiviteToCategorie();
                    break;
                case "10":
                    adherentById();
                    break;
                case "11":
                    displayAllAdherents();
                    break;
            }
        } while(!choix.equals("0"));
    }

    private void menu() {
        System.out.println("########  Menu du Centre Sportif UTOPIOS (CSU) #########");
        System.out.println("1-- Créer un adhérent");
        System.out.println("2-- Modifier un adhérent par id");
        System.out.println("3-- Supprimer un adhérent par id");
        System.out.println("4-- Créer une activité");
        System.out.println("5-- Supprimer une activité par id");
        System.out.println("6-- Créer une catégorie");
        System.out.println("7-- Supprimer une catégorie par l'id");
        System.out.println("8-- Ajouter une activité à un adhérent");
        System.out.println("9-- Ajouter une catégorie à une activité");
        System.out.println("10-- Afficher un adhérent");
        System.out.println("11-- Afficher la liste des adhérents");
        System.out.println("0-- Quitter");
    }
    // Création d'un adhérent

    private void addAdherent() {
        System.out.println("Merci de saisir le nom de l'adhérent");
        String nom = scanner.nextLine();
        System.out.println("Merci de saisir le prénom de l'adhérent");
        String prenom = scanner.nextLine();
        System.out.println("Merci de saisir l'âge de l'adhérent");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Merci de saisir votre téléphone");
        String telephone = scanner.nextLine();
        System.out.println("Merci de saisir le mail de l'adhérent");
        String mail = scanner.nextLine();
        try {
            adherentService.create(new Adherent(nom,prenom,age,telephone,mail));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Adhérent par id

    private void adherentById(){
        scanner.nextLine();
        System.out.println("Merci de saisir l'id de l'adhérent");
        int id = scanner.nextInt();
        scanner.nextLine();
        Adherent a = adherentService.findById(id);
        System.out.println(a);
    }

    // Suppression d'un adhérent pour id

    private void deleteAdherent(){
        System.out.println("Merci de saisir l'id de l'adhérent à supprimer");
        int id = scanner.nextInt();
        scanner.nextLine();
        Adherent a = adherentService.findById(id);
        adherentService.delete(a);
    }

    // Modification d'un adhérent par id

    private void updateAdherent(){
        System.out.println("Merci de saisir l'id de l'adhérent à modifier");
        int id = scanner.nextInt();
        scanner.nextLine();
        Adherent a = adherentService.findById(id);
        System.out.println("Merci de saisir le nom");
        String nom = scanner.nextLine();
        a.setNom_adherent(nom);
        System.out.println("Merci de saisir le prénom");
        String prenom = scanner.nextLine();
        a.setPrenom_adherent(prenom);
        System.out.println("Merci de saisir l'âge");
        int age = scanner.nextInt();
        scanner.nextLine();
        a.setAge_adherent(age);
        System.out.println("Merci de saisir le téléphone");
        String telephone = scanner.nextLine();
        a.setTelephone_adherent(telephone);
        System.out.println("Merci de saisir l'adresse mail");
        String mail = scanner.nextLine();
        a.setMail_adherent(mail);
        try {
            adherentService.update(a);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // Affichage des adhérents

    private void displayAllAdherents () {
        List<Adherent> adherents = adherentService.findAll();
        for (Adherent ad: adherents) {
            System.out.println(ad);
            System.out.println(ad.toString());
        }
    }

    // Création d'une activité

    private void addActivite() {
        System.out.println("Merci de saisir le titre de l'activité");
        String titre = scanner.nextLine();
        System.out.println("Merci de saisir la date de l'activité (dd/MM/yyyy) : ");
        String date_activite = scanner.nextLine();
        System.out.println("Merci de saisir la durée de l'activité (en mn)");
        int duree = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Merci de saisir le niveau de difficulté de 1 à 3");
        int difficulte = scanner.nextInt();
        scanner.nextLine();
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(date_activite);
            activiteService.create(new Activite(titre,date,duree,difficulte));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Supression d'une activité

    private void deleteActivite(){
        System.out.println("Merci de saisir l'id de l'activité à supprimer");
        int id = scanner.nextInt();
        scanner.nextLine();
        Activite a = activiteService.findById(id);
        activiteService.delete(a);
    }

    // Ajouter une activité à un adhérent

    public void AddAdherentToActivite() {
        System.out.println("Entrez l'id de l'adhérent");
        int id_adherent = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entrez l'id de l'activité");
        int id_activite = scanner.nextInt();
        scanner.nextLine();

        AdherentService adherentService = new AdherentService();
        ActiviteService activiteService = new ActiviteService();

        Adherent adherent = adherentService.findById(id_adherent);
        Activite activite = activiteService.findById(id_activite);

        if (adherent != null && activite != null) {
            activiteService.addAdherentToActivite(adherent, activite);
            System.out.println("L'activité a été ajoutée à l'adhérent avec succès.");
        } else {
            System.out.println("L'adhérent ou l'activité n'existe pas.");
        }
    }

    // Création d'une catégorie

    private void addCategorie() {
        System.out.println("Merci de saisir le titre de la catégorie");
        String titre = scanner.nextLine();
        try {
            categorieService.create(new Categorie(titre));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void categorieById(){
        scanner.nextLine();
        System.out.println("Merci de saisir l'id de la catégorie");
        int id = scanner.nextInt();
        scanner.nextLine();
        Categorie c = categorieService.findById(id);
        System.out.println(c);
    }
    // Suppression d'une catégorie

    private void deleteCategorie(){
        System.out.println("Merci de saisir l'id de la catégorie à supprimer");
        int id = scanner.nextInt();
        scanner.nextLine();
        Categorie c = categorieService.findById(id);
        categorieService.delete(c);
    }

    // Ajouter une catégorie à une activité

    public void AddActiviteToCategorie() {
        System.out.println("Entrez l'id de l'activité");
        int id_activite = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entrez l'id de la catégorie");
        int id_categorie = scanner.nextInt();
        scanner.nextLine();

        ActiviteService activiteService = new ActiviteService();
        CategorieService categorieService = new CategorieService();

        Activite activite = activiteService.findById(id_activite);
        Categorie categorie = categorieService.findById(id_categorie);

        if (categorie != null && activite != null) {
            categorieService.addCategorieToActivite(id_activite,id_categorie);
            System.out.println("L'activité a été ajoutée à la catégorie avec succès.");
        } else {
            System.out.println("La catégorie ou l'activité n'existe pas.");
        }
    }

}
