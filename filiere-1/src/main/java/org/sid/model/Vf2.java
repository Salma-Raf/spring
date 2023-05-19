package org.sid.model;
import org.hibernate.annotations.Immutable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Immutable
@Table(name="vf2")
public class Vf2 {
    
    @Id
    private String id;
    private String nom;
    
    public Vf2() {
        
    }
    
    public Vf2(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
}