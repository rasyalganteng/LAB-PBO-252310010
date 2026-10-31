package pembelajaran_4;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();

       
        for (int i = 0; i < 2; i++) {
            A.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                int angka = Integer.parseInt(
                    JOptionPane.showInputDialog("Matrix A[" + i + "][" + j + "]"));
                A.get(i).add(angka);
            }
        }


        for (int i = 0; i < 2; i++) {
            B.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                int angka = Integer.parseInt(
                    JOptionPane.showInputDialog("Matrix B[" + i + "][" + j + "]"));
                B.get(i).add(angka);
            }
        }

             String hasil = "Matrix C = A * B\n";
        for (int i = 0; i < 2; i++) {
            C.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                int total = 0;
                for (int k = 0; k < 2; k++) {
                    total += A.get(i).get(k) * B.get(k).get(j);
                }
                C.get(i).add(total);
                hasil += total + "\t";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}