package org.example.manager;

import java.util.Observable;

public class Observer implements java.util.Observer {
    private String name ;

    @Override
    public void update(Observable o, Object arg) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
