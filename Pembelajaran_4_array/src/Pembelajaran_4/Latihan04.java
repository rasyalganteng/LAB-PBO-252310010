package Pembelajaran_4;

import javax.swing.JOptionPane;

public class Latihan04 {

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

        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = inputAngka("Masukan angka:", "Data array ke-" + i);
        }

        int terbesar = nilai[0];
        int terkecil = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > terbesar) {
                terbesar = nilai[i];
            }
            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }

        String hasil = "";
        for (int i = 0; i < nilai.length; i++) {
            hasil += "x[" + i + "]=" + nilai[i] + "\n";
        }
        hasil += "Nilai terbesar adalah " + terbesar + "\n";
        hasil += "Nilai terkecil adalah " + terkecil;

        JOptionPane.showMessageDialog(null, hasil, "Output Array",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
