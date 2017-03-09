package br.com.tt;

import javax.swing.JOptionPane;

public class TesteIf_3 {

	public static void main(String[] args) {

		String resp = JOptionPane.showInputDialog("Digite sua idade");
		Integer idade = Integer.parseInt(resp);
		if (idade < 0) {
			System.err.println("Idade inválida.");
		} else if (idade >= 18) {
			System.out.println("Pode votar. Voto obrigatório.");
		} else if (idade >= 16) {
			System.out.println("Pode votar. Voto facultativo.");
		} else if (idade >= 70) {
			System.out.println("Pode votar. Voto facultativo.");
		} else {
			System.out.println("Não pode votar.");
		}
	}

}
