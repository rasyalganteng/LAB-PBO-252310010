package com.ibik.pbo.Pembelajaran.PBO_25310010_MAVEN;


import java.util.ArrayList;
import javax.swing.*;
import java.awt.GridLayout;

public class AppBukuTelp {

    static ArrayList<String> daftarNama = new ArrayList<>();             // 1 dimensi
    static ArrayList<ArrayList<String>> bukuTelp = new ArrayList<>();    // multidimensi

    static void tambah(String nama, String alamat, String telp) {
        daftarNama.add(nama);
        ArrayList<String> row = new ArrayList<>();
        row.add(nama);
        row.add(alamat);
        row.add(telp);
        bukuTelp.add(row);
    }

    static void tampilkan() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-3s %-20s %-40s %-18s%n", "No", "Nama Lengkap", "Alamat", "No Telp"));
        sb.append("-".repeat(85)).append("\n");
        for (int i = 0; i < bukuTelp.size(); i++) {
            ArrayList<String> r = bukuTelp.get(i);
            sb.append(String.format("%-3d %-20s %-40s %-18s%n", i + 1, r.get(0), r.get(1), r.get(2)));
        }
        JTextArea area = new JTextArea(sb.toString());
        area.setFont(new java.awt.Font(java.awt.Font.MONOSPACED, java.awt.Font.PLAIN, 12));
        area.setEditable(false);
        JOptionPane.showMessageDialog(null, new JScrollPane(area), "Buku Telepon", JOptionPane.INFORMATION_MESSAGE);
    }

    static void formTambah() {
        JTextField fNama = new JTextField(20);
        JTextField fAlamat = new JTextField(20);
        JTextField fTelp = new JTextField(20);
        JPanel p = new JPanel(new GridLayout(0, 1, 4, 4));
        p.add(new JLabel("Nama Lengkap:")); p.add(fNama);
        p.add(new JLabel("Alamat:"));       p.add(fAlamat);
        p.add(new JLabel("No Telp:"));      p.add(fTelp);

        int r = JOptionPane.showConfirmDialog(null, p, "Tambah Kontak",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (r != JOptionPane.OK_OPTION) return;

        if (fNama.getText().isBlank() || fAlamat.getText().isBlank() || fTelp.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Semua field wajib diisi", "Error Info", JOptionPane.ERROR_MESSAGE);
            return;
        }
        tambah(fNama.getText().trim(), fAlamat.getText().trim(), fTelp.getText().trim());
        JOptionPane.showMessageDialog(null, "Kontak berhasil ditambahkan");
    }

    static void cari() {
        String key = JOptionPane.showInputDialog(null, "Cari nama:", "Cari Kontak", JOptionPane.QUESTION_MESSAGE);
        if (key == null || key.isBlank()) return;
        int idx = -1;
        for (int i = 0; i < daftarNama.size(); i++) {
            if (daftarNama.get(i).toLowerCase().contains(key.trim().toLowerCase())) { idx = i; break; }
        }
        if (idx < 0) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan", "Error Info", JOptionPane.ERROR_MESSAGE);
        } else {
            ArrayList<String> r = bukuTelp.get(idx);
            JOptionPane.showMessageDialog(null,
                    "Nama   : " + r.get(0) + "\nAlamat : " + r.get(1) + "\nNo Telp: " + r.get(2),
                    "Hasil Pencarian", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        tambah("Septian Cahyadi", "Dramaga cantik residance II, Bogor", "+62 899-9506-210");
        tambah("Isnan Mulia", "Jl.Manunggal, Bogor", "+62 819-3208-0875");
        tambah("Edi Nurachmand", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384");

        String[] menu = {"Lihat Semua", "Tambah Kontak", "Cari Kontak", "Keluar"};
        while (true) {
            int pilih = JOptionPane.showOptionDialog(null, "Aplikasi Buku Telepon", "Buku Telepon",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            switch (pilih) {
                case 0 -> tampilkan();
                case 1 -> formTambah();
                case 2 -> cari();
                default -> { return; }
            }
        }
    }
}