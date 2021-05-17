package org.example.models.rendeles;

import org.example.models.Vasarlo;

import java.util.List;

public interface RendelesBuilder  {
    RendelesBuilder setVasarlo(Vasarlo vasarlo);
    RendelesBuilder setRendelesiLista(List<RendelesiElemek> rendelesiLista);
    Rendeles build();

}
