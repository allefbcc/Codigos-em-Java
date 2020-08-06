package lista01;

import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		double altura = 0;
		double media = 0;
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Informe a altura da "+i+"° pessoa: ");
			altura = scan.nextDouble();
			
			media += altura;
			
		}
		
		media = media / 5;
		System.out.println("A media eh: "+media);
		
	
	}

}
