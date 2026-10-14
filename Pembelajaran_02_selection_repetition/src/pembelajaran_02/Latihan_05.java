package pembelajaran_02;

import java.util.Scanner;

public class Latihan_05 {

    static void cetakDenganFor(int n) {
        int lebar = 2 * n + 1;
        for (int baris = 1; baris <= 2 * n; baris++) {
            int i = Math.min(baris, 2 * n - baris + 1);
            int bintang = n - i + 1;
            for (int kolom = 1; kolom <= lebar; kolom++) {
                if (kolom <= bintang || kolom > lebar - bintang) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void cetakDenganWhile(int n) {
        int lebar = 2 * n + 1;
        int baris = 1;
        while (baris <= 2 * n) {
            int i = Math.min(baris, 2 * n - baris + 1);
            int bintang = n - i + 1;
            int kolom = 1;
            while (kolom <= lebar) {
                if (kolom <= bintang || kolom > lebar - bintang) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                kolom++;
            }
            System.out.println();
            baris++;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM anda : ");
        long npm = input.nextLong();

        System.out.print("Enter the number of row:");
        int n = input.nextInt();

        if (npm % 2 != 0) {
            cetakDenganWhile(n);   
        } else {
            cetakDenganFor(n);   
        }

        input.close();
    }
}