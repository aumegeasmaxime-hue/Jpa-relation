package com.exampleRelationJPA.Maxime.model;

import jakarta.persistence.*;

@Entity
public class Livre {
    @Id
    @GeneratedValue
    private Long id;
    private String titre;

    @ManyToOne
    @JoinColumn(name = "auteur_id")
    private Auteur auteur;

    public Livre() {
    }

    public Livre(String titre, Auteur auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }
}
