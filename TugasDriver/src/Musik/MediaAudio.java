package Musik;

public abstract class MediaAudio {
    private String judul;
    private int durasi; 

    public MediaAudio(String judul, int durasi) {
        this.judul = judul;
        this.durasi = durasi;
    }

    public String getJudul() { return judul; }
    public int getDurasi() { return durasi; }

    public abstract void putarAudio(); 
}
