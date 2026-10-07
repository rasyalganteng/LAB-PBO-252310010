package pembelajaran_01;

import java.util.Scanner;

public class latihan05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Usia      : ");
        String usia = in.nextLine();
        System.out.print("Firstname : ");
        String firstname = in.nextLine();
        System.out.print("Lastname  : ");
        String lastname = in.nextLine();
        System.out.print("NPM       : ");
        String npm = in.nextLine();

        String hasil = usia.concat(firstname).concat(lastname).concat(npm);
        System.out.println("Output    : " + hasil);
        in.close();
    }
}