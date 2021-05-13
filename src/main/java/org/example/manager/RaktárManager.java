package org.example.manager;

import org.example.factory.Raktár;
import org.example.models.Aru;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class RaktárManager implements Observer {
    //obverser collection tárol

    private List<Aru> aruList = new ArrayList<>();

    @Override
    public void update(Observable o, Object arg) {
        aruList.addAll(((Raktár)o).getData());
    }
}
