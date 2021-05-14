package org.example.models;

import lombok.Data;
import org.example.factory.RaktarFactory;
import org.example.factory.Raktár;

import java.util.ArrayList;
import java.util.List;

@Data
public class Rendeles {

    Vasarlo vasarlo;
    private int id;
    private int mennyiseg;
    private int ar; //teljes összeg



}
