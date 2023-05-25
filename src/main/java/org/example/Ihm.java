package org.example;

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
                    break;
                case "2":
                    break;
                case "3":
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
}
