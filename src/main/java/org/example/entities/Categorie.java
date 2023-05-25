package org.example.entities;

import javax.persistence.*;

@Entity
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_categorie;
    private String titre_categorie;

    @OneToOne(mappedBy = "categorie", cascade = CascadeType.ALL)
    private Activite activite;

    public Categorie() {
    }

    public Categorie(String titre_categorie, Activite activite) {
        this.titre_categorie = titre_categorie;
        this.activite = activite;
    }

    public Categorie(String titre_categorie) {
        this.titre_categorie = titre_categorie;
    }
    //Getters et Setters

    public int getId_categorie() {
        return id_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }

    public String getTitre_categorie() {
        return titre_categorie;
    }

    public void setTitre_categorie(String titre_categorie) {
        this.titre_categorie = titre_categorie;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    //ToString pour affichage console


    @Override
    public String toString() {
        return "Categorie{" +
                "id_categorie=" + id_categorie +
                ", titre_categorie='" + titre_categorie + '\'' +
                ", activite=" + activite +
                '}';
    }
}
