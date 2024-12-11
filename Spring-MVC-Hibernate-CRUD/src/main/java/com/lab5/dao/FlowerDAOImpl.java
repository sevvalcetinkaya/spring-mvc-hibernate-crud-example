package com.lab5.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lab5.entity.Flower;

import java.util.List;

@Repository
class FlowerDAOImpl  implements  FlowerDAO{

    private final SessionFactory sessionFactory;

    @Autowired
    public FlowerDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Flower> getFlowers() {
        Session session = sessionFactory.getCurrentSession();
        Query<Flower> query;
        query = session.createQuery("from Flower", Flower.class);
        return query.getResultList();
    }

    @Override
    public void saveOrUpdate(Flower flower) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(flower);
    }

    @Override
    public Flower getFlower(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Flower.class,id);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("delete from Flower c where c.Id =:id");
        query.setParameter("id",id);
        query.executeUpdate();
    }
}
