package pembelajaran_3;

public class Biodata {
    private String fullname;
    private int usia;
    private String alamat;

    public void simpanData(String fullname, int usia, String alamat) {
        this.fullname = fullname;
        this.usia = usia;
        this.alamat = alamat;
    }

    public String getFullname() {
        return fullname;
    }

    public int getUsia() {
        return usia;
    }

    public String getAlamat() {
        return alamat;
    }
}
