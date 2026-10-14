package pembelajaran_02;

import java.util.Scanner;

public class Latihan_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM anda : ");
        long npm = input.nextLong();
        boolean genap = npm % 2 == 0;

        int angka;
        do {
            System.out.print("Masukkan nilai faktor (minimal 20) : ");
            angka = input.nextInt();
            if (angka < 20) {
                System.out.println("Nilai tidak boleh kurang dari 20!");
            }
        } while (angka < 20);

        StringBuilder hasil = new StringBuilder();

        if (genap) {
            for (int i = 1; i <= angka; i++) {
                if (angka % i == 0) {
                    if (hasil.length() > 0) hasil.append(", ");
                    hasil.append(i);
                }
            }
        } else {
            for (int i = angka; i >= 1; i--) {
                if (angka % i == 0) {
                    if (hasil.length() > 0) hasil.append(", ");
                    hasil.append(i);
                }
            }
        }

        System.out.println("Faktor " + angka + " adalah " + hasil);

        input.close();
    }
}
