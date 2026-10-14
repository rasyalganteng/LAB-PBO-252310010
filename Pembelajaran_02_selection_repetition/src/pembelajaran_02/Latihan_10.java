package pembelajaran_02;

import java.util.Locale;
import java.util.Scanner;

public class Latihan_10 {
    static String rupiah(long nilai) {
        return String.format(Locale.forLanguageTag("id-ID"), "%,d", nilai);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long pinBenar = 66666;   
        long saldo = 1000000;     

        long pin;
        do {
            System.out.print("Masukkan PIN : ");
            pin = input.nextLong();
            if (pin != pinBenar) {
                System.out.println("PIN salah, silakan coba lagi.");
            }
        } while (pin != pinBenar);

        System.out.println("PIN benar. Selamat datang!");

        char lanjut;
        do {
            System.out.println("\n MENU ATM ");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo anda : Rp " + rupiah(saldo) + ",-");
                    break;
                case 2:
                    System.out.print("Masukkan nominal setor tunai : ");
                    long setor = input.nextLong();
                    if (setor > 0) {
                        saldo += setor;
                        System.out.println("Setor tunai berhasil.");
                        System.out.println("Saldo anda : Rp " + rupiah(saldo) + ",-");
                    } else {
                        System.out.println("Nominal harus lebih dari 0.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nominal tarik tunai : ");
                    long tarik = input.nextLong();
                    if (tarik > 0 && tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Tarik tunai berhasil.");
                        System.out.println("Saldo anda : Rp " + rupiah(saldo) + ",-");
                    } else if (tarik > saldo) {
                        System.out.println("Saldo tidak cukup.");
                    } else {
                        System.out.println("Nominal harus lebih dari 0.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
            
            do {
                System.out.print("Kembali ke menu ? (y/n) : ");
                lanjut = Character.toLowerCase(input.next().charAt(0));
            } while (lanjut != 'y' && lanjut != 'n');

        } while (lanjut == 'y');

        input.close();
    }
}
