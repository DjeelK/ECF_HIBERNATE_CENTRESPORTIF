package org.example.services;

import org.example.entities.Activite;
import org.example.entities.Categorie;
import org.example.interfaces.Repository;

import java.util.List;

public class CategorieService extends BaseService implements Repository<Categorie> {

    public CategorieService(){
        super();
    }
    @Override
    public boolean create(Categorie o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Categorie o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Categorie findById(int id) {
        Categorie categorie = null;
        session = sessionFactory.openSession();
        categorie = (Categorie) session.get(Categorie.class,id);
        session.close();
        return categorie;
    }


    public void addCategorieToActivite(int activiteId, int categorieId) {
        session = sessionFactory.openSession();
        session.beginTransaction();

        Activite activite = session.get(Activite.class, activiteId);
        Categorie categorie = session.get(Categorie.class, categorieId);
        activite.setCategorie(categorie);
        session.update(activite);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public boolean update(Categorie o) {
        return false;
    }
    @Override
    public List<Categorie> findAll() {
        return null;
    }


}
