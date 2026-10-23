package praktikum4;

import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		String[] nama = new String[4];
		nama[0] = "Rasyal";
		System.out.println(nama[0]);
		System.out.println(nama[1]);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input nama : ");
		nama[1] = scanner.nextLine();
		System.out.println("Nama yang di output :");
		
		System.out.println("Nama nama : ");
		for (int i = 0;  i < 4; i++) {
			System.out.println(nama[i]);
		}
	}

}
