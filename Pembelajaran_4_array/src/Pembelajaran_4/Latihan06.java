package Pembelajaran_4;

import javax.swing.JOptionPane;

public class Latihan06 {

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

    static int[][] inputMatriks(String nama, int baris, int kolom) {
        int[][] matriks = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = inputAngka("Masukan nilai " + nama + "[" + i + "][" + j + "]:",
                        "Matriks " + nama);
            }
        }
        return matriks;
    }

    static String tampilMatriks(String nama, int[][] matriks) {
        String teks = "Matriks " + nama + ":\n";
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                teks += matriks[i][j] + "\t";
            }
            teks += "\n";
        }
        return teks;
    }

    public static void main(String[] args) {
        int[][] matriksA = inputMatriks("A", 2, 2); 
        int[][] matriksB = inputMatriks("B", 2, 2); 

        String hasil = tampilMatriks("A", matriksA) + "\n" + tampilMatriks("B", matriksB);
        JOptionPane.showMessageDialog(null, hasil, "Output Matriks",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
