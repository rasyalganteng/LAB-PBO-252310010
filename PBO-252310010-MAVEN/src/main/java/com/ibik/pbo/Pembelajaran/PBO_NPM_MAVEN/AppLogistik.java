package com.ibik.pbo.Pembelajaran.PBO_NPM_MAVEN;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppLogistik {

    static final int HARGA_PER_100GR = 5000;
    static final int HARGA_PER_10KM = 8000;

    static class Pesanan {
        String resi, pengirim, barang;
        double beratGram, jarakKm;
        long totalHarga;
        String status = "Barang diterima, sedang diproses";

        Pesanan(String resi, String pengirim, String barang, double beratGram, double jarakKm) {
            this.resi = resi;
            this.pengirim = pengirim;
            this.barang = barang;
            this.beratGram = beratGram;
            this.jarakKm = jarakKm;
            long unitBerat = (long) Math.ceil(beratGram / 100.0);
            long unitJarak = (long) Math.ceil(jarakKm / 10.0);
            this.totalHarga = unitBerat * HARGA_PER_100GR + unitJarak * HARGA_PER_10KM;
        }
    }

    static ArrayList<Pesanan> daftarPesanan = new ArrayList<>();
    static int counter = 1;

    static boolean konfirmasiKeluar() {
        int r = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar ?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return r == JOptionPane.YES_OPTION;
    }

        static Double inputAngka(String pesan) {
        while (true) {
            String s = JOptionPane.showInputDialog(null, pesan, "Input Pesanan", JOptionPane.QUESTION_MESSAGE);
            if (s == null) {
                if (konfirmasiKeluar()) System.exit(0);
                return null;
            }
            try {
                double v = Double.parseDouble(s.trim().replace(",", "."));
                if (v <= 0) throw new NumberFormatException();
                return v;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukan angka", "Error Info", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    static String inputTeks(String pesan) {
        while (true) {
            String s = JOptionPane.showInputDialog(null, pesan, "Input Pesanan", JOptionPane.QUESTION_MESSAGE);
            if (s == null) {
                if (konfirmasiKeluar()) System.exit(0);
                return null;
            }
            if (!s.isBlank()) return s.trim();
            JOptionPane.showMessageDialog(null, "Field tidak boleh kosong", "Error Info", JOptionPane.ERROR_MESSAGE);
        }
    }

    static void inputPesanan() {
        String pengirim = inputTeks("Nama pengirim:");
        if (pengirim == null) return;
        String barang = inputTeks("Nama barang:");
        if (barang == null) return;
        Double berat = inputAngka("Berat barang (gram):");
        if (berat == null) return;
        Double jarak = inputAngka("Jarak tujuan (km):");
        if (jarak == null) return;

        String resi = String.format("XYZ-%04d", counter++);
        Pesanan p = new Pesanan(resi, pengirim, barang, berat, jarak);
        daftarPesanan.add(p);

        JOptionPane.showMessageDialog(null,
                "Pesanan berhasil dibuat!\n\n"
                + "No Resi : " + p.resi + "\n"
                + "Pengirim: " + p.pengirim + "\n"
                + "Barang  : " + p.barang + "\n"
                + "Berat   : " + p.beratGram + " gr\n"
                + "Jarak   : " + p.jarakKm + " km\n"
                + "Total   : Rp " + String.format("%,d", p.totalHarga),
                "Struk Pengiriman", JOptionPane.INFORMATION_MESSAGE);
    }

    static void tracking() {
        if (daftarPesanan.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Anda belum melakukan Input Pesanan", "Error Info",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        String resi = JOptionPane.showInputDialog(null, "Masukan nomor resi:", "Tracking Pesanan",
                JOptionPane.QUESTION_MESSAGE);
        if (resi == null) {
            if (konfirmasiKeluar()) System.exit(0);
            return;
        }
        for (Pesanan p : daftarPesanan) {
            if (p.resi.equalsIgnoreCase(resi.trim())) {
                JOptionPane.showMessageDialog(null,
                        "No Resi : " + p.resi + "\nBarang  : " + p.barang + "\nStatus  : " + p.status
                        + "\nTotal   : Rp " + String.format("%,d", p.totalHarga),
                        "Status Pengiriman", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
       
        JOptionPane.showMessageDialog(null, "Data tidak ditemukan", "Error Info", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        String[] menu = {"Input Pesanan", "Tracking Pesanan", "Keluar"};
        while (true) {
            int pilih = JOptionPane.showOptionDialog(null, "PT. XYZ - Jasa Logistik", "Menu Utama",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            switch (pilih) {
                case 0 -> inputPesanan();
                case 1 -> tracking();
                default -> {
                    if (konfirmasiKeluar()) System.exit(0);
                }
            }
        }
    }
}
