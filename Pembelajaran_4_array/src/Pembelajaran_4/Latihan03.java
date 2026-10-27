package Pembelajaran_4;

import javax.swing.JOptionPane;

public class Latihan03 {

    static int inputInt(String pesan, String judul) {
        while (true) {
            String s = JOptionPane.showInputDialog(null, pesan, judul,
                    JOptionPane.QUESTION_MESSAGE);
            if (s == null) {
                System.exit(0);
            }
            try {
                return Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input harus berupa angka bulat!",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        int jumlah;
        do {
            jumlah = inputInt("Masukan jumlah array:", "Input");
            if (jumlah <= 0) {
                JOptionPane.showMessageDialog(null, "Jumlah array harus lebih dari 0!",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (jumlah <= 0);

        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = inputInt("Masukan angka:", "Data array ke-" + i);
        }

        String hasil = "";
        for (int i = 0; i < nilai.length; i++) {
            hasil += "x[" + i + "]=" + nilai[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, hasil, "Output Array",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
