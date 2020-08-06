package lista01;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double n1;
		double n2;
		char op;
		
		System.out.println("Digite o 1° numero: ");
		n1 = scan.nextInt();
		
		System.out.println("Digite o 2° numero: ");
		n2 = scan.nextInt();
		
		System.out.println("Digite a operação (+, -, *, /): ");
		op = scan.next().charAt(0);
		
		if(op == '+'){
			
			double soma = n1 + n2;
			System.out.println("A soma eh: "+soma);
			
		}else if(op == '-') {
			
			double sub = n1 - n2;
			System.out.println("A subtração eh: "+sub);
			
		}else if(op == '*') {
			
			double mult = n1 * n2;
			
			System.out.println("A multiplicação eh: "+mult);
			
		}else if(op == '/') {
			
			double div = n1 / n2;
			
			System.out.println("A divisão eh: "+div);
			
		}
		
		
		
		
		
		

	}

}
