package lpa4;

import java.util.Scanner;

public class VenossauroVET2 {

	public static void main(String[] args) {
		
		String n[] = new String[5];
		
		Scanner ler = new Scanner(System.in);
		
		for (int i =0; i<5; i++) {
			System.out.print("Informe um nome para a " + i + " posição: ");
			n [i] = ler.next();
		}
		
		for (int i =0; i<5; i++) {
			System.out.println(n[i]);
		}
		ler.close();

	}

}
