package pembelajaran_01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class latihan09 {
    static student myBio = new student(); 

    static String rp(double angka) {
        return String.format("%,.0f", angka).replace(',', '.');
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int HARGA = 6300;

        System.out.println("TOKO SERBAGUNA IBIK");
        System.out.print("Masukan nama member               : ");
        String member = myBio.getFullname(in.nextLine());
        System.out.print("Masukan jumlah produk yang dibeli : ");
        int qty = in.nextInt();

        String waktu = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)", Locale.ENGLISH));

        int total = qty * HARGA;
        int diskonPersen = (qty % 3 == 0) ? 5 : 0;
        double subTotal = total - (total * diskonPersen / 100.0);

        System.out.println(waktu);
        System.out.printf("%-15s %5s %15s %15s%n", "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.printf("%-15s %5d %15s %15s%n", "ROTI ENAK", qty, "Rp " + rp(HARGA) + ",-", "Rp " + rp(total));
        System.out.println("Diskon    : " + diskonPersen + "%");
        System.out.println("Sub Total : Rp " + rp(subTotal) + ",-");
        System.out.println("Member Name : " + member);
        in.close();
    }
}
