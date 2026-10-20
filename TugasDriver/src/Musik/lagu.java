package Musik;

public class lagu extends MediaAudio {
    private String artis;

    public lagu(String judul, int durasi, String artis) {
        super(judul, durasi);
        this.artis = artis;
    }

    @Override
    public void putarAudio() {
        System.out.println("Memutar lagu: " + getJudul() + " - " + artis
                + " (" + getDurasi() + " detik)");
    }
}
