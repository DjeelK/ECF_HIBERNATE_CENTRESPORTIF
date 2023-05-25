package org.example.services;

import org.example.entities.Activite;
import org.example.entities.Adherent;
import org.example.interfaces.Repository;
import org.hibernate.query.Query;

import java.util.List;

public class ActiviteService extends BaseService implements Repository<Activite> {

    public ActiviteService() {
        super();
    }
    @Override
    public boolean create(Activite o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Activite o) {
        return false;
    }

    @Override
    public boolean delete(Activite o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Activite findById(int id) {
        Activite activite = null;
        session = sessionFactory.openSession();
        activite = (Activite) session.get(Activite.class,id);
        session.close();
        return activite ;
    }

    @Override
    public List<Activite> findAll() {
        List<Activite> activiteList = null;
        session = sessionFactory.openSession();
        Query<Activite> activiteQuery = session.createQuery("from Activite ");
        activiteList  = activiteQuery.list();
        session.close();
        return activiteList;
    }

    public void addAdherentToActivite(Adherent adherent,Activite activite){
        session = sessionFactory.openSession();
        session.beginTransaction();
        activite.setAdherent(adherent);
        adherent.getActivites().add(activite);
        session.saveOrUpdate(adherent);
        session.getTransaction().commit();
        session.close();
    }
}
