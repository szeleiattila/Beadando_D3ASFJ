package org.example.manager;

public interface Subject {

   void addObserver(org.example.manager.Observer o);
    void deleteObserver(Observer o) ;
    void notifyObserver();

}
