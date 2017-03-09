package br.com.tt.controller;

import br.com.tt.model.Animal;
import br.com.tt.model.Pessoa;

public class Sistema {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		
		a1.setNome("Rex");

		Pessoa d1 = new Pessoa();
		d1.setNome("Juca");
		a1.setDono(d1);
		
		System.out.println(a1.getNome());
		System.out.println(a1.getDono().getNome());
		
		Animal toto = new Animal();
		
		toto.setNome("Totó");
		toto.setDono(new Pessoa());
		toto.getDono().setNome("Maria");
		
		System.out.println(toto.getNome() + " da " + toto.getDono().getNome());
	}
}
