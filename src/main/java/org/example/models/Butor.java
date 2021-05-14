package org.example.models;

public class Butor extends Aru {
    public Butor(AruType aruType, String id, String nev,   int ar) {
        super(aruType, id, nev, ar);
    }

    public Butor(Butor butor) {
        this.setAruType(aruType);
        this.setId(id);
        this.setNev(nev);
        this.setAr(ar);

    }

    public Butor() {
        
    }
}
