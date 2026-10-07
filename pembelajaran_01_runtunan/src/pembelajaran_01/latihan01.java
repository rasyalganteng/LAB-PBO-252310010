package pembelajaran_01;

import java.util.Locale;
import java.util.Scanner;

public class latihan01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US); 

     
        System.out.print("Masukkan suhu Celcius : ");
        double celcius = in.nextDouble();

        double fahrenheit = (celcius * 9 / 5) + 32;
        double reamur = celcius * 4 / 5;
        double kelvin = celcius + 273.15;

        System.out.println("Celcius    : " + celcius + " C");
        System.out.println("Fahrenheit : " + fahrenheit + " F");
        System.out.println("Reamur     : " + reamur + " R");
        System.out.println("Kelvin     : " + kelvin + " K");
        in.close();
    }
}