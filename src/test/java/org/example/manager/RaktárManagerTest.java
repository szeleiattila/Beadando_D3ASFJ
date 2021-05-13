package org.example.manager;

import org.example.factory.RaktarFactory;
import org.example.factory.Raktár;
import org.example.factory.ÉlelmiszerRaktár;
import org.example.models.Aru;
import org.example.models.AruType;
import org.junit.Test;

import java.util.Observable;
import java.util.Observer;

import static org.junit.Assert.*;

public class RaktárManagerTest {

    @Test
    public void testIfObserversupdated(){
        MockObserver observer = new MockObserver();
        Raktár observable = new ÉlelmiszerRaktár();
        observable.addObserver(observer);
        observable.addAru(new Aru(AruType.élelmiszer,"1a2ds","Kenyér",100,200));

        assertTrue(observer.updated);
    }

}

class MockObserver implements Observer {
    boolean updated = false;

    @Override
    public void update(Observable o, Object arg) {
        updated = true;
    }
}