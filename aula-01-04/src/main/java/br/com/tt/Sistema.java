package br.com.tt;

import javax.swing.JOptionPane;

public class Sistema {

	public static void main(String[] args) {

		System.out.println("\n\n\tIniciando o Sistema");
		String nome = null;
		nome = JOptionPane.showInputDialog("Digite seu nome:");
		JOptionPane.showMessageDialog(null, nome);
		System.out.println(nome.toUpperCase());

		String strIdade = JOptionPane.showInputDialog("Digite sua idade:");
		Integer idade = Integer.valueOf(strIdade);
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		JOptionPane.showMessageDialog(null, idade);
	}
}
