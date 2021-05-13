package org.example.consoleClient;

import org.example.factory.RaktarFactory;
import org.example.factory.Raktár;
import org.example.models.Beszallito;
import org.example.models.Rendeles;

public class Kliens {

private final RaktarFactory raktarFactory;

    public Kliens(RaktarFactory raktarFactory) {
        this.raktarFactory = raktarFactory;
    }
    public void demo (char raktarType) {
        Raktár raktár = raktarFactory.makeRaktár(raktarType);
        //raktár.addAru();
    }
}
