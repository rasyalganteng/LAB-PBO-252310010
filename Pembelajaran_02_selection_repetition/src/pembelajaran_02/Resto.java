package pembelajaran_02;

import java.util.Scanner;

public class Resto {
    private long Harga;
    private Scanner input;

    public Resto(Scanner input) {
        this.input = input;
    }

    public void chooseMenu() {
        System.out.println("\nMenu Sarapan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Pilih menu : ");
        int pilihan = input.nextInt();

        Long harga = getPrices(pilihan);
        String rupiah = String.format(java.util.Locale.forLanguageTag("id-ID"), "%,d", harga);

        switch (pilihan) {
            case 1:
                System.out.println("Anda memesan Nasi Goreng dengan harga Rp " + rupiah + ",-");
                break;
            case 2:
                System.out.println("Anda memesan Bubur Ayam dengan harga Rp " + rupiah + ",-");
                break;
            case 3:
                System.out.println("Anda memesan Soto Ayam dengan harga Rp " + rupiah + ",-");
                break;
            default:
                System.out.println("Maaf menu yang anda masukan salah.");
        }
    }

    private Long getPrices(int menu) {
        switch (menu) {
            case 1:
                Harga = 22000;
                break;
            case 2:
                Harga = 15000;
                break;
            case 3:
                Harga = 25000;
                break;
            default:
                Harga = 0;
        }
        return Harga;
    }
}