package pembelajaran_3;

import javax.swing.JOptionPane;

public class Latihan_03 {

   
    static String ambil(String label) {
        String s = JOptionPane.showInputDialog(null, "Masukan " + label + " anda:");
        return (s == null) ? "" : s.trim();
    }

    public static void main(String[] args) {
        String fullname;
        String usiaStr;
        String alamat;

       
        while (true) {
            fullname = ambil("fullname");
            if (fullname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            break;
        }

        while (true) {
            usiaStr = ambil("usia");
            if (usiaStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field usia tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (!usiaStr.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Isian usia harus angka",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            break;
        }

        while (true) {
            alamat = ambil("alamat");
            if (alamat.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Field alamat tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            if (alamat.length() < 10) {
                JOptionPane.showMessageDialog(null, "Masukan alamat minimum 10 karakter",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            break;
        }

        Biodata bio = new Biodata();
        bio.simpanData(fullname, Integer.parseInt(usiaStr), alamat);

        JOptionPane.showMessageDialog(null,
                "Fullname : " + bio.getFullname() + "\n" +
                "Usia     : " + bio.getUsia() + "\n" +
                "Alamat   : " + bio.getAlamat(),
                "Info", JOptionPane.INFORMATION_MESSAGE);
    }
}