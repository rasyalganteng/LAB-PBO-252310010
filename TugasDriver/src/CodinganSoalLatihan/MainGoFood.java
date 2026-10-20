package CodinganSoalLatihan;

public class MainGoFood {
    public static void main(String[] args) {
        PesananFood pesanan = new PesananFood("PSN-001", "Nasi Goreng");
        pesanan.hitungTotal(25000, 2);

        Driver driver = new Driver("DRV-01", "Andi");
        driver.terimaPesanan(pesanan);

        System.out.println("Menu         : " + pesanan.getNamaMenu());
        System.out.println("Total Harga  : Rp" + pesanan.getTotalHarga());
        System.out.println("Diantar oleh : " + pesanan.getDriver().getNama());

     
    }
}