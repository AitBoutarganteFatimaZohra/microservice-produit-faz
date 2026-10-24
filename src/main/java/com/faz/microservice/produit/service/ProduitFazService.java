package com.faz.microservice.produit.service;

import com.faz.microservice.produit.entity.ProduitFaz;

import java.util.List;

public interface ProduitFazService {

    void addProduitFaz(ProduitFaz produitFaz);
    List<ProduitFaz> getAllProduitsFaz();
}