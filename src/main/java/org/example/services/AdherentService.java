package org.example.services;

import org.example.entities.Adherent;
import org.example.interfaces.Repository;

import java.util.List;

public class AdherentService extends BaseService implements Repository<Adherent> {

    public AdherentService() {
        super();
    }

    @Override
    public boolean create(Adherent o) {
        return false;
    }

    @Override
    public boolean update(Adherent o) {
        return false;
    }

    @Override
    public boolean delete(Adherent o) {
        return false;
    }

    @Override
    public Adherent findById(int id) {
        return null;
    }

    @Override
    public List<Adherent> findAll() {
        return null;
    }
}
