package com.faz.microservice.produit;

import com.faz.microservice.produit.config.AppConfigFaz;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Test de connexion : verifie que le contexte Spring
 * et la SessionFactory Hibernate s'initialisent correctement.
 */
public class TestHibernateFaz {

    public static void main(String[] args) {
        System.out.println("=== Test de connexion Spring + Hibernate ===\n");

        AnnotationConfigApplicationContext contexteFaz =
                new AnnotationConfigApplicationContext(AppConfigFaz.class);

        System.out.println("✅ Contexte Spring initialise avec succes !");
        System.out.println("✅ SessionFactory Hibernate operationnelle.");

        contexteFaz.close();
    }
}