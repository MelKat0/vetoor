package lpa4;

import java.util.Scanner;

public class VibravaVET3 {

	public static void main(String[] args) {
		
		int i[] = new int[5], soma =0;
		
		Scanner ler = new Scanner(System.in);
		
		for (int o =0; o<5; o++) {
			System.out.print("Informe um valor inteiro para " + o + ": ");
			i [o] = ler.nextInt();
		
			soma = (soma + i[o]);
			System.out.println(soma);
			
		}
		
		if (soma>15) {
			System.out.println("O resultado da soma é: " + soma);
		}
		else {
			
		}
	}

}
