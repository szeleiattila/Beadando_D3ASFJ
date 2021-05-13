package org.example.models;


import lombok.Data;

@Data
public abstract class Aru {
    public Aru(AruType aruType ,String id, String nev, int keszlet, int ar) {

        this.aruType = aruType;
        this.id = id;
        this.nev = nev;
        this.keszlet = keszlet;
        this.ar = ar;
    }
    private AruType aruType;
    private String id;
    private String nev;
    private int keszlet;
    private int ar;


}
