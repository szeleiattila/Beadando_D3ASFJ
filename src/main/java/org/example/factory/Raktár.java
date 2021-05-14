package org.example.factory;


import org.example.models.Aru;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public interface Raktár {

     /*default void raktárkészletChange(){
        setChanged();
        notifyObservers();
    }*/
     int limit = 1000;
     void addAru();
     void removeAru(Aru aru);
     void updateAru(Aru aru);



}
