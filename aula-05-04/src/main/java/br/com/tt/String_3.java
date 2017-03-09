package br.com.tt;

public class String_3 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Iniciar st ");
		sb.append("Ola ").append("Pois ").append("Se ");
		System.out.println(sb);
		System.out.println(sb.toString().toUpperCase());
		System.out.println(sb.reverse());

	}
}
