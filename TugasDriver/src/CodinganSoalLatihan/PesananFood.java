package CodinganSoalLatihan;

public class PesananFood {
    private String idPesanan;
    private String namaMenu;
    private double totalHarga;
    private Driver driver; 

    public PesananFood(String idPesanan, String namaMenu) {
        this.idPesanan = idPesanan;
        this.namaMenu = namaMenu;
        this.totalHarga = 0;
    }

    public void hitungTotal(double hargaSatuan, int jumlah) {
        if (hargaSatuan > 0 && jumlah > 0) {
            this.totalHarga = hargaSatuan * jumlah;
        } else {
            System.out.println("Harga dan jumlah harus lebih dari 0!");
        }
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public String getIdPesanan() { return idPesanan; }
    public String getNamaMenu() { return namaMenu; }

    public void setDriver(Driver driver) { this.driver = driver; }
    public Driver getDriver() { return driver; }
}
