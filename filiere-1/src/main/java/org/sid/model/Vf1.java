package org.sid.model;

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Immutable

public class Vf1 {
    @Id
    @Column(name="CODE")
    private long code;
    
    @Column(name="NOM")
    private String nom;
    
    @Column(name="PRENOM")
    private String prenom;
    
    @Column(name="SPECIALITE")
    private String specialite;
    
    @Column(name="VILLE")
    private String ville;
    
    public Vf1() {
    }
    
    public Vf1(long code, String nom, String prenom, String specialite, String ville) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.ville = ville;
    }
    
    // getters et setters
    public long getCode() {
        return code;
    }
    
    public void setCode(long code) {
        this.code = code;
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
    
    public String getSpecialite() {
        return specialite;
    }
    
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    public String getVille() {
        return ville;
    }
    
    public void setVille(String ville) {
        this.ville = ville;
    }
}
