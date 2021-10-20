package engenharia;

import java.lang.Math;
import java.text.DecimalFormat;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Engenharia {

	public static void main(String[] args) {
		
		double espInterplanar;
		double a;
		
		  try {
			  JTextField angulo = new JTextField(10); // double
		      JTextField plano = new JTextField(10); // String

		      JPanel myPanel = new JPanel();
		      myPanel.add(new JLabel("Informe o angulo: "));
		      myPanel.add(angulo);
		      
		      myPanel.add(Box.createHorizontalStrut(10)); // a spacer
		      myPanel.add(new JLabel("Informe o Plano:"));
		      myPanel.add(plano);
		      
		      int op = JOptionPane.showInternalConfirmDialog(null, myPanel, "IHM", 2, 1);
		      
		    
		     double anguloD = Double.parseDouble(angulo.getText());
		     String planoS = plano.getText();
		    
		     espInterplanar = 0.1542 / (2 * (Math.sin((anguloD / 2) * 0.001745)));
		     
		     String elemento_0 = String.valueOf(planoS).split("\\.")[0];
		     
		     String elemento_1 = String.valueOf(planoS).split("\\.")[1];
		     
		     String elemento_2 = String.valueOf(planoS).split("\\.")[2];
		     
		     int e_0 = Integer.parseInt(elemento_0);
		     int e_1 = Integer.parseInt(elemento_1);
		     int e_2 = Integer.parseInt(elemento_2);
		     
		    
		     a = espInterplanar * Math.sqrt(Math.pow(e_0, 2) + Math.pow(e_1, 2) + Math.pow(e_2, 2)); 
		      
		     
		     if(op == JOptionPane.OK_OPTION) {
		    	 
		    	 DecimalFormat decimal = new DecimalFormat("0.000000000");
		    	 
		    	 String valorFormatado_Interplanar = decimal.format(espInterplanar);
		    	 String valorFormatado_a = decimal.format(a);
		    	 
		    	 
		    	 JOptionPane.showMessageDialog(null,"Espaco Interplanar: "+ valorFormatado_Interplanar+"  d(nm)"+"\nPlano: "+planoS+ "\nValor de a: "+valorFormatado_a+"  a(nm)", "Resultado", 1);

		     }
		     
		     }catch(NumberFormatException e) { 
		    	 
		    	 JOptionPane.showMessageDialog(null, "Voce pressionou cancelar ou informou dados inválidos", null, 0, null);
		    	 
		     }catch(ArrayIndexOutOfBoundsException e) {
		    	 JOptionPane.showMessageDialog(null, "Voce pressionou cancelar ou informou dados inválidos", null, 0, null);
		     }
		  
		    	 
		     }
		     
		  
	}

