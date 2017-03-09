package br.com.tt;

public class Sistema {

	public static void main(String[] args) {
		String[] nomes = new String[10];
		System.out.println(nomes[6]);
		System.out.println(nomes[1]);
		int[] ids = new int[10];
		System.out.println(ids[1]);

		nomes[0] = "Maria";
		ids[0] = 1582;
		nomes[5] = "Juca";

		for (String nome : nomes) {
			if(nome != null) {
			System.out.println("Nome: " + nome);
			}
		}
	}
}
