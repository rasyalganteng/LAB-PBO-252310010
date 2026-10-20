package CodinganSoalLatihan;

public class Latihan_07 {
	public class PesananFood {
	    
	    private String idPesanan;
	    private String namaMenu;
	    private double totalHarga;

	    public PesananFood(String idPesanan, String namaMenu) {
	        this.idPesanan = idPesanan;
	        this.namaMenu = namaMenu;
	    }

	
	    public void hitungTotal(double hargaSatuan, int jumlah) {
	        if (hargaSatuan > 0 && jumlah > 0) {
	            totalHarga = hargaSatuan * jumlah;
	        }
	    }
	    public double getTotalHarga() {
	        return totalHarga;
	    }
	}

	public class Soal7c {
	    public static void main(String[] args) {
	        PesananFood p = new PesananFood("PSN-01", "Nasi Goreng");
	        p.hitungTotal(25000, 2);
	        System.out.println(p.getTotalHarga()); 

	        
	    }
	}
}
