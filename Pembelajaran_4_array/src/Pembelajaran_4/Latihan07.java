package Pembelajaran_4;

import javax.swing.JOptionPane;

public class Latihan07 {

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
        String npm = null;
        while (npm == null || !npm.matches("\\d+")) {
            npm = JOptionPane.showInputDialog(null, "Masukan NPM:", "Input NPM",
                    JOptionPane.QUESTION_MESSAGE);
            if (npm == null) {
                return;
            }
            npm = npm.trim();
        }
        int digitTerakhir = npm.charAt(npm.length() - 1) - '0';
        boolean ganjil = (digitTerakhir % 2 != 0);

        int[][] matriksA = inputMatriks("A", 2, 2); // isi: 1 3 9 5
        int[][] matriksB = inputMatriks("B", 2, 2); // isi: 4 5 3 6
        int[][] matriksC = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (ganjil) {
                    matriksC[i][j] = matriksA[i][j] + matriksB[i][j];
                } else {
                    matriksC[i][j] = matriksA[i][j] - matriksB[i][j];
                }
            }
        }

        String operasi = ganjil ? "C = A + B (NPM GANJIL)" : "C = A - B (NPM GENAP)";
        String hasil = tampilMatriks("A", matriksA) + "\n" + tampilMatriks("B", matriksB)
                + "\n" + operasi + "\n" + tampilMatriks("C", matriksC);
        JOptionPane.showMessageDialog(null, hasil, "Output Matriks",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
