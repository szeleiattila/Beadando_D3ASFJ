package org.example.factory;


import org.example.models.Aru;

public class BútorRaktár implements Raktár {


    @Override
    public void addAru(Aru aru) {
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
}
