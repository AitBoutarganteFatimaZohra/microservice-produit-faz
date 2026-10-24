package com.faz.microservice.produit.dao;

import java.util.List;

/**
 * Interface DAO generique.
 * Permet de factoriser les operations CRUD pour toutes les entites.
 */
public interface IDaoFaz<T> {

    void save(T entity);
    void update(T entity);
    void delete(T entity);
    T findById(Long id);
    List<T> findAll();
}