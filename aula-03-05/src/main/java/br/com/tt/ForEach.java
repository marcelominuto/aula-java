package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("Maria");
		nomes.add("Lucas");
		nomes.add("Pedro");
		nomes.add("Ana");
		nomes.add("Fabiana");
		StringBuilder sb = new StringBuilder();
		for(String nome : nomes){
			sb.append(nome + ", ");
		}
		String listaDeNomes = sb.toString();
		System.out.println(listaDeNomes);
	}

}
