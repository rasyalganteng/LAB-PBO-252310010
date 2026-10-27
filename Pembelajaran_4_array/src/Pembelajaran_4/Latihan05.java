package Pembelajaran_4;

import javax.swing.JOptionPane;

public class Latihan05 {

    public static void main(String[] args) {
        String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
        String[] isian = new String[field.length];

        for (int i = 0; i < field.length; i++) {
            String teks = JOptionPane.showInputDialog(null, "Masukan " + field[i] + ":",
                    "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
            if (teks == null) {
                return; 
            }
            isian[i] = teks;
        }

        String hasil = "";
        for (int i = 0; i < field.length; i++) {
            hasil += field[i] + ": " + isian[i];
            if (i < field.length - 1) {
                hasil += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, hasil, "Message",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
