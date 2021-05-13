package org.example.factory;

public class RaktarFactory {
    private RaktarFactory(){
    }
    //private static Factory instance = new Factory(); --> Mohó singleton
    //Lusta singleton
    private static RaktarFactory instance ;
    public static RaktarFactory getInstance(){
        if (instance ==null) {
            instance = new RaktarFactory();
        }
        return instance;
    }
        //abstact factory
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
