package org.example.service.dao;

import org.example.exceptions.AruNotFound;
import org.example.models.Aru;

import java.util.Collection;

public interface RaktarDAO {
    void addAru(Aru aru);
    Collection<Aru> readAllAru();
    Aru readAru (String id) throws AruNotFound;
    Collection<Aru> readAruById(String id) throws AruNotFound;// throws AruNotFound;
    void updateAru(Aru aru);
    void deleteAru(Aru aru);
}
