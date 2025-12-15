package com.exampleRelationJPA.Maxime.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Auteur {
    @Id
    @GeneratedValue
    private Long id;
    private String prenom;

    @OneToMany (mappedBy = "auteur", cascade = CascadeType.ALL)
    private List<Livre> livres = new ArrayList<>();

    public Auteur() {
    }

    public Auteur(String prenom) {
        this.prenom = prenom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }
}
