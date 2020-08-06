package lista01;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double idade = 1;
		double media = 0;
		double contador = 0;
		
		while(idade != 0) {
			
			System.out.println("Informe sua idade: ");
			idade = scan.nextInt();
			
			media += idade;
			contador += 1;
			
			if(idade == 0) {
				contador--;
			}
			
			
		}
		
		media = media / contador;
		System.out.printf("A media de idades eh: %.2f",media);
		//System.out.printf("%.2f", media);
		

	}

}
