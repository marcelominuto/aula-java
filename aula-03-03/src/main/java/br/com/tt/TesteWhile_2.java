package br.com.tt;

import javax.swing.JOptionPane;

public class TesteWhile_2 {

	public static void main(String[] args) {

		String nome = "";
		while (!nome.equalsIgnoreCase("sair")) {
			nome = JOptionPane.showInputDialog("Nome");
			if (!nome.equalsIgnoreCase("sair")) {
				System.out.println(nome);
			}
		}
		System.out.println("Fim do Sistema!");
	}

}
