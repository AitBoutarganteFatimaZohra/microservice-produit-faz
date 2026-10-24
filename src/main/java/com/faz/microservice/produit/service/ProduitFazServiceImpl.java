package com.faz.microservice.produit.service;

import com.faz.microservice.produit.dao.ProduitFazDaoImpl;
import com.faz.microservice.produit.entity.ProduitFaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProduitFazServiceImpl implements ProduitFazService {

    // ⚠️ On injecte l'implementation concrete, pas l'interface generique
    @Autowired
    private ProduitFazDaoImpl produitDaoFaz;

    @Override
    @Transactional
    public void addProduitFaz(ProduitFaz produitFaz) {
        if (produitFaz.getPrixFaz() < 0) {
            throw new IllegalArgumentException("Le prix ne peut pas etre negatif");
        }
        produitDaoFaz.save(produitFaz);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProduitFaz> getAllProduitsFaz() {
        return produitDaoFaz.findAll();
    }
}