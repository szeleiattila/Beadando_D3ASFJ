package org.example.consoleClient;

import org.example.factory.RaktarFactory;
import org.example.factory.Raktár;

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
