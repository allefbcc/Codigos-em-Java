package adivinhanumero20;

import java.util.Random;

import javax.swing.JOptionPane;

public class AdivinhaNumero20 {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int chute = 0;
		int ran;
		int chance = 3;
		String chuteStr;
		
		ran = gerador.nextInt(10)+1;
		
		while(chance != 0) {
			
			
			chuteStr = JOptionPane.showInputDialog("chute um numero: ");
			chute = Integer.parseInt(chuteStr);
			
			
			if(chute < ran) {
				
			
				
				chance--;
				JOptionPane.showMessageDialog(null, "Dica: O Número eh MAIOR", "Vc tem mais "+chance+" chance(s)", JOptionPane.INFORMATION_MESSAGE);
				
				
			}else if(chute > ran) {
				
			
				chance--;
				JOptionPane.showMessageDialog(null, "Dica: O Número eh MENOR", "Vc tem mais "+chance+" chance(s)", JOptionPane.INFORMATION_MESSAGE);
				
				
				
			}else if(chute == ran){
				
				chance = 3;
				JOptionPane.showMessageDialog(null, "VC ACERTOU");
				JOptionPane.showMessageDialog(null, "Número aleatorio: "+ran);
				ran = gerador.nextInt(10)+1;
				
						
			}
	
			}
		
		JOptionPane.showMessageDialog(null, "VC SE FUDEU",null, JOptionPane.ERROR_MESSAGE, null);
		JOptionPane.showMessageDialog(null, "Número aleatorio: "+ran);
		
		
			
			
	}
}
