package br.com.tt.controller;

import br.com.tt.model.Funcionario;

public class Sistema {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.setNome("Pedro Silva");
		f1.setSalario(15000D);
		System.out.println(f1);
	}
}
