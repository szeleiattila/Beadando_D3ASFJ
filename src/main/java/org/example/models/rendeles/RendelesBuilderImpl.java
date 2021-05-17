package org.example.models.rendeles;

import org.example.models.Vasarlo;

import java.util.List;
import java.util.Random;

public class RendelesBuilderImpl implements RendelesBuilder{
    private RendelesBuilderImpl rendelesBuilder;

    private Vasarlo vasarlo;
    private List<RendelesiElemek> rendelesiLista;


    @Override
    public RendelesBuilder setVasarlo(Vasarlo vasarlo) {
        this.vasarlo= vasarlo;
        return this;
    }

    @Override
    public RendelesBuilder setRendelesiLista(List<RendelesiElemek> rendelesiLista) {
        this.rendelesiLista = rendelesiLista;
        return this;
    }

    @Override
    public Rendeles build() {
        return new Rendeles(vasarlo,rendelesiLista);
    }
}
