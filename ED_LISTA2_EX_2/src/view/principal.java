package view;
import javax.swing.*;
import controller.metodos;
public class principal {

	public static void main(String[] args) {
		metodos m = new metodos();

		  int dividendo = Integer.parseInt(
		          JOptionPane.showInputDialog("Digite o dividendo:"));

		  int divisor = Integer.parseInt(
		          JOptionPane.showInputDialog("Digite o divisor:"));

		  int resultado = m.resto(dividendo, divisor);

		  JOptionPane.showMessageDialog(null,
		          "Resto da divisão: " + resultado);
		 }

	}

