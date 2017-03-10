package br.com.tt;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapa_1 {

	public static void main(String[] args) {
		Map<Integer, String> nomes = new HashMap<>();

		nomes.put(1, "Maria");
		nomes.put(-4, "Pedro");
		nomes.put(-4, "Ana");
		nomes.put(null, "Carlos");
		nomes.put(5, null);
		nomes.put(9, null);
		nomes.put(11, "Rita");
		nomes.put(12, "Rita");

		System.out.println("Qtd: " + nomes.size());
		Set<Entry<Integer, String>> entrySet = nomes.entrySet();

		for (Map.Entry<Integer, String> nome : entrySet) {
			Integer key = nome.getKey();
			String value = nome.getValue();
			System.out.println(key + " - " + value);
		}
		
		System.out.println("\nJava 8");
		nomes.forEach((k, v) -> System.out.println(k + " - " + v));
	}

}
