package pembelajaran_4;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Latihan04 {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> data = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            ArrayList<String> baris = new ArrayList<>();
            baris.add(JOptionPane.showInputDialog("Data ke-" + i + "\nMasukkan Nama Lengkap"));
            baris.add(JOptionPane.showInputDialog("Data ke-" + i + "\nMasukkan Alamat"));
            baris.add(JOptionPane.showInputDialog("Data ke-" + i + "\nMasukkan No Telp"));
            data.add(baris);
        }

     
        Collections.sort(data, (a, b) -> a.get(0).compareToIgnoreCase(b.get(0)));

        StringBuilder sb = new StringBuilder();
        sb.append("Data (Ascending berdasarkan Nama Lengkap)\n\n");
        sb.append("Nama Lengkap\t|\tAlamat\t|\tNo Telp\n");
        sb.append("------------------------------------------------------------\n");
        for (ArrayList<String> baris : data) {
            sb.append(baris.get(0)).append("\t|\t")
              .append(baris.get(1)).append("\t|\t")
              .append(baris.get(2)).append("\n");
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}