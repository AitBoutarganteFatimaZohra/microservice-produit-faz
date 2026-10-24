package com.faz.microservice.produit.dao;

import com.faz.microservice.produit.entity.ProduitFaz;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProduitFazDaoImpl implements IDaoFaz<ProduitFaz> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(ProduitFaz produitFaz) {
        sessionFactory.getCurrentSession().save(produitFaz);
    }

    @Override
    public void update(ProduitFaz produitFaz) {
        sessionFactory.getCurrentSession().update(produitFaz);
    }

    @Override
    public void delete(ProduitFaz produitFaz) {
        sessionFactory.getCurrentSession().delete(produitFaz);
    }

    @Override
    public ProduitFaz findById(Long id) {
        return sessionFactory.getCurrentSession().get(ProduitFaz.class, id);
    }

    @Override
    public List<ProduitFaz> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery("FROM ProduitFaz", ProduitFaz.class)
                .list();
    }
}