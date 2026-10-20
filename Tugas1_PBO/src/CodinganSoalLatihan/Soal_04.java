package CodinganSoalLatihan;

public class Soal_04 {
	class Hewan {
	    void bersuara() { System.out.println("..."); }
	}
	class Kucing extends Hewan {
	    @Override void bersuara() { System.out.println("Meong"); }
	}
	class Anjing extends Hewan {
	    @Override void bersuara() { System.out.println("Guk guk"); }
	}

	public class Soal4 {
	    public static void main(String[] args) {
	        Hewan[] daftar = { new Kucing(), new Anjing(), new Hewan() };
	        for (Hewan h : daftar) {
	            h.bersuara(); 	        }
	    }
	}
}
