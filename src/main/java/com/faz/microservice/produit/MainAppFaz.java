package com.faz.microservice.produit;

import com.faz.microservice.produit.config.AppConfigFaz;
import com.faz.microservice.produit.entity.ProduitFaz;
import com.faz.microservice.produit.service.ProduitFazService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppFaz {

    public static void main(String[] args) {
        System.out.println("=== TP Microservice Produit (Faz) ===\n");

        AnnotationConfigApplicationContext contexteFaz =
                new AnnotationConfigApplicationContext(AppConfigFaz.class);

        ProduitFazService produitServiceFaz =
                contexteFaz.getBean(ProduitFazService.class);

        ProduitFaz produitFaz = new ProduitFaz("Microservice Gateway", 149.99);
        produitServiceFaz.addProduitFaz(produitFaz);

        int totalFaz = produitServiceFaz.getAllProduitsFaz().size();
        System.out.println("\n✅ Produit ajoute avec succes !");
        System.out.println("Total en base : " + totalFaz);

        contexteFaz.close();
    }
}