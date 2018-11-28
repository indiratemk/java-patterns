package observer;

import java.util.ArrayList;
import java.util.List;


public class YandexMusic implements Observer {
    private List<String> music;
    private Observable musicData;

    public YandexMusic(MusicData musicData) {
        this.musicData = musicData;
        musicData.addObserver(this);
        music = new ArrayList<>();
    }

    @Override
    public void update(String album) {
        music.add(album);
        System.out.println("Yandex has new album: " + album);
    }

    @Override
    public String toString() {
        return "YandexMusic{" +
                "music=" + music +
                '}';
    }
}
