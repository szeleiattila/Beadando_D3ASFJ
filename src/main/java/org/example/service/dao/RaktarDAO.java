package org.example.service.dao;

import org.example.models.Aru;

import java.util.Collection;

public interface RaktarDAO {
    void addAru(Aru aru); // throws RaktarIsFull;
    Collection<Aru> readAllAru();
    Aru readAruById(String id);// throws AruNotFound;
    void updateAru(Aru aru);
    void deleteAru(Aru aru);
}
