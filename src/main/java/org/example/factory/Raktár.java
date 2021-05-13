package org.example.factory;


import org.example.models.Aru;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public interface Raktár extends Observable {

    //private Raktár(){};
     static Raktár instance =null;

     List<Aru> aruList = new ArrayList<>();

    public static Raktár getInstance(){
        if(instance==null){
            instance= new Raktár();

        }
        return instance;
    }

    private void raktárkészletChange(){
        setChanged();
        notifyObservers();
    }

    public void addAru(Aru aru){
            this.aruList.add(aru);
            raktárkészletChange();

    }

    public void removeAru(Aru aru){
        this.aruList.remove(aru);
        raktárkészletChange();

    }


    public List<Aru> getData(){
        return this.aruList;
    }

    @Override
    public String toString() {
        return "Raktár{" +
                "limit=" + limit +
                ", aruList=" + aruList +
                '}';
    }
}
