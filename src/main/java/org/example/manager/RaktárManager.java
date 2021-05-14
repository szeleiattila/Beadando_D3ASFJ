package org.example.manager;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import org.example.factory.Raktár;
import org.example.models.Aru;

import java.util.*;

public class RaktárManager implements Observable {
    //obverser collection tárol
    private Collection<Observer> raktarObserverek= new ArrayList<>();


    @Override
    public void addListener(InvalidationListener listener) {
        raktarObserverek.add((Observer) listener);

    }

    @Override
    public void removeListener(InvalidationListener listener) {
        raktarObserverek.remove(listener);
    }


    /*@Override
    public void update(Observable o, Object arg) {
        aruList.addAll(((Raktár)o).getData());
    }*/
}
