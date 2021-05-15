package org.example.factory;

import org.example.manager.Observer;
import org.example.models.Aru;

public class ÉlelmiszerRaktár implements Raktár, Observer {

    @Override
    public void addAru() {
        System.out.println("Hozzáadtunk egy árut az élelmiszer raktárunkhoz.");
    }

    @Override
    public void removeAru(Aru aru) {
        System.out.println("elfogyott egy áru az élelmiszer raktárunkból");
    }

    @Override
    public void updateAru(Aru aru) {
        System.out.println("Az élelmiszer raktárkészlete megváltozott.");
    }

    @Override
    public void update(String msg) {
        System.out.println("Az élelmiszer raktárkészlete megváltozott");
    }
}
