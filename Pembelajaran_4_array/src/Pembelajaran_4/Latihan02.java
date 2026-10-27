package Pembelajaran_4;

public class Latihan02 {

    public static void main(String[] args) {
        int[] ages = new int[5];

        int[] sumber = {10, 12, 5, 20, 1};
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sumber[i];
        }

        // OUTPUT
        System.out.println("=Value by index=");
        System.out.println("ages[2]=" + ages[2]);
        System.out.println("=Use Loop=");
        for (int i = 0; i < ages.length; i++) {
            System.out.println("ages[" + i + "]=" + ages[i]);
        }
    }
}
