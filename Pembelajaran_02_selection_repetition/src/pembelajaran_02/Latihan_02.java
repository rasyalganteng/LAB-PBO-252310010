package pembelajaran_02;

import java.util.Scanner;

public class Latihan_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM anda : ");
        long npm = input.nextLong();

        boolean prima = npm >= 2;
        long pembagi = 0;

        for (long i = 2; i * i <= npm; i++) {
            if (npm % i == 0) {
                prima = false;
                pembagi = i;  
                break;
            }
        }

        if (prima) {
            System.out.println("Termasuk bilangan PRIMA");
        } else if (pembagi == 0) {
            System.out.println("Bukan termasuk bilangan prima");
        } else {
            System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan " + pembagi);
        }

        input.close();
    }
}