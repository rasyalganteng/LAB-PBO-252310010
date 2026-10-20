package pembelajaran_3;

import javax.swing.JOptionPane;

public class Latihan_04 {

  
    static boolean tanyaKeluar() {
        int pilih = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar ?",
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        return pilih == JOptionPane.YES_OPTION;
    }

    
    static String input(String label) {
        while (true) {
            String s = JOptionPane.showInputDialog(null, "Masukan " + label + " anda:",
                    "Input", JOptionPane.QUESTION_MESSAGE);
            if (s == null) {
                if (tanyaKeluar()) {
                    System.exit(0);
                }
                continue;
            }
            return s.trim();
        }
    }

    public static void main(String[] args) {
        while (true) {
            String fullname;
            String usiaStr;
            String alamat;

           
            while (true) {
                fullname = input("fullname");
                if (fullname.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Field fullname tidak boleh kosong",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                break;
            }

            
            while (true) {
                usiaStr = input("usia");
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
                alamat = input("alamat");
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

            
            if (tanyaKeluar()) {
                break;          
            }
            
        }
    }
}