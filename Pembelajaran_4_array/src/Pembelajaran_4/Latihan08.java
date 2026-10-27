package Pembelajaran_4;

import javax.swing.JOptionPane;

public class Latihan08 {

    public static void main(String[] args) {
        String field[] = {"Nama Lengkap", "Alamat", "No Telp"};

        String[][] dataOrang = {
            {"Septian Cahyadi", "Dramaga cantik residance II, Bogor", "+62 899-9506-210"},
            {"Isnan Mulia", "Jl.Manunggal, Bogor", "+62 819-3208-0875"},
            {"Edi Nurachmand", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384"}
        };

        String hasil = "";
        for (int i = 0; i < dataOrang.length; i++) {
            hasil += "Data ke-" + (i + 1) + "\n";
            for (int j = 0; j < field.length; j++) {
                hasil += field[j] + ": " + dataOrang[i][j] + "\n";
            }
            hasil += "\n";
        }
        JOptionPane.showMessageDialog(null, hasil, "Data Array Multidimensi",
                JOptionPane.INFORMATION_MESSAGE);
    }
}