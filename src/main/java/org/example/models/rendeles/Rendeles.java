package org.example.models.rendeles;

import org.example.models.Vasarlo;

import java.util.List;

public class Rendeles {
    private Vasarlo vasarlo;
    private List<RendelesiElemek> bevasarloLista;


    public Rendeles(Vasarlo vasarlo, List<RendelesiElemek> rendelesiLista) {
        this.vasarlo = vasarlo;
        this.bevasarloLista = rendelesiLista;

    }

    public Vasarlo getVasarlo() {
        return vasarlo;
    }

    public List<RendelesiElemek> getRendelesiLista() {
        return bevasarloLista;
    }

}
