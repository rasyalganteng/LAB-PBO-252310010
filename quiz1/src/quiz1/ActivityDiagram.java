package quiz1;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ActivityDiagram {
    public static void main(String[] args) {
        ArrayList<String> buku = new ArrayList<>();
        String[] menu = {"Input", "Hapus", "Lihat", "Keluar"};

        while (true) {
            int pilih = JOptionPane.showOptionDialog(null, "Pilih menu:", "Data Buku",
                    0, 3, null, menu, menu[0]);

            if (pilih == 0) {
                String judul = JOptionPane.showInputDialog("Judul buku:");
                if (judul != null && !judul.isEmpty()) {
                    buku.add(judul);
                }
            } else if (pilih == 1) {
                int i = Integer.parseInt(JOptionPane.showInputDialog(daftar(buku) + "\nHapus nomor:"));
                buku.remove(i);
            } else if (pilih == 2) {
                JOptionPane.showMessageDialog(null, daftar(buku));
            } else {
                break;
            }
        }
    }

    static String daftar(ArrayList<String> buku) {
        String teks = "Daftar Buku:\n";
        for (int i = 0; i < buku.size(); i++) {
            teks += i + ". " + buku.get(i) + "\n";
        }
        return teks;
    }
}