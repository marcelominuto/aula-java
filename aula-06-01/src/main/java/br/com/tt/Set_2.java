package br.com.tt;

import java.util.Set;
import java.util.TreeSet;

public class Set_2 {

	public static void main(String[] args) {
		Set<String> frutas = new TreeSet<>();
		frutas.add("Laranja");
		frutas.add("Maçã");
		frutas.add("Uva");
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("Uva");
		frutas.add("Banana");
		frutas.add("Laranja");
		System.out.println("Qtd: " + frutas.size());

		for (String fruta : frutas) {
			System.out.println(fruta);
		}
	}

}
