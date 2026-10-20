package pembelajaran_3;


import javax.swing.JOptionPane;

public class Latihan_02 {
    public static void main(String[] args) {
        String fullname = JOptionPane.showInputDialog(null, "Masukan fullname anda:");
        int usia = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan usia anda:"));
        String alamat = JOptionPane.showInputDialog(null, "Masukan alamat anda:");

        Biodata bio = new Biodata();
        bio.simpanData(fullname, usia, alamat);

        JOptionPane.showMessageDialog(null,
                "Fullname : " + bio.getFullname() + "\n" +
                "Usia     : " + bio.getUsia() + "\n" +
                "Alamat   : " + bio.getAlamat());
    }
}