package lpa4;

import java.util.Scanner;

public class VirizionVET3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[] = new int [5], b[] = new int [5], c[] = new int [10];
		
		System.out.println("Vetor A");
		for (int i =0; i<5; i++) {
			System.out.print("Informe um valor A para " + i + ": ");
			a[i] = ler.nextInt();
		}

		System.out.println("Vetor B");
		for (int i =0; i<5; i++) {
			System.out.print("Informe um valor B para " + i + ": ");
			b[i] = ler.nextInt();
		}
		System.out.println("-------------------------------------");
		System.out.println("Conjunto C: ");
		for (int i=0; i<5; i++) {
			c[i]=a[i];
			System.out.println(c[i]);
		}
		
		for (int i=0; i<5; i++) {
			c[i]=b[i];
			System.out.println(c[i]);
		}
		ler.close();
	}

}
