package Musik;

import java.util.ArrayList;
import java.util.List;

public class MainSpotify {
    public static void main(String[] args) {
        List<MediaAudio> playlist = new ArrayList<>();
        playlist.add(new lagu("Hati-Hati di Jalan", 220, "Tulus"));
        playlist.add(new Podcast("Teknologi Hari Ini", 1800, "Raka"));
        playlist.add(new lagu("Pelukku untuk Pelikmu", 250, "Fiersa Besari"));

        for (MediaAudio media : playlist) {
            media.putarAudio();
        }
    }
}