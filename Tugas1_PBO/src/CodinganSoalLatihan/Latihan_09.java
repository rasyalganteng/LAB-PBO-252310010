package CodinganSoalLatihan;

public class Latihan_09 {

	import java.util.ArrayList;
	import java.util.List;

	abstract class MediaAudio {
	    protected String judul;
	    MediaAudio(String judul) { this.judul = judul; }
	    abstract void putarAudio();
	}

	class Lagu extends MediaAudio {
	    Lagu(String judul) { super(judul); }
	    @Override void putarAudio() {
	        System.out.println("Memutar lagu: " + judul);
	    }
	}

	class Podcast extends MediaAudio {
	    Podcast(String judul) { super(judul); }
	    @Override void putarAudio() {
	        System.out.println("Memutar podcast: " + judul);
	    }
	}

	
	class Audiobook extends MediaAudio {
	    Audiobook(String judul) { super(judul); }
	    @Override void putarAudio() {
	        System.out.println("Memutar audiobook: " + judul);
	    }
	}

	public class Soal9 {
	    public static void main(String[] args) {
	        List<MediaAudio> playlist = new ArrayList<>();
	        playlist.add(new Lagu("Hati-Hati di Jalan"));
	        playlist.add(new Podcast("Teknologi Hari Ini"));
	        playlist.add(new Audiobook("Laskar Pelangi"));

	        for (MediaAudio m : playlist) {
	            m.putarAudio(); 
	        }
	    }
	}
}
