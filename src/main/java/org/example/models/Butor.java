package org.example.models;

import org.example.exceptions.AruNotFound;

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

    @Override
    public Aru readAruById(String id) throws AruNotFound {
        return super.readAruById(id);
    }
}
