package org.sid.model;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Immutable

public class Vf3 {
    @Id
    @Column(name="CNE")
    private String cne;
    
    @Column(name="NOM")
    private String nom;
    
    @Column(name="PRENOM")
    private String prenom;
    
    @Column(name="ADRESS")
    private String adresse;
    
    public Vf3() {
    }
    
    public Vf3(String cne, String nom, String prenom, String adresse) {
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    
    // getters et setters
    public String getCne() {
        return cne;
    }
    
    public void setCne(String cne) {
        this.cne = cne;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public String getAdresse() {
        return adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
