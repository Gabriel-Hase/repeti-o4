package triangulo;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main (String[]args) {
				
		int n1; int n2; int n3;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para vermos qual triângulo ele pode formar: "));
		
		while (n1==0) {
			n1=Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite um número que seja diferente de zero: "));
		}
		
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número: "));
		
		while (n2==0) {
			n2=Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite um número que seja diferente de zero: "));
		}
		
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o último número: "));
		
		while (n3==0) {
			n3=Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite um número que seja diferente de zero: "));
		}
		
		if (n1==n2 && n2==n3) {
			JOptionPane.showMessageDialog(null, "O triângulo é equilátero, onde todos os lados são iguais");
		}
		
		else if (n1==n2 || n1==n3 || n2==n3) {
			JOptionPane.showMessageDialog(null, "O triângulo é isóceles, onde dois lados são iguais");
		}
        
		else {
			JOptionPane.showMessageDialog(null, "O triângulo é escaleno, onde todos os lados são diferentes");
		}
		
		
	
	
	
	}
}


