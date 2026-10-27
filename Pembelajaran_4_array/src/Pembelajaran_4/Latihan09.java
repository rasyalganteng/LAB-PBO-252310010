package Pembelajaran_4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan09 {

    static int inputAngka(String pesan, String judul) {
        while (true) {
            String teks = JOptionPane.showInputDialog(null, pesan, judul,
                    JOptionPane.QUESTION_MESSAGE);
            if (teks == null) {
                System.exit(0);
            }
            try {
                return Integer.parseInt(teks.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input harus berupa angka bulat!",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        int jumlah;
        do {
            jumlah = inputAngka("Masukan jumlah array:", "Input");
            if (jumlah <= 0) {
                JOptionPane.showMessageDialog(null, "Jumlah array harus lebih dari 0!",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (jumlah <= 0);

        ArrayList<Integer> daftarNilai = new ArrayList<Integer>();

        for (int i = 0; i < jumlah; i++) {
            daftarNilai.add(inputAngka("Masukan angka:", "Data array ke-" + i));
        }

        int terbesar = daftarNilai.get(0);
        int terkecil = daftarNilai.get(0);
        for (int i = 1; i < daftarNilai.size(); i++) {
            if (daftarNilai.get(i) > terbesar) {
                terbesar = daftarNilai.get(i);
            }
            if (daftarNilai.get(i) < terkecil) {
                terkecil = daftarNilai.get(i);
            }
        }

        String hasil = "";
        for (int i = 0; i < daftarNilai.size(); i++) {
            hasil += "x[" + i + "]=" + daftarNilai.get(i) + "\n";
        }
        hasil += "Nilai terbesar adalah " + terbesar + "\n";
        hasil += "Nilai terkecil adalah " + terkecil;

        JOptionPane.showMessageDialog(null, hasil, "Output Array",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
