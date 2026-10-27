package Pembelajaran_4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan10 {

    public static void main(String[] args) {
        String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
        ArrayList<String> daftarIsian = new ArrayList<String>();

        for (int i = 0; i < field.length; i++) {
            String teks = JOptionPane.showInputDialog(null, "Masukan " + field[i] + ":",
                    "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
            if (teks == null) {
                return; 
            }
            daftarIsian.add(teks);
        }

        String hasil = "";
        for (int i = 0; i < field.length; i++) {
            hasil += field[i] + ": " + daftarIsian.get(i);
            if (i < field.length - 1) {
                hasil += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, hasil, "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }
}