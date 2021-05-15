package org.example.models;
import lombok.Data;
import org.example.exceptions.AruNotFound;
import java.util.ArrayList;
import java.util.Collection;

@Data
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

    public AruType getAruType() {
        return aruType;
    }

    public void setAruType(AruType aruType) {
        this.aruType = aruType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public Aru() {

    }
    public Aru readAruById(String id) throws AruNotFound {
        Collection<Aru> aruk = new ArrayList<Aru>();
        for (Aru a: aruk  ){
            if(a.getId().equals(id)){
                return a;
            }
        }
        return null;
    }



}
