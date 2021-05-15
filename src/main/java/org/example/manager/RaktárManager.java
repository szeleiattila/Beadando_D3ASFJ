package org.example.manager;

import java.util.*;

public class RaktárManager implements Subject {


    //obverser collection tárol
    private Collection<Observer> raktarObserverek= new ArrayList<>();

    @Override
    public void addObserver(org.example.manager.Observer o) {
        raktarObserverek.add(o);
    }

    @Override
    public void deleteObserver(org.example.manager.Observer o) {
        raktarObserverek.remove(o);
    }

    @Override
    public void notifyObserver() {
        System.out.println("A raktárkészlet megváltozott");
        for (Observer observer:raktarObserverek){
            observer.update("Változás");
        }
    }
}


