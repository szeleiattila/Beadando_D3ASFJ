package org.example.models;

import org.example.factory.BútorRaktár;
import org.example.factory.RaktarFactory;
import org.example.factory.Raktár;
import org.example.factory.ÉlelmiszerRaktár;

public class AruFactory {
    private static AruFactory instance ;
    public static AruFactory getInstance(){
        if (instance ==null) {
            instance = new AruFactory();
        }
        return instance;
    }

    public Aru makeAru(AruType aruType){
        switch (aruType){
            case élelmiszer:
                return new Elelmiszer(AruType.élelmiszer,"01","Kifli",100);
            case bútor:
                return new Butor(AruType.bútor,"01","Kanapé", 10000);
            default:
                return null;
        }
    }
}
