package org.example.factory;


import org.example.manager.Observer;
import org.example.models.Aru;

public class BútorRaktár implements Raktár, Observer {




    @Override
    public void addAru() {
        System.out.println("Hozzáadtam egy Bútort a bútorraktárhoz." );
    }

    @Override
    public void removeAru(Aru aru) {
        System.out.println("Elfogyott egy bútor a raktárból." );
    }

    @Override
    public void updateAru(Aru aru) {
        System.out.println("Megváltozott az árukészlet a bútorraktárban");
    }

    @Override
    public void update(String msg) {
        System.out.println("A bútorraktár készlete megváltozott");
    }
}
