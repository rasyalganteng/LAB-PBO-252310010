package praktikum4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListApp {
	public static void main(String[] args) {
		ArrayList<String> nama = new ArrayList<String>();
		nama.add("Rafli");
		System.out.println(nama.get(0));
		
		JOptionPane jop = new JOptionPane();
		nama.add(jop.showInputDialog(null, "input nama :"));
		jop.showInternalMessageDialog(null, "nama : " + nama.getLast());
		
		nama.remove(0);
		System.out.println("Nama setelah dihapus : " + nama.get(0));
		
//		System.out.println(nama.get(1));
		
		nama.add("ade");
		nama.add("rasyal");
		System.out.println("List nama : ");
		for (int i = 0; i < nama.size(); i++){
			System.out.println(nama.get(i));
		}
		
		nama.clear();
		System.out.println(nama.size());
		
		
	}
	

}
