package observer;

import java.util.ArrayList;
import java.util.List;

public class MusicData implements Observable {
    private List<Observer> observers;
    private String album;

    public MusicData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        if(observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(album);
        }
    }

    public void setAlbum(String album) {
        this.album = album;
        notifyObservers();
    }
}
