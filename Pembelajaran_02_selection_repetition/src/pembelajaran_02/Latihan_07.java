package pembelajaran_02;

import java.util.Scanner;

public class Latihan_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Resto resto = new Resto(input);
        char ulang;

        do {
            resto.chooseMenu();

            do {
                System.out.print("Apakah anda akan memesan kembali ? (y/n) : ");
                ulang = Character.toLowerCase(input.next().charAt(0));
            } while (ulang != 'y' && ulang != 'n');

        } while (ulang == 'y');

        System.out.println("Terimakasih telah memesan.");
        input.close();
    }
}