package org.example.factory;

import org.example.manager.Observer;
import org.example.manager.RaktárManager;
import org.omg.CORBA.Object;

public class RaktarFactory{
    private RaktarFactory(){
    }
    //private static Factory instance = new Factory(); --> Mohó singleton
    //Lusta singleton
    private static RaktárManager rmInstance ;
    public static RaktárManager getRmInstance(){
        if(rmInstance==null){
            rmInstance= new RaktárManager();
        }
        return  rmInstance;
    }
    private static RaktarFactory instance ;
    public static RaktarFactory getInstance(){
        if (instance ==null) {
            instance = new RaktarFactory();
        }
        return instance;
    }

    public Raktár makeRaktár(char raktarType){
        switch (raktarType){
            case 'b':
                return new BútorRaktár();
            case 'e':
                return new ÉlelmiszerRaktár();
            default:
                return null;
        }
    }


}
