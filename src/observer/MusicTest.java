package observer;

public class MusicTest {
    public static void main(String[] args) {
        MusicData musicData = new MusicData();
        Observer yandexMusic = new YandexMusic(musicData);
        Observer appleMusic = new AppleMusic();

        musicData.setAlbum("Imagine Dragons 'Evolve'");

        musicData.addObserver(appleMusic);

        musicData.setAlbum("Black Eyed Peas 'The beginning'");

        System.out.println(yandexMusic);
        System.out.println(appleMusic);

        musicData.deleteObserver(yandexMusic);

        musicData.setAlbum("Katy Perry 'Prism'");

        System.out.println(yandexMusic);
        System.out.println(appleMusic);
    }
}
