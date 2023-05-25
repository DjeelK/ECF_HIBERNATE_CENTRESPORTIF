package org.example;

import org.example.entities.Adherent;
import org.example.services.AdherentService;

import java.util.Scanner;

public class Ihm {
    private AdherentService adherentService;

    private Scanner scanner;

    public Ihm() {
        adherentService = new AdherentService();

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
                    break;
                case "3":
                    deleteAdherent();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                case "10":
                    break;

            }
        } while(!choix.equals("0"));
    }

    private void menu() {
        System.out.println("########  Menu du Centre Sportif UTOPIOS (CSU) #########");
        System.out.println("1-- Créer un adhérent");
        System.out.println("2-- Modifier un adhérent par id ");
        System.out.println("3-- Supprimer un adhérent par id ");
        System.out.println("4-- Créer une activité");
        System.out.println("5-- Modifier une activité par id");
        System.out.println("6-- Supprimer une activité par id");
        System.out.println("7-- Ajouter une activité à un adhérent");
        System.out.println("8-- Supprimer une activité à un adhérent");
        System.out.println("9-- Ajouter une catégorie à une activité");
        System.out.println("10-- Afficher la liste des adhérents");
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
        System.out.println("Merci de saisir l'id de l'adhérent");
        int id = scanner.nextInt();
        scanner.nextLine();
        Adherent a = adherentService.findById(id);
        System.out.println(a);
    }

    private void deleteAdherent(){
        System.out.println("Merci de saisir l'id de l'adhérent à supprimer");
        int id = scanner.nextInt();
        scanner.nextLine();
        Adherent a = adherentService.findById(id);
        adherentService.delete(a);
    }

}
