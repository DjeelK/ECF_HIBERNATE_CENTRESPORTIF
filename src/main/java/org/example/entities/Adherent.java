package org.example.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Adherent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_adherent;
    private String nom_adherent;
    private String prenom_adherent;
    private int Age_adherent;
    private String telephone_adherent;
    private String mail_adherent;
    @OneToMany(mappedBy = "adherent", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Activite> activites;

    public Adherent() {
    }

    public Adherent(String nom_adherent, String prenom_adherent, int age_adherent, String telephone_adherent, String mail_adherent, List<Activite> activites) {
        this.nom_adherent = nom_adherent;
        this.prenom_adherent = prenom_adherent;
        Age_adherent = age_adherent;
        this.telephone_adherent = telephone_adherent;
        this.mail_adherent = mail_adherent;
        this.activites = activites;
    }

    public Adherent(String nom_adherent, String prenom_adherent, int age_adherent, String telephone_adherent, String mail_adherent) {
        this.nom_adherent = nom_adherent;
        this.prenom_adherent = prenom_adherent;
        Age_adherent = age_adherent;
        this.telephone_adherent = telephone_adherent;
        this.mail_adherent = mail_adherent;
    }
    // Getters et Setters

    public int getId_adherent() {
        return id_adherent;
    }

    public void setId_adherent(int id_adherent) {
        this.id_adherent = id_adherent;
    }

    public String getNom_adherent() {
        return nom_adherent;
    }

    public void setNom_adherent(String nom_adherent) {
        this.nom_adherent = nom_adherent;
    }

    public String getPrenom_adherent() {
        return prenom_adherent;
    }

    public void setPrenom_adherent(String prenom_adherent) {
        this.prenom_adherent = prenom_adherent;
    }

    public int getAge_adherent() {
        return Age_adherent;
    }

    public void setAge_adherent(int age_adherent) {
        Age_adherent = age_adherent;
    }

    public String getTelephone_adherent() {
        return telephone_adherent;
    }

    public void setTelephone_adherent(String telephone_adherent) {
        this.telephone_adherent = telephone_adherent;
    }

    public String getMail_adherent() {
        return mail_adherent;
    }

    public void setMail_adherent(String mail_adherent) {
        this.mail_adherent = mail_adherent;
    }

    public List<Activite> getActivites() {
        return activites;
    }

    public void setActivites(List<Activite> activites) {
        this.activites = activites;
    }

    //ToString affichage console

    @Override
    public String toString() {
        return "Adherent{" +
                "id_adherent=" + id_adherent +
                ", nom_adherent='" + nom_adherent + '\'' +
                ", prenom_adherent='" + prenom_adherent + '\'' +
                ", Age_adherent=" + Age_adherent +
                ", telephone_adherent='" + telephone_adherent + '\'' +
                ", mail_adherent='" + mail_adherent + '\'' +
                ", activites=" + activites +
                '}';
    }
}
