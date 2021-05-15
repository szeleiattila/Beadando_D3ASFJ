package org.example.models;

import org.example.exceptions.AruNotFound;

public class Elelmiszer extends Aru {
    public Elelmiszer(AruType aruType, String id, String nev, int ar) {
        super(aruType, id, nev,  ar);
    }

    public Elelmiszer() {
        super();
    }

    @Override
    public Aru readAruById(String id) throws AruNotFound {
        return super.readAruById(id);
    }
}
