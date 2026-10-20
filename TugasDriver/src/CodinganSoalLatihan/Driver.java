package CodinganSoalLatihan;

public class Driver {
    private String idDriver;
    private String nama;
    private boolean statusTersedia;
    private PesananFood pesananAktif;

    public Driver(String idDriver, String nama) {
        this.idDriver = idDriver;
        this.nama = nama;
        this.statusTersedia = true;
    }

    public void terimaPesanan(PesananFood pesanan) {
        if (statusTersedia) {
            this.pesananAktif = pesanan;
            this.statusTersedia = false;
            pesanan.setDriver(this);
            System.out.println("Driver " + nama + " menerima pesanan "
                    + pesanan.getIdPesanan());
        } else {
            System.out.println("Driver " + nama + " sedang sibuk.");
        }
    }

    public String getNama() { return nama; }
    
    public String getIdDriver() { return idDriver; }
    public PesananFood getPesananAktif() { return pesananAktif; }
}
