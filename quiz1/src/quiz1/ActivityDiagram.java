package quiz1;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ActivityDiagram {
    public static void main(String[] args) {
        ArrayList<String> daftarBuku = new ArrayList<>();
        String[] menu = {"Input Buku", "Hapus Buku", "Lihat Semua Buku", "Keluar"};
        boolean jalan = true;

        while (jalan) {
            int pilihan = JOptionPane.showOptionDialog(
                    null,
                    "Pilih menu:",
                    "Data Buku",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    menu,
                    menu[0]);

            if (pilihan == 0) {
                String judul = JOptionPane.showInputDialog(null,
                        "Masukkan judul buku yang ingin di-input:",
                        "Input Buku", JOptionPane.QUESTION_MESSAGE);
                if (judul != null && !judul.trim().isEmpty()) {
                    daftarBuku.add(judul.trim());
                    JOptionPane.showMessageDialog(null,
                            "Buku \"" + judul.trim() + "\" berhasil disimpan.");
                } else if (judul != null) {
                    JOptionPane.showMessageDialog(null,
                            "Judul tidak boleh kosong!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else if (pilihan == 1) {
                if (daftarBuku.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Belum ada data buku.", "Info",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String inputIndex = JOptionPane.showInputDialog(null,
                            tampilkanBuku(daftarBuku)
                                    + "\nMasukkan index buku yang ingin dihapus:",
                            "Hapus Buku", JOptionPane.QUESTION_MESSAGE);
                    if (inputIndex != null) {
                        try {
                            int index = Integer.parseInt(inputIndex.trim());
                            if (index >= 0 && index < daftarBuku.size()) {
                                String dihapus = daftarBuku.remove(index);
                                JOptionPane.showMessageDialog(null,
                                        "Buku \"" + dihapus + "\" berhasil dihapus.");
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Index tidak ditemukan!", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null,
                                    "Index harus berupa angka!", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } else if (pilihan == 2) {
                if (daftarBuku.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Belum ada data buku.", "Data Buku",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            tampilkanBuku(daftarBuku), "Data Buku",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Terima kasih!");
                jalan = false;
            }
        }
    }

    private static String tampilkanBuku(ArrayList<String> daftar) {
        StringBuilder sb = new StringBuilder("Daftar Buku:\n");
        for (int i = 0; i < daftar.size(); i++) {
            sb.append(i).append(". ").append(daftar.get(i)).append("\n");
        }
        return sb.toString();
    }
}