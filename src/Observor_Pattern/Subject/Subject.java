package Observor_Pattern.Subject;

import Observor_Pattern.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
