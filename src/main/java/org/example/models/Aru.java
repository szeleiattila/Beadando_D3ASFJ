package org.example.models;


import lombok.Data;


public abstract class Aru {
    public Aru(AruType aruType ,String id, String nev, int ar) {

        this.aruType = aruType;
        this.id = id;
        this.nev = nev;

        this.ar = ar;
    }
    protected AruType aruType;
    protected String id;
    protected String nev;

    protected int ar;

    //id alapján lekérdezés


}
