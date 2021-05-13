package org.example.consoleClient;

import org.example.factory.Raktár;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class KliensTest {

    @InjectMocks //Ezt fogom tesztelni és amik mockolva vannak azokat beinjectálja
    Kliens kliens;

    @Mock
    Raktár raktár; //beinjectálja

    @Test
    public void demo(){

    }

}