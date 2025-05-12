package com.github.raphaelfontoura.designpatterns.observer;

import java.util.HashSet;
import java.util.Set;

public abstract class Observable {
    private Set<Observer> observers;

    public Observable() {
        observers = new HashSet<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    
}
