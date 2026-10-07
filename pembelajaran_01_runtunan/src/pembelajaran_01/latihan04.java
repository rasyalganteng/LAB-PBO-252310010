package pembelajaran_01;

import java.util.Scanner;

public class latihan04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan teks : ");
        String teks = in.nextLine();
        System.out.println("Huruf besar   : " + teks.toUpperCase());
        in.close();
    }
}