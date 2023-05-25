package org.example.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Activite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_activite;
    private String titre_activite;
    @Temporal(TemporalType.DATE)
    private Date date_activite;
    private int duree_activite;
    private int niveau_difficulte;

    @ManyToOne
    @JoinColumn(name ="adherent_id")
    private Adherent adherent;

    @OneToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    public Activite() {
    }

    public Activite(String titre_activite, Date date_activite, int duree_activite, int niveau_difficulte, Adherent adherent, Categorie categorie) {
        this.titre_activite = titre_activite;
        this.date_activite = date_activite;
        this.duree_activite = duree_activite;
        this.niveau_difficulte = niveau_difficulte;
        this.adherent = adherent;
        this.categorie = categorie;
    }

    // Getters et Setters

    public int getId_activite() {
        return id_activite;
    }

    public void setId_activite(int id_activite) {
        this.id_activite = id_activite;
    }

    public String getTitre_activite() {
        return titre_activite;
    }

    public void setTitre_activite(String titre_activite) {
        this.titre_activite = titre_activite;
    }

    public Date getDate_activite() {
        return date_activite;
    }

    public void setDate_activite(Date date_activite) {
        this.date_activite = date_activite;
    }

    public int getDuree_activite() {
        return duree_activite;
    }

    public void setDuree_activite(int duree_activite) {
        this.duree_activite = duree_activite;
    }

    public int getNiveau_difficulte() {
        return niveau_difficulte;
    }

    public void setNiveau_difficulte(int niveau_difficulte) {
        this.niveau_difficulte = niveau_difficulte;
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }


    // ToString pour affichage console


    @Override
    public String toString() {
        return "Activite{" +
                "id_activite=" + id_activite +
                ", titre_activite='" + titre_activite + '\'' +
                ", date_activite=" + date_activite +
                ", duree_activite=" + duree_activite +
                ", niveau_difficulte=" + niveau_difficulte +
                ", adherent=" + adherent +
                ", categorie=" + categorie +
                '}';
    }
}


