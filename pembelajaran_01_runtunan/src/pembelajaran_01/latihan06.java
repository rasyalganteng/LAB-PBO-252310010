package pembelajaran_01;

import java.util.Scanner;

public class latihan06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama lengkap : ");
        String nama = in.nextLine();

        String hasil = nama.replaceAll("[aiueoAIUEO]", "X");
        System.out.println(nama + " => " + hasil);
        in.close();
    }
}