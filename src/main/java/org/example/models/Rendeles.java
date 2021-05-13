package org.example.models;

import lombok.Data;
import org.example.factory.RaktarFactory;
import org.example.factory.Raktár;

import java.util.ArrayList;
import java.util.List;

@Data
public class Rendeles {

    List<Aru> aruList = new ArrayList<Aru>();
    Vasarlo vasarlo;
    private int id;
    private int mennyiseg;
    private int ar; //teljes összeg


    public void testRendeles(){
        Aru aru = new Aru(AruType.élelmiszer,"1a2ds","Kenyér",100,200);
        Raktár.getInstance().removeAru(aru);
        System.out.println("kivettem egy árut: "+ aru.toString());
    }






}
