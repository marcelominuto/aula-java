package br.com.tt;

import java.util.HashSet;
import java.util.Set;

public class Set_1 {

	public static void main(String[] args) {
		Set<String> frutas = new HashSet<>();
		frutas.add("Ma��");
		frutas.add("Banana");
		frutas.add("Ma��");
		frutas.add("Banana");
		frutas.add("Ma��");
		frutas.add("Laranja");
		System.out.println("Qtd: " + frutas.size());

		for (String fruta : frutas) {
			System.out.println(fruta);
		}
	}

}
