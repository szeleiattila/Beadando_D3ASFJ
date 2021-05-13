package org.example.models;

import lombok.Data;
import org.example.factory.RaktarFactory;
import org.example.factory.Raktár;
import org.example.factory.ÉlelmiszerRaktár;

import java.util.List;
@Data
public class Beszallito {


    public void testBeszallito(){
        Aru aru = new Aru(AruType.élelmiszer,"1a2ds","Kenyér",100,200);

        Raktár r = RaktarFactory.getInstance().makeRaktár('e');
        r.addAru(aru);

        System.out.println("Betettem a terméket: "+aru.toString());

    }
}
