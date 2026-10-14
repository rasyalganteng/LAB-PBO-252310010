package pembelajaran_01;

import java.util.Locale;
import java.util.Scanner;

public class latihan08 {
    static student myBio = new student();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        System.out.print("NPM      : ");
        Integer npm = myBio.getNPM(in.nextInt());
        in.nextLine();
        System.out.print("Fullname : ");
        String nama = myBio.getFullname(in.nextLine());
        System.out.print("Kelas    : ");
        String kelas = myBio.getClassName(in.nextLine());
        System.out.print("Semester : ");
        Integer smt = myBio.getSemester(in.nextInt());
        System.out.print("IPK      : ");
        Float ipk = myBio.getGPA(in.nextFloat());

        System.out.println("\n Data Mahasiswa ");
        System.out.println("NPM      : " + npm);
        System.out.println("Fullname : " + nama);
        System.out.println("Kelas    : " + kelas);
        System.out.println("Semester : " + smt);
        System.out.println("IPK      : " + ipk);
        in.close();
    }
}