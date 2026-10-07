package pembelajaran_01;

import java.util.Locale;
import java.util.Scanner;

public class latihan02 {
   
    static final double PI = 3.14159;
    static Scanner in = new Scanner(System.in);

    
    static double garisPelukisKerucut(double r, double t) {
        return Math.sqrt(r * r + t * t);
    }

    static double luasKerucut(double r, double t) {
        double s = garisPelukisKerucut(r, t);
        return PI * r * (r + s);
    }

    static double volumeKerucut(double r, double t) {
        return PI * r * r * t / 3;
    }

    static double luasTabung(double r, double t) {
        return 2 * PI * r * (r + t);
    }

    static double volumeTabung(double r, double t) {
        return PI * r * r * t;
    }

    static double luasLayang(double d1, double d2) {
        return d1 * d2 / 2;
    }

    static double kelilingLayang(double a, double b) {
        return 2 * (a + b);
    }

    static double luasAlasSegitiga(double a, double ts) {
        return a * ts / 2;
    }

    static double kelilingAlasSegitiga(double a, double ts) {
        double sisiMiring = Math.sqrt((a / 2) * (a / 2) + ts * ts); 
        return a + 2 * sisiMiring;
    }

    static double luasPrisma(double a, double ts, double tp) {
        return 2 * luasAlasSegitiga(a, ts) + kelilingAlasSegitiga(a, ts) * tp;
    }

    static double volumePrisma(double a, double ts, double tp) {
        return luasAlasSegitiga(a, ts) * tp;
    }

   
    static void ganjil() {
        System.out.print("Jari-jari alas (r) : ");
        double r = in.nextDouble();
        System.out.print("Tinggi (t)         : ");
        double t = in.nextDouble();

        System.out.println("\n KERUCUT ");
        System.out.println("Luas permukaan : " + luasKerucut(r, t));
        System.out.println("Volume         : " + volumeKerucut(r, t));
        System.out.println("\n TABUNG ");
        System.out.println("Luas permukaan : " + luasTabung(r, t));
        System.out.println("Volume         : " + volumeTabung(r, t));
    }

    static void genap() {
        System.out.println(" Layang-layang ");
        System.out.print("Diagonal 1 : ");
        double d1 = in.nextDouble();
        System.out.print("Diagonal 2 : ");
        double d2 = in.nextDouble();
        System.out.print("Sisi pendek: ");
        double a = in.nextDouble();
        System.out.print("Sisi panjang: ");
        double b = in.nextDouble();
        System.out.println("Luas     : " + luasLayang(d1, d2));
        System.out.println("Keliling : " + kelilingLayang(a, b));

        System.out.println("\n-- Prisma Segitiga --");
        System.out.print("Alas segitiga      : ");
        double alas = in.nextDouble();
        System.out.print("Tinggi segitiga    : ");
        double ts = in.nextDouble();
        System.out.print("Tinggi prisma      : ");
        double tp = in.nextDouble();
        System.out.println("Luas permukaan : " + luasPrisma(alas, ts, tp));
        System.out.println("Volume         : " + volumePrisma(alas, ts, tp));
    }

    public static void main(String[] args) {
        in.useLocale(Locale.US);

 
        System.out.print("Masukkan NPM : ");
        long npm = in.nextLong();
        long digitTerakhir = npm % 10;

        if (digitTerakhir % 2 == 1) {
            System.out.println("NPM digit terakhir GANJIL -> Kerucut & Tabung\n");
            ganjil();
        } else {
            System.out.println("NPM digit terakhir GENAP -> Layang-layang & Prisma Segitiga\n");
            genap();
        }
        in.close();
    }
}