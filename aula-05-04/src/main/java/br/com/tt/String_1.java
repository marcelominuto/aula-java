package br.com.tt;

public class String_1 {
	public static void main(String[] args) {
		String nome = "maria Silva Costa";
		nome = nome.toUpperCase();
		System.out.println("TOUPPERCASE" + nome);
		nome = nome.toLowerCase();
		System.out.println("toLowercase" + nome);

		int length = nome.length();
		System.out.println("Comprimento: " + length);

		boolean inicia = nome.startsWith("maria");
		System.out.println("Inicia com maria: " + inicia);

		boolean finaliza = nome.startsWith("Costa");
		System.out.println("Finaliza com costa: " + finaliza);

		int indexOf = nome.indexOf("i");
		System.out.println("Posição do i: " + indexOf);

		String ultimo = nome.substring(11);
		System.out.println("Ultimo: " + ultimo);

		String primeiro = nome.substring(0, 5);
		System.out.println("primeiro: " + primeiro);
		String data = "08/03/2017";
		String[] split = data.split("/");
		for (String val : split) {
			System.out.println(val);
		}
		String novaData = data.replace("/", " - ");
		System.out.println(novaData);

	}
}
