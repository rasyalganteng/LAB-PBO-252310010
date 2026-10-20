package CodinganSoalLatihan;

public class Soal_03 {
 
	class Hewan {
	    String nama;
	    Hewan(String nama) { this.nama = nama; }
	    void makan() { System.out.println(nama + " sedang makan"); }
	}

	class Kucing extends Hewan {
	    Kucing(String nama) { super(nama); }
	    void mengeong() { System.out.println(nama + ": Meong"); }
	}

	public class Soal3 {
	    public static void main(String[] args) {
	        Kucing k = new Kucing("Tom");
	        k.makan();    
	        k.mengeong(); 
	    }
	}
}
