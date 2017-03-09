package br.com.tt;

import javax.swing.JOptionPane;

public class TesteWhile_4_Do_While {

	public static void main(String[] args) {
		
		String nome = "Iniciando o sistema";
		do{
			System.out.println(nome);
			nome = JOptionPane.showInputDialog("Nome:");
			if(!nome.equalsIgnoreCase("Sair")){
			nome = "Nome: " + nome;
			}
		}while(!nome.equalsIgnoreCase("Sair"));
		
		System.out.println("Fim do Sistema");
	}

}
