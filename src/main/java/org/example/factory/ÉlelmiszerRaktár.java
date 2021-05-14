package org.example.factory;

import org.example.models.Aru;

public class ÉlelmiszerRaktár implements Raktár {

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
}
