package com.faz.microservice.produit.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "produit_faz")
public class ProduitFaz implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produit_faz")
    private Long id;

    @Column(name = "nom_produit_faz", nullable = false)
    private String nomFaz;

    @Column(name = "prix_produit_faz", nullable = false)
    private double prixFaz;

    // Constructeurs
    public ProduitFaz() {}

    public ProduitFaz(String nomFaz, double prixFaz) {
        this.nomFaz = nomFaz;
        this.prixFaz = prixFaz;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomFaz() { return nomFaz; }
    public void setNomFaz(String nomFaz) { this.nomFaz = nomFaz; }

    public double getPrixFaz() { return prixFaz; }
    public void setPrixFaz(double prixFaz) { this.prixFaz = prixFaz; }

    @Override
    public String toString() {
        return "ProduitFaz{id=" + id + ", nom='" + nomFaz + "', prix=" + prixFaz + "}";
    }
}