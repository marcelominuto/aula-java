package br.com.tt;

import javax.swing.JOptionPane;

public class TesteIf_4 {

	public static void main(String[] args) {

		String resp = JOptionPane.showInputDialog("Digite sua idade");
		Integer idade = Integer.parseInt(resp);
		if (idade < 0) {
			System.err.println("Idade inv�lida.");
		} else if ((idade >= 16 && idade < 18) || idade >= 70) {
			System.out.println("Pode votar. Voto facultativo.");
		} else if (idade >= 18) {
			System.out.println("Pode votar. Voto obrigat�rio.");
		} else {
			System.out.println("N�o pode votar.");
		}
	}

}
