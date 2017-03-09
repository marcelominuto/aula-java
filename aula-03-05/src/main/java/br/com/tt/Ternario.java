package br.com.tt;

import javax.swing.JOptionPane;

public class Ternario {

	public static void main(String[] args) {

		digiteUmNumero();
	}
	
	private static void digiteUmNumero(){
		try {
			Integer val = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
			String resultado = val > 0 ? "Positivo" : "Negativo";
			System.out.println(resultado);
		} catch (NumberFormatException e) {
			System.err.println("Digite apenas números!");
			digiteUmNumero();
		}
	}

}