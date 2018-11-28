package observer;

import java.util.ArrayList;
import java.util.List;

public class AppleMusic implements Observer {
    private List<String> music;
    private Observable musicData;

    public AppleMusic() {
        music = new ArrayList<>();
    }

    @Override
    public void update(String album) {
        music.add(album);
        System.out.println("Apple music has new album: " + album);
    }

    @Override
    public String toString() {
        return "AppleMusic{" +
                "music=" + music +
                '}';
    }

}
